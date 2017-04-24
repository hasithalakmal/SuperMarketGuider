package com.smile24es.ts_project.utill;

import org.springframework.http.HttpStatus;

/**
 * Exception to handle error scenarios in Permission API
 *
 * @author Buddhika Karunatilleke
 * on 2/15/17.
 */
public class TS_ProjectApiException extends RuntimeException{

    private final HttpStatus httpStatusCode;
    private final String errorCode;

    public TS_ProjectApiException(HttpStatus httpStatusCode, String errorCode, String message, Throwable t) {
        super(message, t);
        this.errorCode = errorCode;
        this.httpStatusCode = httpStatusCode;
    }

    public TS_ProjectApiException(HttpStatus httpStatusCode, String errorCode, String message) {
        this(httpStatusCode,errorCode, message, null);
    }

    public String getErrorCode() {
        return errorCode;
    }

    public HttpStatus getHttpStatusCode() {
        return httpStatusCode;
    }
}
