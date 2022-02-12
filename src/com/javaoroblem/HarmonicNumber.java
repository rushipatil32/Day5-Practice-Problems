package com.javaoroblem;

import java.util.Scanner;

public class HarmonicNumber {
	
	public static void main(String[] args) {
		System.out.print("Enter any number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("The Harmonic Number is : ");
		double result = 0;
		while(num > 0)
		{
			result = result + (double) 1 / num;
			num--;
			System.out.println(result +"  ");
		}
		System.out.println("");
		System.out.println("Output of Harmonic Series is "+result);
		sc.close();
	}

}
