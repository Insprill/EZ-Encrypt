package net.insprill.ezencrypt.exceptions;

import java.security.GeneralSecurityException;

public class DecryptionFailedException extends GeneralSecurityException {

    /**
     * Constructs an DecryptionFailedException with the specified
     * detail message.
     *
     * @param msg the detail message.
     * @since 1.0.0
     */
    public DecryptionFailedException(String msg) {
        super(msg);
    }

    /**
     * Creates a DecryptionFailedException with the specified
     * detail message and cause.
     *
     * @param msg   the detail message (which is saved for later retrieval
     *              by the {@link #getMessage()} method).
     * @param cause the cause (which is saved for later retrieval by the
     *              {@link #getCause()} method).  (A {@code null} value is permitted,
     *              and indicates that the cause is nonexistent or unknown.)
     * @since 1.0.0
     */
    public DecryptionFailedException(String msg, Throwable cause) {
        super(msg, cause);
    }

}
