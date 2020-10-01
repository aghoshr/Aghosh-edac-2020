public class Q4 
{
    public static void main(String[] args) 
    {
	int i,j,k,m,g;
    for(i=1;i<=9;i++)
	{
	 for(j=9;j>=i;j--)
	    	     {
		System.out.print(" ");
		     }
        
		 for(k=1;k<=i;k++)
	   	     {
                          
			System.out.print(k);
                         
		     }
                       
                        k=k-2;
			for(m=2;m<=i;m++)
	   	     	{
                            
                          System.out.print(k);
                           k--;
                        }
							
			System.out.println();
						 
	 }

		  	            
     
    }
}




