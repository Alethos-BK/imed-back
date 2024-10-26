package com.unifeso.Imed.interceptor;

import lombok.*;

@Getter
public enum ErrorEnum {
    GENERIC_ERROR("0001", "We are having problems at the moment, please try later."),
    SPECIFIC_ERROR("0002", "This is a specific error.");

    private ErrorDTO errorDTO;

    ErrorEnum(String code, String message) {
        errorDTO = new ErrorDTO(code, message);
    }
}
