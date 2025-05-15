package test2;

public class StringMethods {

	public static void main(String[] args) {

		String CountryName="India";
		String StateName="Maharashtra";
		String Nationality="india";
		
		System.out.println(CountryName.startsWith("I"));
		System.out.println(StateName.endsWith("a"));
		System.out.println(Nationality.contains("dia"));

		System.out.println(StateName.toLowerCase());
		System.out.println(Nationality.toUpperCase());
		
		System.out.println(CountryName.equals(Nationality));
		System.out.println(StateName.replace("M", "m"));
		System.out.println(Nationality.length());
		
	}

}
