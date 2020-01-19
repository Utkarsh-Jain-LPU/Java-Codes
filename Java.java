import java.lang.*;
import java.util.*;

class Java
{
 public static void main(String arg[])
 {
  int n,i,j,k = 1;
  Scanner obj = new Scanner(System.in);
  System.out.print("Enter Value of Rows = ");
  n = obj.nextInt();
  for(i=1;i<=n;i++)
  {
   for(j=1;j<=4*n+3;j++)
   {
    if(j>=1 && j<=n)
    {
     if(i<=n/2 && j==1)
     {
      System.out.print(" ");
     }
     else if(i<n && (j>1 && j<n))
     {
      System.out.print(" ");
     }
     else
     {
      System.out.print("J");
     }
    }
    else if(j>=n+2 && j<=2*n+1)
    {
     if((i!=1 && i!=(n/2)+1) && (j>n+2 && j<2*n+1))
     {
      System.out.print(" ");
     }
     else if(i==1 && (j==n+2 || j==2*n+1))
     {
      System.out.print(" ");
     }
     else
     {
      System.out.print("A");
     }
    }
    else if(j>=2*n+3 && j<=3*n+2)
    {
     if(i>(n/2)+1 && (j<2*n+3+k || j>3*n+2-k))
     {
      System.out.print(" ");
     }
     else if(i<(n/2)+2 && (j>2*n+3 && j<3*n+2))
     {
      System.out.print(" ");
     }
     else if(i!=n && (j>2*n+3+k && j<3*n+2-k))
     {
      System.out.print(" ");
     }
     else
     {
      System.out.print("V");
     }
    }
    else if(j>=3*n+4 && j<=4*n+3)
    {
     if((i!=1 && i!=(n/2)+1) && (j>3*n+4 && j<4*n+3))
     {
      System.out.print(" ");
     }
     else if(i==1 && (j==3*n+4 || j==4*n+3))
     {
      System.out.print(" ");
     }
     else
     {
      System.out.print("A");
     }    
    }
    else
    {
     System.out.print(" ");
    } 
   }
   System.out.print("\n");
   if(i>(n/2)+1 && (j<2*n+3+k || j>3*n+2-k))
   {
    k=k+1;
   }
  }
 } 
}