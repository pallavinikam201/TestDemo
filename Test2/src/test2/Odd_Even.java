package test2;

public class Odd_Even {

	
	int i;
	int num;
	public void checkNumber() {
		
		for(i=0;i<=10;i++) {
			if(i%2==0) {
				System.out.println("Number is Even"  +i);
			}
			else {
				System.out.println("Number is odd"   +i);
			}
		}
	}
	
	public static void main(String[] args)
	{

		Odd_Even obj=new Odd_Even();
		obj.checkNumber();

	}

}
