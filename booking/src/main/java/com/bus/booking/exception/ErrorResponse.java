package com.bus.booking.exception;

import java.time.LocalDateTime;

import lombok.Data;
@Data
public class ErrorResponse {
	private String message;
	private LocalDateTime localDateTime;
}
