import java.lang.*;
import java.util.*;

class Baby_Name_Comparison
{
 public static void main(String arg[])
 {
  int n,i,j,k=0,fact;
  Scanner obj = new Scanner(System.in);
  System.out.print("\nEnter no. of User Names ( >= 3 ) = ");
  n = obj.nextInt();
  System.out.print("\n");
  String A[] = new String[n];
  fact = n*(n-1);
  String con[] = new String[fact];
  for(i=0;i<n;i++)
  {
   System.out.print("Enter "+(i+1)+" Name = ");
   A[i] = obj.next(); 
  }
  for(i=0;i<n;i++)
  {
   for(j=0;j<n;j++)
   {
    if(i!=j && k<fact)
    {
     con[k] = A[i].concat(A[j]);
     k = k+1;
    }
   }
  }
  System.out.print("\n-: After Combinations :-\n\n");
  for(i=0;i<fact;i++)
  {
   System.out.println((i+1)+" - "+con[i]);
  }
 }
}