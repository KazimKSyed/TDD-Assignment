package com.yash.tdd.exceptions;

public class PrincipalAmountNotValidException extends RuntimeException {
	
	private String msg;

	public PrincipalAmountNotValidException(String msg) {
		super();
		this.msg = msg;
	}

}