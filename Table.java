package Assignment_2;

import java.util.Scanner;

class Table
{
		public static void main(String args[])
		{	System.out.println("ENTER A NUMBER FOR THE TABLE =");
			Scanner sc=new Scanner(System.in);
			int n,i;
			n=sc.nextInt();
			for(i=1;i<=10;i++)
			{
				System.out.println(n+"x"+i+"="+(n*i));
			}
			sc.close();
		}

}