package com.yash.tdd.simpleinterest;

import com.yash.tdd.exceptions.PrincipalAmountNotValidException;
import com.yash.tdd.exceptions.RateNotValidException;
import com.yash.tdd.exceptions.TimePeriodNotValidException;

public class SimpleInterest {

	public Double calculateSimpleInterest(Integer principal,Double time,Double rate) {
		if(principal==null||time==null||rate==null) {
			throw new NullPointerException();
		}else if(principal==0) {
			throw new PrincipalAmountNotValidException("Principal Amount Should Not Be Zero !");
		
		}else if(time==0 ||time>30) {
			throw new TimePeriodNotValidException("Principal Amount Should Not Be Zero or More than 30 years !");
		
		}else if(rate==0.0||rate>14.0) {
			throw new RateNotValidException("Rate Should Not Be Zero or More Than 14.0% !");
		
		}
		return (principal*time*rate)/100;		
	
	}

}
