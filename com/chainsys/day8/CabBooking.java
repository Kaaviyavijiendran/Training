package com.chainsys.day8;

import java.util.Random;
import java.util.Scanner;

public class CabBooking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to Fast Cab Service!");
		Scanner sc = new Scanner(System.in);
		String ans;

		
		do {
			System.out.println("\n Choose your type of vehicle to travel: ");
			System.out.println("Choose 1 for Bike");
			System.out.println("Choose 2 for Auto");
			System.out.println("Choose 3 for Car");
			int type = sc.nextInt();

		
			String result;
			switch (type) {
			case 1: {
				System.out.print("You choose Bike plz enter your destination in km from your location: ");
				int km = sc.nextInt();
				int bike = km * 12;
				System.out.println("you have pay rs : " + km * 12);
				System.out.println("you have to confirm your cab booking: ");
			     result =sc.next();
				if(result.equals("yes"))
				{
					System.out.println("Cab is booked!");
				}
				else
					System.out.println("booking cancelled!");
				break;
			}
			
			
			case 2: {
				System.out.print("You choose Auto plz enter your destination in km from your location: ");
				int km1 = sc.nextInt();
				int auto = km1 * 20;
				System.out.println("you have pay rs : " + km1 * 20);
				System.out.println("you have to confirm your cab booking: ");
			    result =sc.next();
				if(result.equals("yes"))
				{
					Random rn = new Random();
					int otp = rn.nextInt();
					
					System.out.println("Cab is booked!" + otp );
				}
				else
					System.out.println("booking cancelled!");
				break;
				
				
			}

			case 3: {
				System.out.print("You choose Car plz enter your destination in km from your location: ");
				int km2 = sc.nextInt();
				int auto = km2 * 30;
				System.out.println("you have pay rs : " + km2 * 30);
				System.out.println("you have to confirm your cab booking: ");
			    result =sc.next();
				if(result.equals("yes"))
				{
					System.out.println("Cab is booked!");
				}
				else
					System.out.println("booking cancelled!");
				break;
				
				
			}

			default: {
				System.out.println("Not available at the moment!");
				break;
			}
			}
			
			System.out.println("Do you want continue: yes/no? : ");
			ans = sc.next();
		}

		while (ans.equals("yes"));

	}
}
