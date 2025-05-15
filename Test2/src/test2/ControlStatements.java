package test2;

public class ControlStatements {

	public static void main(String[] args) {
		int age=20;
		if(age>=18) {
			System.out.println("You are eligible for marriage");
		}
		else {
			System.out.println("You are not eligible for marriage");
		}
		
		int totalIncome=500000;
		if(totalIncome>700000)
		{
			System.out.println("You are eligible for Tax");
		}
		else {
			System.out.println("You are not eligible for Tax");
		}
		
		
		int votingAge=25;
		if(votingAge>=18)
		{
			System.out.println("Congratulations!!! you have voting rights");
		}
		
		else {
			System.out.println("Sorry... Try next time");
		}
	}

}
