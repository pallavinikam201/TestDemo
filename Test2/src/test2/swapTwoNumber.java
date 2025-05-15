package test2;

import java.util.Scanner;

public class swapTwoNumber {

	public static void main(String[] args) {
		int a, b;
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter first number");
		a=sc.nextInt();
		
		System.out.println("please enter second number");
		b=sc.nextInt();
		
		b=a+b;
		a=b-a;
		b=b-a;
		
		System.out.println("Value of first number: " + a);
		System.out.println("Value of second number: " + b);

	}

}
