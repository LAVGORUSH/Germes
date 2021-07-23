package com.lavgorush.germes.app.infra.exception.flow;

import com.lavgorush.germes.app.infra.exception.FlowException;

/**
 * Signals that incorrect parameter was passed to method/constructor
 * @author Lavgorush
 */
public class InvalidParameterException extends FlowException {
    private static final long serialVersionUID = 4990959228756992926L;

    public InvalidParameterException(String message) {
        super(message);
    }
}
