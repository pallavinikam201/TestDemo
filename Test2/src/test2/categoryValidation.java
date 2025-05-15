package test2;

import java.util.Scanner;

public class categoryValidation {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String caste;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter your caste");
		caste=sc.next();
		
		if(caste.equals("NT"))
		{
			System.out.println("You are eligible for 20% reservation");
		}
		else if(caste.equals("OBC"))
		{
			System.out.println("You are eligible for 10% reservation");
		}
		else if(caste.equals("SC"))
		{
			System.out.println("You are eligible for 30% reservation");
		}
		else if(caste.equals("Open"))
		{
			System.out.println("You are not eligible for reservation");
		}
		
		else
		{
			System.out.println("Please enter valid input");
		}
	}

}
