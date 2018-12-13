package Algorithm;
import Utility.Utility;
public class Repeatednum {
	
	public static void main(String args[])
	{
		System.out.println("enter the number from user:");
		int number= Utility.getInt();
		
		int [] array = new int[5];
		for(int i=0;i<5;i++) {
			array[i] = Utility.getInt();
		}
		Utility.getRepeatedNumber(array);
	}

}
