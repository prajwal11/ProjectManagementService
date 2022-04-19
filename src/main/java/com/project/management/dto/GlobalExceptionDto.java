package com.project.management.dto;

import lombok.Data;

@Data
public class GlobalExceptionDto {

    private String reason;
    private String resultCode;
    private String incorrectFields;

    public GlobalExceptionDto() {}

    public GlobalExceptionDto(String reason, String resultCode, String incorrectFields) {
        this.reason = reason;
        this.resultCode = resultCode;
        this.incorrectFields = incorrectFields;
    }
}