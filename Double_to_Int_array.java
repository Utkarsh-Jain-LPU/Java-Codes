import java.lang.*;
import java.util.*;

class Double_to_Int_array
{
 static int n,i,temp;
 public static int doubletoint(double x)
 {
  temp = x;
  return temp;
 }
 public static void main(String arg[])
 {
  Scanner sobj = new Scanner(System.in);
  System.out.print("Enter Size of Array = ");
  n = sobj.nextInt();
  System.out.print("\n");
  int t[] = new int[n];
  double d[] = new double[n];
  for(i=0;i<n;i++)
  {
   System.out.print("Enter Value for "+i+" index = ");
   d[i] = sobj.nextDouble();
  }
  for(i=0;i<n;i++)
  {
   t[i] = doubletoint(d[i]);
  }
  System.out.print("After Conversion (Int Values) :-");
  for(i=0;i<n;i++)
  {
   System.out.print("\t"+t[i]);
  }
 }
}