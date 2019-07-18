package com.cy.exception;

public class ServiceException extends RuntimeException {
	private static final long serialVersionUID = 5017992768570814074L;
	public ServiceException() {
		super();
	}
	public ServiceException(String message, Throwable cause) {
		super(message, cause);
	}
	public ServiceException(String message) {
		super(message);
	}
	public ServiceException(Throwable cause) {
		super(cause);
	}
}
