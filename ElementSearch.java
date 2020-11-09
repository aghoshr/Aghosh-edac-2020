package Assignment_2;
// Searching an element in an array
import java.util.*;
public class ElementSearch
{
	public static void main(String args [])
	{
		Scanner in=new Scanner(System.in);
		//int  arr []=new int[10];
		int n,i,aghosh=0;
		int arr []= {10,20,30,40,50,60,70,80,90,100};
		
		System.out.println("Enter the number that you want to search");
		n=in.nextInt();
		
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]==n)
			{
				aghosh=1;
				break;
			}
		else
			{
				aghosh=0;
			}
		}
		
			if(aghosh==1)
			{
				System.out.println("Element found i.e : "+n);
			}
			else
			{
				System.out.println("Element Not found");
			}
		
		
	}
}



/*for(i=0;i<=arr.length;i++)
{
	if(arr[i]==n)
	{
		System.out.println("Element Found");
		break;				
	}
	
	else
	{
		System.out.println("Element Not Found");
		break;
	}
}*/