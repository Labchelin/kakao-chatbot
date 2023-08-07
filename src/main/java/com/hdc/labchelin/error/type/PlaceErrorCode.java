package com.hdc.labchelin.error.type;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum PlaceErrorCode {
    PlaceErrorExample(HttpStatus.BAD_REQUEST, "example");

    private final HttpStatus statusCode;
    private final String errorMessage;
}
