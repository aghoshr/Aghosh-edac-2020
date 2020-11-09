package Assignment_2;
import java.util.*;
public class Prime
{
	
	public static void main(String args [])
	{
		Scanner in=new Scanner(System.in);
		int num,i,temp=0;
		System.out.println("ENTER A NUMBER");
		num=in.nextInt();
		
		for(i=2;i<num-1;i++)
		{
			if(num%i==0)
			{
				temp=temp+1;
			}
		}
		
		if(temp>0)
		{
			System.out.println("ENTERD NUMBER IS A PRIME NUMBER");
		}
		
		else
		{
			System.out.println("ENTERD NUMBER IS NOT A PRIME NUMBER");
		}
		in.close();
	}
}
