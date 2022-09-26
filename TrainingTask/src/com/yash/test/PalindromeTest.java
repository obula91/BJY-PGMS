package com.yash.test;

import com.yash.Palindrome;

public class PalindromeTest {

	public static void main(String[] args) {
		
		Palindrome palindrome=(n)->{
			 int r,sum=0,temp; 
			 temp=n;    
			  while(n>0){    
			   r=n%10;  //getting remainder  
			   sum=(sum*10)+r;    
			   n=n/10;    
			  }    
			  if(temp==sum)    
			   System.out.println("palindrome number ");    
			  else    
			   System.out.println("not palindrome");    
				
		};
		
		palindrome.isPalindrome(121);
		
	}
}
