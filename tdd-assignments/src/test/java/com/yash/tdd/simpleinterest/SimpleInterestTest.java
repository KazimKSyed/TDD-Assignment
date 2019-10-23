package com.yash.tdd.simpleinterest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.yash.tdd.exceptions.PrincipalAmountNotValidException;
import com.yash.tdd.exceptions.RateNotValidException;
import com.yash.tdd.exceptions.TimePeriodNotValidException;

public class SimpleInterestTest {

	SimpleInterest si = new SimpleInterest();

	@Test
	public void getSimpleInterest_GivenPTR_ShouldReturnSI() {

		double simple = si.calculateSimpleInterest(110000, 1.0, 13.3);
		assertEquals(14630.00, simple, 1);
	}

	@Test(expected = NullPointerException.class)
	public void getSimpleInterest_GivenPrincipalIsNull_ShouldThrowException(){

		double simple = si.calculateSimpleInterest(null, 1.0, 13.3);
		assertEquals(null, simple, 1);
	}

	@Test(expected = NullPointerException.class)
	public void getSimpleInterest_GivenTimeIsNull_ShouldThrowException() {

		double simple = si.calculateSimpleInterest(null, 1.0, 13.3);
		assertEquals(null, simple, 1);
	}

	@Test(expected = NullPointerException.class)
	public void getSimpleInterest_GivenRateIsNull_ShouldThrowException() {

		double simple = si.calculateSimpleInterest(null, 1.0, 13.3);
		assertEquals(null, simple, 1);
	}

	@Test(expected = PrincipalAmountNotValidException.class)
	public void getSimpleInterest_GivenPrincipal0_ShouldReturnException() {

		double simple = si.calculateSimpleInterest(0, 1.0,15.2);
		assertEquals(0.0, simple, 1);
	}

	@Test(expected = TimePeriodNotValidException.class)
	public void getSimpleInterest_GivenTime0_ShouldThrowException() {

		double simple = si.calculateSimpleInterest(110000, 0.0, 13.3);
		assertEquals(0.0, simple, 1);
	}
	
	@Test(expected = TimePeriodNotValidException.class)
	public void getSimpleInterest_GivenTimeGreaterThan30_ShouldThrowException() {

		double simple = si.calculateSimpleInterest(110000, 31.5, 13.3);
		assertEquals(0.0, simple, 1);
	}

	@Test(expected = RateNotValidException.class)
	public void getSimpleInterest_GivenRate0_ShouldThrowException() {

		double simple = si.calculateSimpleInterest(110000, 1.0, 0.0);
		assertEquals(0.0, simple, 1);
	}
	
	@Test(expected = RateNotValidException.class)
	public void getSimpleInterest_GivenRateGreaterThan14_ShouldReturnException() {

		double simple = si.calculateSimpleInterest(110000, 1.0, 14.96);
		assertEquals(0.0, simple, 1);
	}


	
}
