package com.revature.exception;

import java.util.stream.Stream;

/*
 * [A] Lesson: Exceptions
 * [1] Exceptions VS Errors
 * 		[a] Exceptions: 
 * 			- Checked: Checked  --> (https://youtu.be/jWQbHE0lC2I)
 * 			- Unchecked: Runtime exception --> (https://www.youtube.com/watch?v=8WTVLa1Xtsk&list=PLsyeobzWxl7rS9B2K1l--VDpCn41gijnV)
 * 		[a.1] Types:
 * 				1) Exception
 * 				2) RuntimeException
 * 					- NullPointerException
 * 					- IndexOutOfBoundsException
 * 					- ArrayIndexOutOfBoundsException
 * 				3) IOException : (Input/Output Stream)
 * 					- InterruptedIOException : 
 * 					- FileNotFoundException
 * 				4) SQLException
 * 				5) InterruptedException
 *     [b] Errors:
 *     [b.1] Types 
 *			- StackOverflowError
 * 			- OutOfMemoryError 
 *  
 * [2] Exceptions Commands: 
 *     - throws:  Methods
 *     - try
 *     - catch
 *     - finally
 * - Other terms
 * 	- throwable
 * 
 */

public class AIExceptions{
	
	
	public static void main(String[] arg) {
		
		try {
			
	        int a[] = new int[2];
	        System.out.println("Access element three :" + a[1]);
	        
	     } catch (ArrayIndexOutOfBoundsException e) {
	        System.out.println("Exception thrown  :" + e);
	     } finally {
	    	 System.out.println("Testing ArrayIndexOutOfBoundsException");
	     }

	}
	//Stream in;
	
	
}

