package com.lavgorush.germes.app.infra.exception;

import com.lavgorush.germes.app.infra.exception.base.AppException;

/**
 * Signals about exceptional cases in the application logic
 *
 * @author Lavgorush
 */
public class FlowException extends AppException {
    public static final long serialVersionUID = -2889607185988464072L;

    public FlowException(String message) {
        super(message);
    }

    public FlowException(String message, Throwable cause) {
        super(message, cause);
    }
}
