package com.lavgorush.germes.app.ifra.exception;

import com.lavgorush.germes.app.ifra.exception.base.AppException;

/**
 * Signals about exception cases in the work of services and API
 *
 * @author Lavgorush
 */
public class CommunicationException extends AppException {

    private static final long serialVersionUID = -2850898723336164866L;

    public CommunicationException(String message) {
        super(message);
    }

    public CommunicationException(String message, Throwable cause) {
        super(message, cause);
    }
}
