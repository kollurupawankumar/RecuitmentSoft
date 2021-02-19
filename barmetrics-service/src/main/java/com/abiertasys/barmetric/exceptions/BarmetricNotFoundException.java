package com.abiertasys.barmetric.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(org.springframework.http.HttpStatus.NOT_FOUND)
public class BarmetricNotFoundException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public BarmetricNotFoundException(String accountNumber) {
		super("No such user: " + accountNumber);
	}
	
}
