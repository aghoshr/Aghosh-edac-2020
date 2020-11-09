package Assignment_2;

import java.util.Scanner;

public class Series 
{
	public static void main (String args[])
	{
		int s,i,j;
		Scanner in=new Scanner(System.in);
		System.out.println("ENTER A NUMBER");
		s=in.nextInt();
		 j=12;
		for(i=1;i<=s;i++)
		{
			
			System.out.print(j+"+");
			j=j+10;
		}
		in.close();	
	}
}
