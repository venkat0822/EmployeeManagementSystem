package com.system.EmployeeManagement.Exceptions;

public class InvalidUserCredException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public InvalidUserCredException(String message) {
		
		super(message);
		
	}

}
