package Assignment_1;

import java.util.*;

public class Days 
{
	public static void main(String args[])
	{
		int days;
		double year=365,month=12;
		
		
		Scanner in=new Scanner(System.in);
		System.out.println("ENTER THE NUBER OF DAYS");
		days=in.nextInt();
		
		System.out.println("Year "+days/year);
		System.out.println("Month "+days/month);
		System.out.println("Days "+days);
		in.close();
	}
	
}
