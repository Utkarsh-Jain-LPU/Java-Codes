import java.lang.*;
import java.util.*;

class Str_Comp
{
 public static void main(String arg[])
 {
  int n,i,j;
  String temp;
  String s[] = new String[80];
  Scanner obj = new Scanner(System.in);
  System.out.print("Enter no. of String you want to take = ");
  n = obj.nextInt();
  obj.nextLine();
  System.out.print("\n");
  for(i=0;i<n;i++)
  {
   System.out.print("Enter "+(i+1)+" String = ");
   s[i] = obj.nextLine();
  }
  for(i=0;i<n-1;i++)
  {
   for(j=i;j<n;j++)
   {
    if(s[i].compareTo(s[j])>0)
    {
     temp = s[i];
     s[i] = s[j];
     s[j] = temp;
    }
   }
  }
  System.out.print("\nAfter arranging according to Dictionary :-\n\n");
  for(i=0;i<n;i++)
  {
   System.out.print(s[i]+"\t");
  }
 }
}