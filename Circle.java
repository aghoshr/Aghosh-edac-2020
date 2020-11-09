package Assignment_1;

import java.util.*;
public class Circle
{

    public static void main(String[] args)
    {
	// write your code here public static void main(String[] args)
            {
        	 float r,area,circumference;
                System.out.println("Enter the radius");
        	 Scanner sc = new Scanner(System.in);
        	 r = sc.nextFloat();
        	area = (float) (3.14*r*r);
        	System.out.println("AREA OF CIRCLE="+area);
        	circumference = (float)(2*3.14*r);
                System.out.println("CIRCUMFERENCE CIRCLE="+circumference);
                sc.close();
           }
        }
    }
