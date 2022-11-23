package com.chainsys.day8;

import java.util.Scanner;

public class EbBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the consumer name: ");
		String name = sc.next();
		String type = null;
		System.out.println("Enter the consumer no: ");
		int num = sc.nextInt();
		int count = 0;

	    while (num != 0) {
	      // num = num/10
	      num =num/ 10;
	      count++;}
	    
	    if(count==10)
	    {
		System.out.println("Enter the typeof consumer Domestic/Commercial: ");
		String type2 = sc.next();
	    

		if (type.equals("Domestic")) {
			System.out.println("\nBelow to 100 units its be free");
			System.out.println("Rs.9 for a unit upto 601 to 800 units");
			System.out.println("Rs.10 for a unit upto 801 to 1000 units");
			System.out.println("Rs.11 for a unit upto 1000 units");

			System.out.println("\n Click enter your consumed electricity: ");
			int consumed = sc.nextInt();

			if (consumed < 100) {
				int value = consumed * 1;
				System.out.println("Your electricity bill charge is !" + value + name + num);
			}

			if ((consumed >= 601) && (consumed <= 800)) {
				int value = consumed * 9;
				System.out.println("Your electricity bill charge is !" + value + name + num);
			}

			if ((consumed >= 801) && (consumed <= 1000)) {
				int value1 = consumed * 10;
				System.out.println("Your electricity bill charge is !" + value1 + name + num);
			}

			if (consumed > 1000) {
				int value2 = consumed * 11;
				System.out.println("Your electricity bill charge is !" + value2 + name + num);
			}
		

		else if (type.equals("Commercial")) {
			System.out.println("\nRs.15 for a unit Below to 100 units");
			System.out.println("Rs.20 for a unit upto 601 to 800 units");
			System.out.println("Rs.25 for a unit upto 801 to 1000 units");
			System.out.println("Rs.32 for a unit upto 1000 units");

			System.out.println("\n Click enter your consumed electricity: ");
			int consumed2 = sc.nextInt();
			
			if (consumed2 < 100) {
				int value = consumed2 * 15;
				System.out.println("Your electricity bill charge is !" + value + name + num);
			}

			if ((consumed2 >= 601) && (consumed2 <= 800)) {
				int value = consumed2 * 20;
				System.out.println("Your electricity bill charge is !" + value + name + num);
			}

			if ((consumed2 >= 801) && (consumed2 <= 1000)) {
				int value1 = consumed2 * 25;
				System.out.println("Your electricity bill charge is !" + value1 + name + num);
			}

			if (consumed2 > 1000) {
				int value2 = consumed2 * 32;
				System.out.println("Your electricity bill charge is !" + value2 + name + num);
			}

		}
		}
		else {
			System.out.println("Invalid credentials");
		}
	}
		else
		{
			System.out.println("Enter 10 digit valid numbers!");
		}


	}
}
