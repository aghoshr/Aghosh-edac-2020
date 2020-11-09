package Assignment_1;
import java.util.*;
public class Marriage
{
public static void main(String args [])
{
	int age;
	char gender;
	Scanner in=new Scanner(System.in);
	System.out.println("ENTER YOUR GENDER");
	gender=in.next().charAt(0);
	
	System.out.println("ENTER YOUR AGE");
	age=in.nextInt();
	
	in.close();
	
	if(gender!='f' && gender !='m' )
	{
		System.out.println("PLEASE TRY AGAIN");
	}
	
	
	if(gender=='f' && age >= 18 )
	{
		System.out.println("YOU ARE ELIGIBLE FOR MARRIAGE");
	}
		
	else if(gender=='m' && age >=21)
	{
		System.out.println("YOU ARE ELIGIBLE FOR MARRIAGE");
	}
	
	else
	{
		System.out.println("YOU ARE NOT ELIGIBLE FOR MARRIAGE");
	}
	
	}
}

