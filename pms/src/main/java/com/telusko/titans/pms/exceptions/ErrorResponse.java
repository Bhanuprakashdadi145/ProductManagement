package com.telusko.titans.pms.exceptions;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
@Getter
@AllArgsConstructor
public class ErrorResponse {
	    private int status;
	    private String message;
	    private LocalDateTime timestamp;
	}


