import net.insprill.ezencrypt.aes.AES;
import net.insprill.ezencrypt.aes.AESSettings;
import net.insprill.ezencrypt.exceptions.DecryptionFailedException;
import net.insprill.ezencrypt.exceptions.EncryptionFailedException;
import org.junit.Test;

import java.security.SecureRandom;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class AESTest {

    private static final String PASSWORD = "ThisIsAPassword12345";

    @Test
    public void testByteArrayEncryption() throws EncryptionFailedException, DecryptionFailedException {
        AESSettings settings = new AESSettings();

        byte[] bytes = new byte[32];
        new SecureRandom().nextBytes(bytes);

        byte[] encrypted = AES.encrypt(bytes, settings, PASSWORD);
        byte[] decrypted = AES.decrypt(encrypted, settings, PASSWORD);

        assertArrayEquals(bytes, decrypted);
    }

    @Test
    public void testBase64Encryption() throws EncryptionFailedException, DecryptionFailedException {
        AESSettings settings = new AESSettings();

        String data = "This string is used to test that Base64 encryption is working properly";

        String encrypted = AES.encryptToBase64(data, settings, PASSWORD);
        String decrypted = AES.decryptFromBase64(encrypted, settings, PASSWORD);

        assertEquals(data, decrypted);
    }

}
