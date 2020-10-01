import java.util.Scanner;

public class Q7
{
    public static void main(String[] args) 
    {
	int i,j,k;


    for(i=9;i>=1;i--)
	{
	   for(k=9;k>=i;k--)
		{
	    	System.out.print(" ");
		}

			for(j=0;j<i;j++)
         	 	{		
			System.out.print(" "+i);
          		}

				System.out.println();
	}
    }
}



