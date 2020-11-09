package String_Assignment;
import java.util.*;
class CountVowels
{
	public static void main(String args[])
	{
        Scanner in=new Scanner(System.in);
		int a=0,b=0,c=0,d=0;
		String s,st;
		char chars;
		
		s=in.nextLine();
		st=s.toLowerCase();
		System.out.println(st);
		for(int i=0;i<st.length();i++)
		{
			chars=st.charAt(i);
			if(chars=='a'||chars=='e'||chars=='i'||chars=='o'||chars=='u')
			{
				a++;
			}
			else if(chars=='1'||chars=='2'||chars=='3'||chars=='4'||chars=='5'||chars=='6'||chars=='7'||chars=='8'||chars=='9'||chars=='0')
			{
				c++;
			}
			else if(chars=='@'||chars=='!'||chars=='#'||chars=='$')
			{
				d++;
			}
           else
			{	
				if(chars!=' ')
            b++;
			}
		}
		System.out.println("VOWELS : "+a);
		System.out.println("CONSONANTS : "+b);
		System.out.println("NUMBER : "+c);
		System.out.println("OTHERS : "+d);
	}
}


