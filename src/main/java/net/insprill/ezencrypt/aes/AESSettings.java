package net.insprill.ezencrypt.aes;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * This class is used to store different settings for encrypting and decrypting data.
 * Note that the same settings (values, not instance) must be used when encrypting and decrypting data!
 */
public class AESSettings {

    private byte saltLength = 16;
    private AESKeyLength keyLength = AESKeyLength.AES_256;
    private AESAuthTagLength authLength = AESAuthTagLength.GCM_128;
    private Charset charset = StandardCharsets.UTF_8;

    /**
     * Sets the salt length.
     *
     * @param saltLength Length of the salt.
     * @since 1.0.0
     */
    public AESSettings setSaltLength(byte saltLength) {
        this.saltLength = saltLength;
        return this;
    }

    /**
     * Sets the length of the encryption key.
     *
     * @param keyLength Key length.
     * @since 1.0.0
     */
    public AESSettings setKeyLength(AESKeyLength keyLength) {
        this.keyLength = keyLength;
        return this;
    }

    /**
     * Sets the length of the authentication key.
     *
     * @param authLength Key length.
     * @since 1.0.0
     */
    public AESSettings setKeyLength(AESAuthTagLength authLength) {
        this.authLength = authLength;
        return this;
    }

    /**
     * Sets the charset used for encrypting/ decrypting.
     *
     * @param charset Charset to use.
     * @since 1.0.0
     */
    public AESSettings setCharset(Charset charset) {
        this.charset = charset;
        return this;
    }

    /**
     * @return The specified salt length, or the default if none has been set.
     * @since 1.0.0
     */
    public byte getSaltLength() {
        return saltLength;
    }

    /**
     * @return The specified key length, or the default if none has been set.
     * @since 1.0.0
     */
    public int getKeyLength() {
        return keyLength.length;
    }

    /**
     * @return The specified key length, or the default if none has been set.
     * @since 1.0.0
     */
    public int getAuthKeyLength() {
        return authLength.length;
    }

    /**
     * @return The specified {@link Charset}, or the default if none has been set.
     * @since 1.0.0
     */
    public Charset getCharset() {
        return charset;
    }

}
