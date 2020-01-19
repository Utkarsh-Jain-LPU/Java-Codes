import java.lang.*;
import java.util.*;

class My_Triangle
{
 static boolean a = false;
 static double p,q,r,s,Area;
 public static boolean isValid(double side1, double side2, double side3)
 {
  if(side1+side2 > side3)
  {
   if(side2+side3 > side1)
   {
    if(side1+side3 > side2)
    {
     a = true;
     area(side1,side2,side3);
    }
    else
    {
     a = false;
     System.out.print("\nInvalid Output...");
    }
   }
   else
   {
    a = false;
    System.out.print("\nInvalid Output...");
   }
  }
  else
  {
   a = false;
   System.out.print("\nInvalid Output...");
  }
  return a; 
 }
 public static double area(double side1, double side2, double side3)
 {
  s = (side1 + side2 + side3)/3;
  Area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3)); 
  return Area;
 }
 public static void main(String arg[])
 {
  Scanner obj = new Scanner(System.in);
  System.out.print("Enter 1st Side = ");
  p = obj.nextDouble();
  System.out.print("Enter 2nd Side = ");
  q = obj.nextDouble();
  System.out.print("Enter 3rd Side = ");
  r = obj.nextDouble();
  isValid(p,q,r);
  if(a == true)
  {
   System.out.print("\nArea = "+Area);
  }
 }
}