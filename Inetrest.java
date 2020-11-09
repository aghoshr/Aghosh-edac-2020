package Assignment_1;
import java.util.*;
public class Inetrest 
{
	public static void main(String args[])
	{
		double si,p,n,r;
		
		Scanner in=new Scanner(System.in);
		System.out.print("ENTER THE PRINCIPAL AMOUNT");
		p=in.nextInt();
		System.out.print("ENTER NUMBER OF YEARS");
		n=in.nextInt();
		System.out.print("ENTER RATE OF INTEREST");
		r=in.nextInt();
		in.close();
		si=(p*r*n)/100;
		System.out.print(si);
			
	}

}
