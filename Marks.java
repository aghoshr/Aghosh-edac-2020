package Assignment_1;
import java.util.*;
public class Marks 
{
public static void main(String args[])
{
	Scanner in=new Scanner(System.in);
	int sub,i,add=0;

	float per;
	
	System.out.println("ENTER YOUR MARKS");
	
	for(i=0;i<5;i++)
	{
	  sub=in.nextInt();
	  add=add+sub;	  
	}
	
  per=(add*100)/500;

  System.out.print("Percentage marks="+per+"%");
  in.close();
}
}
