package com.hdc.labchelin.error.exception;

import com.hdc.labchelin.error.type.PlaceErrorCode;
import lombok.Getter;

@Getter
public class PlaceException extends RuntimeException {
    private final PlaceErrorCode errorCode;

    public PlaceException(PlaceErrorCode errorCode) {
        super(errorCode.getErrorMessage());
        this.errorCode = errorCode;
    }
}
