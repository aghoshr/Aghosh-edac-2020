package Assignment_2;
import java.util.Scanner;
public class ArrayAvg 
{ 
	public static void main (String args [])
	{
	int arr[]= new int [10];
	int i,sum=0;
	double avg;
	Scanner in=new Scanner(System.in);
	System.out.println("Enter 10 elements to find the average");
	for(i=0;i<=9;i++)
	{
		arr[i]=in.nextInt();
		sum=sum+arr[i];
		in.close();
	}
	avg=sum;
	System.out.println(avg/10);
	
	}
	
}

