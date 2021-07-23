package com.lavgorush.germes.app.infra.exception.base;

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

	public AppException(Throwable cause) {
		super(cause);
	}
}
