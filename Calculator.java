import java.lang.*;
import java.util.*;

class Calculator
{
 public static void main(String arg[])
 {
  Scanner obj = new Scanner(System.in); 
  
  System.out.print("Enter value of a = ");
  float a = obj.nextFloat();
  System.out.print("Enter value of b = ");
  float b = obj.nextFloat();
  System.out.println("");
  
  float sum = a+b;
  float sub = a-b;
  float mul = a*b;
  float div = a/b;
  float mod = a%b;
   
  System.out.println("  1 - Addition");
  System.out.println("  2 - Subtraction");
  System.out.println("  3 - Multiplication");
  System.out.println("  4 - Division");
  System.out.println("  5 - Modulus");
  System.out.println("");

  System.out.print("Enter Choice = ");
  int ch = obj.nextInt();
  System.out.print("");

  if(ch == 1)
  {
   System.out.print("Addition = "+sum);
  }  
  else if(ch == 2)
  {
   System.out.print("Subtraction = "+sub);
  }
  else if(ch == 3)
  {
   System.out.print("Multiplication = "+mul);
  }
  else if(ch == 4)
  {
   System.out.print("Division = "+div);
  }
  else if(ch == 5)
  {
   System.out.print("Modulus = "+mod);
  }
  else
  {
   System.out.print("Wrong Choice...!!");
  }
 }
}