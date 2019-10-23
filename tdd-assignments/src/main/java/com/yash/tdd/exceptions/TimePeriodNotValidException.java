package com.yash.tdd.exceptions;

public class TimePeriodNotValidException extends RuntimeException {
	private String msg;

	public TimePeriodNotValidException(String msg) {
		super();
		this.msg = msg;
	}

}
