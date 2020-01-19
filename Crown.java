import java.lang.*;
import java.util.*;

class Crown
{ 
 public static void main(String arg[])
 {
  int i,j,n,c=1;
  Scanner obj = new Scanner(System.in);
  System.out.print("Enter Value of Rows = ");
  n = obj.nextInt()-1;
  System.out.print("\n");
  int p=n-1,q=n-1;
  int a[][] = new int[n+1][2*n-1];
  for(i=1;i<=n+1;i++)
  {
   for(j=1;j<=2*n-1;j++)
   {
    if(j<=p || j>=2*n-p)
    {
     System.out.print(" ");
    }
    else if(i%2==0 && (j==q || j==2*n-q)) 
    {
     System.out.print("+");
    }
    else if(i==n+1 && (j==c || j==2*n-c) && i%2==0)
    {
     System.out.print(" ");
    }
    else
    { 
     System.out.print("*");
    }
   }
   p=p-1;
   if(i%2==0)
   {
    q=q-2;
   }
   System.out.print("\n");
  }
 }
}