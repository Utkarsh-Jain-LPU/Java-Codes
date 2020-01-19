import java.lang.*;
import java.util.*;

class Heap
{
 public static void main(String arg[])
 {
  int i,j,n;
  Scanner obj = new Scanner(System.in);
  System.out.print("Enter Value of Rows = ");
  n = obj.nextInt();
  System.out.print("\n");
  int p=n-1;
  int a[][] = new int[n][2*n-1];
  for(i=1;i<=n;i++)
  {
   for(j=1;j<=2*n-1;j++)
   {
    if(j<=p || j>=2*n-p)
    {
     System.out.print(" ");
    } 
    else
    { 
     System.out.print("*");
    }
   }
   p=p-1;
   System.out.print("\n");
  }
 }
}