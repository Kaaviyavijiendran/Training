package com.chainsys.day8;

import java.util.Scanner;

public class UsingDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner cal = new Scanner(System.in);
		 String value;
		do
         {
				String add,sub,mul,div;
		
		System.out.println("Enter a num1: ");
		System.out.println("Enter a num2: ");
		int num1 = cal.nextInt();
		int num2 = cal.nextInt();
		
		Scanner op = new Scanner(System.in);
		System.out.println("Enter a operator: ");
		char operator = op.next().charAt(0);
		
		
		if(operator =='+')
		{
			System.out.println("add "+(num1+num2));
		}
		
		else if (operator =='-')
		{
			System.out.println("Sub "+(num1+num2));
		}
		
		else if (operator =='*')
		{
			System.out.println("Mul "+(num1+num2));
		}
		else if (operator =='/')
		{
			System.out.println("Div "+(num1+num2));
		}
		
		
		
		else 
		{
			System.out.println("Invalid Operator");
		}
         
 		System.out.println("Do you want continue: yes/no? : ");
        value = cal.next();
         }
         
		while(value.equals("yes"));

	}	
	}
