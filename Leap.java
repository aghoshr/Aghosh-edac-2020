package Assignment_1;

import java.util.Scanner;

public class Leap 
{
	public static void main(String args[])
	{
		int year;
		Scanner in=new Scanner(System.in);
		year=in.nextInt();
		
		if((year%4==0 && year%100!=0) || year%4==0 )
			System.out.print("Leap Year");
		else
			System.out.print("Not Leap Year");
		in.close();
	}
}
