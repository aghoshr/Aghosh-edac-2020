/*package aghosh;

public class Great 
{
 public static void main (String args [])
 {
	 int a=10,b=6,c=10;
	 
	 if(a>b && a>c)
		 System.out.print(+a+" a is greater");
	 else if (b>a && b>c)
		 System.out.print(+b+" b is greater");
	 else
		 System.out.print(+c+" c is greater");
	 
 }
}
*/


package Assignment_1;

public class Great 
{
 public static void main (String args [])
 {
	 int a=12,b=16,c=15;
	
	 int s=(a>b)?(a>c? a:c):(b>c? b:c);
	 System.out.print(s);
	 
	 
 }
}