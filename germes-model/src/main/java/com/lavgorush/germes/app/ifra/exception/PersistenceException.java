package com.lavgorush.germes.app.ifra.exception;

import com.lavgorush.germes.app.ifra.exception.base.AppException;

/**
 * Signals about data access layer unexpected situations
 *
 * @author Lavgorush
 */
public class PersistenceException extends AppException {

    private static final long serialVersionUID = -7889716045779735512L;

    public PersistenceException(String message) {
        super(message);
    }

    public PersistenceException(String message, Throwable cause) {
        super(message, cause);
    }
}
