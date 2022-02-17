package net.insprill.ezencrypt.aes;

/**
 * This is the length of the tag used to authenticate the data before decrypting.
 * If the tag stored in the data and the tag generated when decrypting don't match, an AuthenticationException is thrown.
 */
public enum AESAuthTagLength {
    /**
     * Uses a 96-bit key for data authentication.
     */
    GCM_96(96),
    /**
     * Uses a 104-bit key for data authentication.
     */
    GCM_104(104),
    /**
     * Uses a 112-bit key for data authentication.
     */
    GCM_112(112),
    /**
     * Uses a 120-bit key for data authentication.
     */
    GCM_120(120),
    /**
     * Uses a 128-bit key for data authentication.
     */
    GCM_128(128);

    /**
     * Bit-length.
     */
    public final int length;

    AESAuthTagLength(int length) {
        this.length = length;
    }

}
