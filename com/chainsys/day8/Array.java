package com.chainsys.day8;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Enter the mail Count: ");
	 int count = sc.nextInt();
	 String email[] = new String[count];
	 System.out.println("Enter the mail id: ");
	 
	 
	 for(int i=0; i<email.length; i++)
	 {
		  email[i] = sc.next();
	 }
	 for(int i=0; i<email.length; i++)
	 {
		  System.out.println(email[i]);
	 }
	 
	 
	
	 
	 
	}

}
