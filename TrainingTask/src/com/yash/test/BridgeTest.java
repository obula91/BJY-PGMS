package com.yash.test;

import com.yash.Bridge;

public class BridgeTest {

	public static void main(String[] args) {
		Bridge b=(n)->{
			for (int i = 0; i < n; i++)
	        {
	            for (int j = 'A'; j < 'A' + (2 * n) - 1; j++)
	            {
	              if (j >= ('A' + n - 1) + i)
	                System.out.print((char)(('A' + n - 1) -
	                                 (j % ('A' + n - 1))));
	                else if (j <= ('A' + n - 1) - i)
	                    System.out.print((char)j);
	                else
	                    System.out.print(" ");
	            }
	            System.out.println();
	        }
		};
		
		b.Bridge(8);
	}
}
