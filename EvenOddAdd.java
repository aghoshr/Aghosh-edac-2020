package Assignment_2;

public class EvenOddAdd 
{
	public static void main(String args [])
	{
		int arr[]= {2,4,3,6,5,8,7},sum=0,add=0,i;
		
		for(i=0;i<7;i++)
		{
			if(arr[i]%2==0)
			{
				sum=sum+arr[i];
			}
			else
			{
				add=add+arr[i];
			}
			
		}		
		System.out.println(sum);
		System.out.println(add);
	}

}
