package com.yash.one;

import java.util.Arrays;


public class PalindromeTest {

	public static void main(String[] args) {
		
		
			String number = "121";
			char ch[] = number.toCharArray();
			char temp[] = new char[number.length()];

			Palindrome palindrome=()->{
				int j = 0;
				for (int i = ch.length - 1; i >= 0; i--) {
					temp[j++] = ch[i];
				}
				if (Arrays.equals(ch, temp)) {
					System.out.println("Enter number is palindrom");
				} else {
					System.out.println("Enter number is not palindrom");
				}
		};
		
		palindrome.isPalindrome();
	}
}
