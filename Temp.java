package Assignment_1;

import java.util.Scanner;

public class Temp 
{
	public static void main(String args[])
	{
		float temp,c;
		Scanner in=new Scanner(System.in);
		System.out.println("ENTER THE TEMPRATURE");
		temp=in.nextFloat();
		
		c= (5*(temp-32)/9) ;
		
		System.out.println("TEMPRATURE IN CELSIUS "+c);
		
		in.close();
		
	}
}