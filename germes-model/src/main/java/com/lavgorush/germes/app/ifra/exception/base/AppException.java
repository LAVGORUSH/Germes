package com.lavgorush.germes.app.ifra.exception.base;

/**
 * Base exception for all application-specific exceptions
 *
 * @author Lavgorush
 */
public class AppException extends RuntimeException {
    public static final long serialVersionUID = 7837501112802868980L;

    public AppException(String message) {
        super(message);
    }

    public AppException(String message, Throwable cause) {
        super(message, cause);
    }
}
