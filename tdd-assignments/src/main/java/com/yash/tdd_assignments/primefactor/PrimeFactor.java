package com.yash.tdd_assignments.primefactor;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {

	

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
	
	public static boolean getPrimeFactors1(int number) {
	      List<Integer> list=new ArrayList<>();
	      for(int i = 2; i< number; i++) {
	         while(number%i == 0) {
	            list.add(i);
	            number = number/i;
	         
	         }
	      }
	      if(number >2) {
	    	  list.add(number);
	    	  
	         return list.containsAll(list);
	         
	      }
	   
		return list.containsAll(list);
	}
	
	
}
