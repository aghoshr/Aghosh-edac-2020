package Assignment_1;
import java.util.*;
public class EmpSal 
{
 public static void main (String args[])
 {	 
	 float sal,hra;
	 
	 Scanner in=new Scanner(System.in);	
	 System.out.println("Enter your Salary");
	 sal=in.nextFloat();
	 
	 if(sal<10000)
	 {
		 hra=sal+((sal*10)/100 + (sal*90)/100);
		 System.out.println("Your Salary is "+hra);
	 }
	 
	 else
	 {
		 hra=sal+(2000 + (sal*98)/100);
		 System.out.println("Your Salary is "+hra);
	 }
	 
	 in.close();
 }
	 
}