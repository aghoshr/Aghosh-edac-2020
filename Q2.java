import java.util.Scanner;

public class Q2 
{
    public static void main(String[] args) 
    {
	int i,j,k,m;

    for(i=0;i<=9;i++)
	{
	 for(j=9;j>=i;j--)
	     {
		System.out.print(" ");		
	     }
           
  	 for(k=1;k<=i;k++)
	     {
		System.out.print(" ");
		System.out.print(k);
	     }
	 
		System.out.println();
        }     
    }
}

