package com.yash.tdd.exceptions;

public class RateNotValidException extends RuntimeException {
	private String msg;

	public RateNotValidException(String msg) {
		super();
		this.msg = msg;
	}

}
