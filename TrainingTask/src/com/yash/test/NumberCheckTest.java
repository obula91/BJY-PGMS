package com.yash.test;

import com.yash.NumberCheck;

public class NumberCheckTest {

	public static void main(String[] args) {
		NumberCheck isEven=(n)->{
			if(n%2==0) {
				System.out.println("even number");
			}
			else {
				System.out.println("The number is not even");
			}
			};
			isEven.checkNumber(22);
			
			NumberCheck isOdd=(n)->{
				if(n%2!=0) {
					System.out.println("entered number is o");
				}
				else {
					System.out.println("entered number is not o");
				}
				};
				isEven.checkNumber(22);
			NumberCheck numberCheck=(n)->{
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
			numberCheck.checkNumber(121);
	}
}
