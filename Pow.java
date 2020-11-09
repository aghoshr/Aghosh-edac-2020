package Assignment_1;

/*A. y = x2 + 3x - 7 (print value of y) 
B. y = x++ + ++x (print value of x and y) 
C. z = x++ - --y - --x  +  x++ (print value of x ,y and z)
D. z = x && y || !(x || y)  (print value of z) [ x, y, z are boolean variables ]

public class Pow
{
public static void main(String args[])
 {
 int x=3;
 double y;
 
 y=(x++ +  ++x) ;
 System.out.println(y);
 
 }
}


public class Pow
{
public static void main(String args[])
 {
 int x=3;
 double y;
 
 y=x*x +3*x -7;
 System.out.println(y);
 
 }
}


public class Pow
{
public static void main(String args[])
 {
 int x=3,y=2;
 double z;
 
 z=(x++ - --y - --x  +  x++);
 System.out.println(z);
 
 }
}
*/


public class Pow
{
public static void main(String args[])
 {
 boolean x,y,z;
 x=false;
 y=true;
 
 
 z= x && y || !(x || y);
 System.out.println(z);
 
 }
}