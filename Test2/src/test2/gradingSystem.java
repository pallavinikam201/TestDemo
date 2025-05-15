package test2;

import java.util.Scanner;

public class gradingSystem {

	public static void main(String[] args) {
		int percentage;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your percentage");
		percentage=sc.nextInt();
		
		if(percentage>0 && percentage<35)
		{
			System.out.println("You are fail");
		}
		
		else if(percentage>=35 && percentage<60)
		{
			System.out.println("You are Pass with second class");
		}
		else if(percentage>=60 && percentage<75)
		{
			System.out.println("You are Pass with first class");
		}
		
		else if(percentage>=75 && percentage<=100)
		{
			System.out.println("You are Pass with Distinction class");
		}
		else 
		{
			System.out.println("Please enter valid percentage");
		}
		
	}

}
