package com.yash.tdd_assignments.primefactor;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {

	

	/*
	 * public int getPrimeFactors(int input) {
	 * 
	 * if(input%1==0) { return 0; }else if(input%input==0) { return 0;} return 1; }
	 */
	public List<Integer> getPrimeFactors(int number) {
	      List<Integer> list=new ArrayList<>();
	      for(int i = 2; i< number; i++) {
	         while(number%i == 0) {
	            list.add(i);
	            number = number/i;
	         
	         }
	      }
	      if(number >2) {
	    	  list.add(number);
	         return list;
	      }
		return list;
	}
	
}
