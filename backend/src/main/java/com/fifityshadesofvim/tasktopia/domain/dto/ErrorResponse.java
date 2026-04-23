package com.fifityshadesofvim.tasktopia.domain.dto;

public record ErrorResponse(
        int status,
        String message,
        String details
) {
}
