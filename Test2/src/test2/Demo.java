package test2;

public class Demo {
	
	int number1= 400;
	int number2=200;
	
	
	public int addition() {
		int additionNumber;
		additionNumber=number1+number2;
		return additionNumber;
	}

	public int substraction() {
		int subNumber;
		subNumber=number1-number2;
		return subNumber;
		
	}
	
	public static void division() {
		
		int divNumber;
		int num1=500;
		int num2=100;
	divNumber=num1/num2;
	System.out.println("division of two number is:" +divNumber);

	}
	
	public int multiplication(int a, int b) {
		int c=a*b;
		return c;
		
	}
	public static void main(String[] args)
	{
		Demo obj=new Demo();
		System.out.println("addition of two number is: "+obj.addition());
		System.out.println("substraction of two number is: "+obj.substraction());
		System.out.println("multiplication of two number is: "+obj.multiplication(5, 10));
		division();
		
	}

}
