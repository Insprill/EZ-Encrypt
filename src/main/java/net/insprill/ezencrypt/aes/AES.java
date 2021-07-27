package net.insprill.ezencrypt.aes;

import net.insprill.ezencrypt.exceptions.DecryptionFailedException;
import net.insprill.ezencrypt.exceptions.EncryptionFailedException;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import java.util.Base64;

/**
 * Main class used for encrypting and decrypting data.
 */
public class AES {

    private static final String CIPHER_SPEC = "AES/GCM/NoPadding";
    private static final String KEYGEN_SPEC = "PBKDF2WithHmacSHA256";

    private static final byte IV_LENGTH = 12;
    private static final int ITERATIONS = 32768;

    private static final SecureRandom random = new SecureRandom();

    /**
     * Encrypts a String to Base64 using the provided settings.
     *
     * @param data     String to encrypt.
     * @param settings Settings to use for encryption.
     * @param password Password to encrypt data with.
     * @return Byte array of the encrypted data.
     * @throws EncryptionFailedException if something went wrong during encryption.
     * @since 1.0.0
     */
    public static String encryptToBase64(String data, AESSettings settings, String password) throws EncryptionFailedException {
        return new String(Base64.getEncoder().encode(encrypt(data.getBytes(settings.getCharset()), settings, password)), settings.getCharset());
    }

    /**
     * Encrypts a byte array using the provided settings.
     *
     * @param data     Data to encrypt.
     * @param settings Settings to use for encryption.
     * @param password Password to encrypt data with.
     * @return Byte array of the encrypted data.
     * @throws EncryptionFailedException if something went wrong during encryption.
     * @since 1.0.0
     */
    public static byte[] encrypt(byte[] data, AESSettings settings, String password) throws EncryptionFailedException {
        byte[] salt = null;
        byte[] iv = null;
        try {
            salt = randomBytes(settings.getSaltLength());
            iv = randomBytes(IV_LENGTH);
            SecretKey key = generateKey(password, settings, salt);

            GCMParameterSpec parameterSpec = new GCMParameterSpec(settings.getAuthKeyLength(), iv);

            Cipher cipher = Cipher.getInstance(CIPHER_SPEC);
            cipher.init(Cipher.ENCRYPT_MODE, key, parameterSpec);

            byte[] encrypted = cipher.doFinal(data);

            ByteArrayOutputStream stream = new ByteArrayOutputStream();

            stream.write(salt);
            stream.write(iv);
            stream.write(encrypted);
            stream.flush();

            return stream.toByteArray();
        } catch (Exception e) {
            throw new EncryptionFailedException(e.getMessage(), e);
        } finally {
            Arrays.fill(salt, (byte) 0);
            Arrays.fill(iv, (byte) 0);
        }
    }

    /**
     * Decrypts a Base64 String using the provided settings.
     *
     * @param encryptedBase64Data String to decrypt.
     * @param settings            Settings to use for decrypting. These settings must be the same as when encrypting!
     * @param password            Password to decrypt data with.
     * @return String of the decrypted data.
     * @throws DecryptionFailedException if something went wrong during decryption like an incorrect password.
     * @since 1.0.0
     */
    public static String decryptFromBase64(String encryptedBase64Data, AESSettings settings, String password) throws DecryptionFailedException {
        return new String(decrypt(Base64.getDecoder().decode(encryptedBase64Data), settings, password), settings.getCharset());
    }

    /**
     * Decrypts a byte array of data using default settings.
     *
     * @param encryptedData Data to decrypt.
     * @param settings      Settings to use for decrypting. These settings must be the same as when encrypting!
     * @param password      Password to decrypt data with.
     * @return String of the decrypted data.
     * @throws DecryptionFailedException if something went wrong during decryption like an incorrect password.
     * @since 1.0.0
     */
    public static byte[] decrypt(byte[] encryptedData, AESSettings settings, String password) throws DecryptionFailedException {
        int length = encryptedData.length - settings.getSaltLength() - IV_LENGTH;
        if (length < 1) {
            throw new DecryptionFailedException("Invalid amount of data");
        }

        byte[] salt = new byte[settings.getSaltLength()];
        byte[] iv = new byte[IV_LENGTH];

        try {
            ByteArrayInputStream stream = new ByteArrayInputStream(encryptedData);

            stream.read(salt);
            stream.read(iv);

            SecretKey key = generateKey(password, settings, salt);

            byte[] data = new byte[length];
            stream.read(data);

            GCMParameterSpec parameterSpec = new GCMParameterSpec(settings.getAuthKeyLength(), iv);

            Cipher cipher = Cipher.getInstance(CIPHER_SPEC);
            cipher.init(Cipher.DECRYPT_MODE, key, parameterSpec);
            return cipher.doFinal(data); // Decrypt and return the data.
        } catch (Exception e) {
            throw new DecryptionFailedException(e.getMessage(), e);
        } finally {
            Arrays.fill(salt, (byte) 0);
            Arrays.fill(iv, (byte) 0);
        }
    }

    /**
     * Generates a {@link SecretKey} from a password, salt, and {@link AESSettings}.
     *
     * @param password Password to generate password from.
     * @param settings Settings to use for generating the key.
     * @param salt     Salt to use when generating the key.
     * @return SecretKey from provided parameters.
     * @since 1.0.0
     */
    private static SecretKey generateKey(String password, AESSettings settings, byte[] salt) {
        SecretKeyFactory factory;
        try {
            factory = SecretKeyFactory.getInstance(KEYGEN_SPEC);
        } catch (NoSuchAlgorithmException impossible) {
            return null;
        }

        PBEKeySpec spec = new PBEKeySpec(password.toCharArray(), salt, ITERATIONS, settings.getKeyLength());
        SecretKey key = null;
        try {
            key = new SecretKeySpec(factory.generateSecret(spec).getEncoded(), "AES");
        } catch (InvalidKeySpecException ignored) { // Impossible.
        }
        spec.clearPassword();

        return key;
    }

    /**
     * Generates a new byte array filled with random bytes of a specific length.
     *
     * @param length Length of the byte array to generate.
     * @return Byte array full of random bytes.
     * @since 1.0.0
     */
    private static byte[] randomBytes(byte length) {
        byte[] salt = new byte[length];
        random.nextBytes(salt);
        return salt;
    }

}
