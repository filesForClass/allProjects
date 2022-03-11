/**
 * 
 */

/**
 * @author Student
 *
 */

import java.util.Scanner;

public class whileLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		Scanner scn = new Scanner ( System.in );
		
		int i = scn.nextInt();
		
		
		 while( i>0 ) {
			System.out.print("*");
			i--;
		} 
		
		do {
				
			System.out.print("*");
			i--;
			
		}
		while( i>0 ); */
		
		int[] numbers = {5,10,19,23};
		
		for ( int i = 0; i < numbers.length; i++ ) {
			
			System.out.println( numbers[i] );
			/* System.out.print(i);
			System.out.print("*"); */
		}
	}

}
