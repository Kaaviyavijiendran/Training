package com.chainsys.day8;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rollNo = {2,6,8,9,6};
		for (int i =0; i<=6; i++) {
			System.out.println(rollNo[i]);
		}
		try {
			for( i =0; i<=7; i++) {
				System.out.println(rollNo[i]);
			}
			}
			catch (ArithmeticException){
				System.out.println(ae.getMessage());
		}
		catch (ArrayIndexOutofBoundsException arr) {
			System.out.println(arr.getMessage());
	}
	
		catch (NullPointerExceotion arr) {
			System.out.println(arr.getMessage());
	}
	catch (Exception e) {
		System.out.println(e.getMessage());
	}
	}

}
