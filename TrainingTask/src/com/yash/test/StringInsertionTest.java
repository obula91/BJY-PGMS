package com.yash.test;

import com.yash.StringInsertion;

public class StringInsertionTest {
	
	

	public static void main(String[] args) {
		
		StringInsertion stringInsertion=(originalString,stringToBeInserted,index)->{
			
			String newString = new String();
			  
	        for (int i = 0; i < originalString.length(); i++) {
	            newString =newString+ originalString.charAt(i);
	            if (i == index) {
	                newString =newString+ stringToBeInserted;
	            }
	        }
	        System.out.println(newString);
	        newString=null;
	       
		};
		
		stringInsertion.insertString("obula", "Reddy", 2);
		
	}
}
