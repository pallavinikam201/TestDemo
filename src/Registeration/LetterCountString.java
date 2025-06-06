package Registeration;

public class LetterCountString {

	public static void main(String[] args) {
		String str="This is A Apple with An A";
		int count=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='A')
			{
				count++;
			}
			
		}
		
		System.out.println("Total Count of A are: " +count);
	}

}
