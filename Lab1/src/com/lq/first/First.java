/**
 * 
 */
package com.lq.first;

import java.util.Scanner;

/**
 * @author Student
 *
 */
public class First {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 30;
		
		int y = 15;
		
		Scanner scn = new Scanner( System.in );
			x = scn.nextInt();
		
		/* if ( x < y ) {
			
			System.out.println( " X is g " );
			
		}
		else {
			
			System.out.println(" X is less ");
			
		} */
		
			if ( x==1 ) {
				System.out.println("John");
			}
			else if ( x==2 ) {
				System.out.println("Jane");
			}
			else if ( x==3 ) {
				System.out.println("Sarah");
			}
			else if ( x==4 || x==5 ) {
				System.out.println("Goodbye");
			}
			else if ( x==10 && y==15 ) {
				System.out.println("Impossible");
			}
			else {
				System.out.println("Tim");
			}
			
			
			switch ( x ) {
			
			case 1:
				System.out.println("John");
				break;
				
			case 2:
				System.out.println("Jane");
				break;
			
			case 3:
				System.out.println("Sarah");
				break;
				
			case 4:
			case 5:
				System.out.println("Good bye");
				break;
			
			case 6:
				System.out.println("Hello");
				break;
			
			default:
				System.out.println("last case");
			}
			
			
			
	}

}
