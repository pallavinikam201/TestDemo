package Registeration;

public class WrapperClass {

	public static void main(String[] args) {
		int i=10;
		String str="15";
		
		int ii=Integer.parseInt(str);
		int add=i+ii;
		System.out.println(add);
		
		String str2=String.valueOf(i);
		System.out.println(str2);
		
		Integer j=new Integer(90);
		System.out.println(j.compareTo(i));
		System.out.println(j.parseInt(str2));
		
	}

}
