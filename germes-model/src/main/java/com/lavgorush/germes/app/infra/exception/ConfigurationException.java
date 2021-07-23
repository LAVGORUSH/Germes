package com.lavgorush.germes.app.infra.exception;

import com.lavgorush.germes.app.infra.exception.base.AppException;

/**
 * Signals about incorrect configuration setting/parameters
 *
 * @author Lavgoorush
 */
public class ConfigurationException extends AppException {

	private static final long serialVersionUID = -2177284893894040026L;

	public ConfigurationException(String message) {
		super(message);
	}

	public ConfigurationException(String message, Throwable cause) {
		super(message, cause);
	}

	public ConfigurationException(Throwable cause) {
		super(cause);
	}
}
