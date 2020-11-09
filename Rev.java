package Assignment_2;
import java.util.*;
public class Rev 
{
public static void main (String args [])
{
	Scanner in=new Scanner(System.in);
	int num, rev=0,rem;
	
	System.out.println("ENTER A NUMBER");
	num=in.nextInt();
	
	while(num!=0)
	{
		rem=num%10;
		rev=rev*10+rem;
		num=num/10;
	}
	System.out.println(rev);
	in.close();
}

}
