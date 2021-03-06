package com.yash.tdd_assignments.primefactor;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class PrimeFactorTest {

	
	/*
	 * Divide the number n by 1 remainder=0 pass.
Divide the number n by n remainder=0 pass.
Divide the number n by 2 remainder!=0 pass.
Divide the number n by up to n-1 and if remainder not equal zero, then it is a prime number
	 * 
	 * */
//	@Test
//	public void getPrimeFactors_GivenNumberDivideBy1_ShouldReturnRemainder0() {
//		PrimeFactor p=new PrimeFactor();
//		int i=p.getPrimeFactors(10);
//		assertEquals(0, i);
//	}
//	
//	@Test
//	public void getPrimeFactors_GivenNumberDivideByItself_ShouldReturnRemainder0() {
//		PrimeFactor p=new PrimeFactor();
//		int i=p.getPrimeFactors(20);
//		assertEquals(0, i);
//	}
//	
//	@Test
//	public void getPrimeFactors_GivenNumberDivide2_ShouldNotReturnRemainder0() {
//		PrimeFactor p=new PrimeFactor();
//		int i=p.getPrimeFactors(20);
//		int j=0;
//		assertEquals(j>0, i);
//	}
	@Test 
	public void getPrimeFactors_Given10_ShouldReturn2and5() {
		PrimeFactor p=new PrimeFactor();
		List<Integer> list=p.getPrimeFactors(12);
		List< Integer> list1= Arrays.asList(2,2,3);
		assertEquals(list1, list);
		
		
	}
	@Test 
	public void getPrimeFactors_Given10_ShouldReturn5and2() {
		PrimeFactor p=new PrimeFactor();
		List<Integer> list=p.getPrimeFactors(12);
		List< Integer> list1= Arrays.asList(3,2,2);
		assertEquals(list1, list);
		
		
	}
	@Test 
	public void getPrimeFactors_Given10_ShouldReturn2and5q() {
		PrimeFactor p=new PrimeFactor();
		boolean result=p.getPrimeFactors1(12);
		List< Integer> list1= Arrays.asList(2,2,3);
		assertEquals(true, result);
		
		
	}
	@Test 
	public void getPrimeFactors_Given10_ShouldReturn5and2q() {
		PrimeFactor p=new PrimeFactor();
		boolean result=p.getPrimeFactors1(12);
		List< Integer> list1= Arrays.asList(3,2,2);
		assertEquals(true,result);
		
		
	}
	
}
