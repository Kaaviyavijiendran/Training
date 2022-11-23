package com.chainsys.day8;

import java.util.Scanner;

public class GstCalculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("                 ---------------------------------------------------------------------------------------------------");
		System.out.println("                                             WELCOME TO VIVEK SUPERMARKET!");
		System.out.println("      High Quality!                                                                                          Date: 23/11/2022");
		System.out.println("\n Enter your category of purchasing \n 1.Food \n 2.Cloth \n 3.DryFruits");
		int category = sc.nextInt();

		switch (category) {
		case 1:
			System.out.println("\n You choose Food! Enter your Name of the Product \n Pizza \n ChickenBurger \n Shawarma");
			String food = sc.next();
			System.out.println("\n Enter the no of " + food);
			int foodCount = sc.nextInt();

			if ((food.equals("Pizza"))||(food.equals("pizza"))) {
				System.out.println("\nYour purchased product have 12% Gst and the originalPrice is 250");
				int pizzaAmount = 250;
				int totalOfPizza = pizzaAmount * foodCount;
				float gstOfPizza = (totalOfPizza) * 12 / 100; // to calculate 12% of 350
				float billOfPizza = totalOfPizza + gstOfPizza;
				System.out.println("\n Total Amount:" + totalOfPizza);
				System.out.println("\n Bill to Pay with Gst: " + billOfPizza);
				System.out.println("\n Your Coupen Code is: 34578@jik");
				System.out.println("Enter your coupen code: ");
				String ans = sc.next();
				if (ans.equals("34578@jik")) {
					System.out.println("\n You have Rs.100 discount!");
					float totalAmountOfPizza = (billOfPizza - 100);
					System.out.println("\n-------------------------------------------------------------------------------------------------------------------------------------");
					System.out.println("\n                                                         You have pay rs." + totalAmountOfPizza);
				}
				else {
					System.out.println("\n------------------------------------------------------------------------------------------------------------------------------------");
					System.out.println("\n                                                          Your Coupen Code is Invalid! \n You have pay rs. " + billOfPizza);
				
				}
			}
			else if ((food.equals("Chickenburger"))||(food.equals("chickenburger"))) {
				System.out.println("\n Your purchased product have 12% Gst and the originalPrice is 350");
			int chickenBurgerAmount = 350;
			int totalOfChickenBurger = chickenBurgerAmount * foodCount;
			float gstOfChickenBurger = (totalOfChickenBurger) * 12 / 100; // to calculate 12% of 350
			float billOfChickenBurger = totalOfChickenBurger + gstOfChickenBurger;
			System.out.println("\n Total Amount:" + totalOfChickenBurger);
			System.out.println("\n Bill to Pay with Gst :" + billOfChickenBurger);
			System.out.println("\n Your Coupen Code is: 34578@jik");
			System.out.println("Enter your coupen code1: ");
			String ans1 = sc.next();
			if (ans1.equals("34578@jik")) {
				System.out.println("\n You have Rs.100 discount!");
				float totalAmountOfChickenBurger = (billOfChickenBurger - 100);
				System.out.println("\n-------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("                                                                   You have pay rs." + totalAmountOfChickenBurger);
			}

			else {
				System.out.println("\n-------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("                                                                   Your Coupen Code is Invalid! \n  You have pay rs. " + billOfChickenBurger);
			}
			}
		
			else if((food.equals("Shawarma"))||(food.equals("shawarma"))) {
				System.out.println("\n Your purchased product have 12% Gst and the originalPrice is 150");
			int shawarmaAmount = 150;
			int totalOfShawarma = shawarmaAmount * foodCount;
			int gstOfShawarma = (totalOfShawarma) * 12 / 100; // to calculate 12% of 150
			int billOfShawarma = totalOfShawarma + gstOfShawarma;
			System.out.println("\n Total Amount:" + totalOfShawarma);
			System.out.println("\n Bill to Pay with Gst" + billOfShawarma);
			System.out.println("Your Coupen Code is: 34578@jik");
			System.out.println("Enter your coupen code1: ");
			String ans2 = sc.next();
			if (ans2.equals("34578@jik")) {
				System.out.println("\n You have Rs.100 discount!");
			 float totalAmountOfShawarma = (billOfShawarma - 100);
			 System.out.println("\n-------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("                                                You have pay rs." + totalAmountOfShawarma);
			}

			else {
				System.out.println("                                                    Your Coupen Code is Invalid! \n  You have pay rs. " + billOfShawarma);
			} 
			}
			else
			{
				System.out.println("OutofStock");
			}

             break;
	
			
		case 2:
			System.out.println("\n You choose Cloth! Enter your Name of the Product \n Saree \n Shirt \n Jeans");
			String cloth = sc.next();
			System.out.println("\n Enter the no of " + cloth);
			int count2 = sc.nextInt();
			
			if ((cloth.equals("Saree"))||(cloth.equals("saree"))) {
			System.out.println("\n Your purchased product have 15% Gst and the originalPrice is 1500");
			int amountOfSaree = 1500;
			int totalOfSaree = amountOfSaree * count2;
			int gstOfSaree = (totalOfSaree) * 15 / 100; // to calculate 15% of 1500
			int billOfSaree = totalOfSaree + gstOfSaree; // to calculate
			System.out.println("\n Total Amount:" + totalOfSaree);
			System.out.println("\n Bill to Pay with Gst" + billOfSaree);
			System.out.println("\n Your Coupen Code is: 34578@jik");
			System.out.println("Enter your coupen code: ");
			String ans2 = sc.next();
			if (ans2.equals("34578@jik")) {
				System.out.println("You have Rs.100 discount!");
				float totalAmountOfSaree = (billOfSaree - 100);
				System.out.println("\n-------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("                                                     You have pay rs." + totalAmountOfSaree);
			}

			else {
				System.out.println("                          Your Coupen Code is Invalid! \n  You have pay rs. " + billOfSaree);
			}
			}
			
			else if((cloth.equals("Shirt"))||(cloth.equals("shirt"))) {
				System.out.println("Your purchased product have 15% Gst and the originalPrice is 500");
			int shirtAmount = 500;
			int totalOfShirt = shirtAmount * count2;
			int gstOfShirt = (totalOfShirt) * 15 / 100; // to calculate 15% of 500
			int billOfShirt = totalOfShirt + gstOfShirt;
			System.out.println("Total Amount:" + totalOfShirt);
			System.out.println("Bill to Pay with Gst" + billOfShirt);
			System.out.println("Your Coupen Code is: 34578@jik");
			System.out.println("Enter your coupen code1: ");
			String ans2 = sc.next();
			if (ans2.equals("34578@jik")) {
				System.out.println("You have Rs.100 discount!");
				float totalAmountOfShirt = (billOfShirt - 100);
				System.out.println("\n-------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("                                                  You have pay rs." + totalAmountOfShirt);
			}

			else {
				System.out.println("                           Your Coupen Code is Invalid! \n You have pay rs. " + billOfShirt);
			}
			}
		
			else if ((cloth.equals("Jeans"))||(cloth.equals("jeans"))) {
				System.out.println("Your purchased product have 12% Gst and the originalPrice is 850");
			int jeansAmount = 850;
			int totalOfJeans = jeansAmount * count2;
			int gstOfJeans = (totalOfJeans) * 12 / 100; // to calculate 12% of 850
			int billOfJeans = totalOfJeans + gstOfJeans;
			System.out.println("Total Amount:" + totalOfJeans);
			System.out.println("Bill to Pay with Gst" + billOfJeans);
			System.out.println("Your Coupen Code is: 34578@jik");
			System.out.println("Enter your coupen code1: ");
			String ans2 = sc.next();
			if (ans2.equals("34578@jik")) {
				System.out.println("You have Rs.100 discount!");
				float totalAmountOfJeans = (billOfJeans - 100);
				System.out.println("\n-------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("                                               You have pay rs." + totalAmountOfJeans);
			}

			else {
				System.out.println("                            Your Coupen Code is Invalid! \n You have pay rs. " + billOfJeans);
			}
			}
			else
			{
				System.out.println("OutofStock");
			}
             break;
			
	case 3:
	System.out.println("You choose DryFruits! Enter your Name of the Product \n Nuts \n Almonds \n DryGraphes");
	String dryFruits = sc.next();
	System.out.println("\n Enter the packet of (1/2)kg " + dryFruits);
	int count3 = sc.nextInt();

	if((dryFruits.equals("Nuts"))||(dryFruits.equals("nuts")))
	{
		System.out.println("Your purchased product have 10% Gst and the originalPrice is 450");
		int nutsAmount = 450;
		int totalOfNuts = nutsAmount * count3;
		int gstOfNuts = (totalOfNuts) * 14 / 100; // to calculate 14% of 450
		int billOfNuts = totalOfNuts + gstOfNuts; 
		System.out.println("Total Amount:" + totalOfNuts);
		System.out.println("Bill to Pay with Gst" + billOfNuts);
		System.out.println("\n Your Coupen Code is: 34578@jik");// to calculate
		System.out.println("Enter your coupen code2: ");
		String ans3 = sc.next();
		if (ans3.equals("34578@jik")) {
			System.out.println("You have Rs.100 discount!");
			float totalAmountOfNuts = (billOfNuts - 100);
			System.out.println("\n-------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("                                                                     You have pay rs." + totalAmountOfNuts);
		}

		else {
			System.out.println("                             Your Coupen Code is Invalid! \n You have pay rs. " + billOfNuts);
		}
	}

	else if((dryFruits.equals("Almonds"))||(dryFruits.equals("almonds")))
	{
				System.out.println("Your purchased product have 15% Gst and the originalPrice is 400");
			int almondsAmount = 400;
			int totalOfAlmonds = almondsAmount * count3;
			int gstOfAlmonds = (totalOfAlmonds) * 10 / 100; // to calculate 10% of 20
			int billOfAlmonds = totalOfAlmonds + gstOfAlmonds;
			System.out.println("Total Amount:" + totalOfAlmonds);
			System.out.println("Bill to Pay with Gst" + billOfAlmonds);
			System.out.println("Your Coupen Code is: 34578@jik");
			System.out.println("Enter your coupen code3: ");
			String ans3 = sc.next();
			if (ans3.equals("34578@jik")) {
				System.out.println("You have Rs.100 discount!");
				float totalAmountOfAlmonds = (billOfAlmonds - 100);
				System.out.println("\n-------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("                                                     You have pay rs." + totalAmountOfAlmonds);
			}

			else {
				System.out.println("                            Your Coupen Code is Invalid! \n You have pay rs. " + billOfAlmonds);
			}
			}
		
			else if ((dryFruits.equals("DryGraphes"))||(dryFruits.equals("drygraphes"))) {
				System.out.println("Your purchased product have 14% Gst and the originalPrice is 300");
			int dryGraphesAmount = 300;
			int totalOfDryGraphes= dryGraphesAmount * count3;
			int gstOfDryGraphes = (totalOfDryGraphes) * 14 / 100; // to calculate 14% of 10
			int billOfDryGraphes = totalOfDryGraphes+ gstOfDryGraphes;
			System.out.println("Total Amount:" + totalOfDryGraphes);
			System.out.println("Bill to Pay with Gst" + billOfDryGraphes);
			System.out.println("Your Coupen Code is: 34578@jik");
			System.out.println("Enter your coupen code3: ");
			String ans3 = sc.next();
			if (ans3.equals("34578@jik")) {
				System.out.println("You have Rs.100 discount!");
				float totalAmountOfDryGraphes = (billOfDryGraphes - 100);
				System.out.println("\n-------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("                                                            You have pay rs." + totalAmountOfDryGraphes);
			}

			else {
				System.out.println("                       Your Coupen Code is Invalid! \n You have pay rs. " + billOfDryGraphes);
			}
			}
			else
			{
				System.out.println("OutofStock");
			}
             break;
			
			
			
	default:
	{
		System.out.println("Invalid input!");
	}
	break;
}
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("\n                                                       Thankyou! Visit Again!");
	
		
}

}
