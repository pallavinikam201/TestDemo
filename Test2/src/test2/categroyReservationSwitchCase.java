package test2;

import java.util.Scanner;

public class categroyReservationSwitchCase {

	public static void main(String[] args) {
		String caste;
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter your caste");
		caste=sc.next();
		
		switch(caste)
		{
			case "NT":
				System.out.println("You are eligible for 20% reservation");
				break;
				
			case "OBC":
				System.out.println("You are eligible for 10% reservation");
				break;
				
			case "SC":
				System.out.println("You are eligible for 30% reservation");
				break;
				
			case "Open":
				System.out.println("You are not eligible for reservation");
				break;
			default:
				System.out.println("please enter valid catse");
				
		}
		
	}

}
