package Registeration;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int rollNO[]=new int[100];
		rollNO[0]=100;
		rollNO[1]=101;
		rollNO[2]=102;
		System.out.println(rollNO[0]);

		int[] studRollNo= {201,202,203,204};
		System.out.println(studRollNo[3]);
		
		int mArray[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i=0;i<3;i++) {
			
			for(int j=0;j<3;j++) {
				
			System.out.print(mArray[i][j]);
				
			}
			
		}

		

	}

}
