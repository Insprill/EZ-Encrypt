package net.insprill.ezencrypt.aes;

/**
 * This is the length of the key used for encrypting and decrypting the data.
 */
public enum AESKeyLength {
    /**
     * Uses a 128-bit key for encrypting data.
     */
    AES_128(128),
    /**
     * Uses a 192-bit key for encrypting data.
     */
    AES_192(192),
    /**
     * Uses a 256-bit key for encrypting data.
     */
    AES_256(256);

    /**
     * Bit-length.
     */
    public final int length;

    AESKeyLength(int length) {
        this.length = length;
    }

}
