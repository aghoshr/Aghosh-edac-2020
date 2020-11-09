package Assignment_2;

public class SortArray 
{
	public static void main(String args[])
	{
		int a[]=new int[]{5,25,4,8};
		int max=0;
				for(int i=0;i<a.length;i++)
			    {
					for(int j=i+1;j<a.length;j++)
					{
					if(a[i]<a[j])
						{
							max=a[i];
							a[i]=a[j];
							a[j]=max;	
						}
						
					}
				}
					for(int k=0;k<a.length;k++)
					{
						System.out.println(a[k]);
					}
	}
				
}
					




