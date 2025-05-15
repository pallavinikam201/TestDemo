package test2;

import java.util.Scanner;

public class stringReverse {

	public static void main(String[] args) {
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string to be reversed");
		str=sc.next();
		
		System.out.println("Reversed string is as below:");
		
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
		
	}

}
