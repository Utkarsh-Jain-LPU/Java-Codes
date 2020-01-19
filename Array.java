import java.lang.*;
import java.util.*;

class Array
{
 static int n,i,ch;
 static int A[] = new int[80];
 void disp()
 {
  System.out.print("\nAll Integers are : ");
  for(i=0;i<n;i++)
  {
   System.out.print("\t"+A[i]);
  }
 }
 void disprev()
 {
  System.out.print("\nAll Integers in reverse order are : ");
  for(i=n-1;i>=0;i--)
  {
   System.out.print("\t"+A[i]);
  }
 }
 void sum()
 {
  int sum = 0;
  System.out.print("\nSum of all Integers are : ");
  for(i=0;i<n;i++)
  {
   sum = sum + A[i];
  }
  System.out.print("\t"+sum);
 }
 void lt5()
 {
  int c = 0;
  System.out.print("\nIntegers less than 5 are : ");
  for(i=0;i<n;i++)
  {
   if(A[i]<5)
   {
    c = c+1;
    System.out.print("\t"+A[i]);
   }
  }
  if(c == 0)
  {
   System.out.print("\tNo Value");
  }
 }
 void min()
 {
  int min = A[0];
  System.out.print("\nMinimum Integer is : ");
  for(i=1;i<n;i++)
  {
   if(A[i]<min)
   {
    min = A[i];
   }
  }
  System.out.print("\t"+min);
 }
 void max()
 {
  int max = A[0];
  System.out.print("\nMaximun Integer is : ");
  for(i=1;i<n;i++)
  {
   if(A[i]>max)
   {
    max = A[i];
   }
  }
  System.out.print("\t"+max);
 }
 void avg()
 {
  int sum = 0,avg = 0;
  System.out.print("\nAverage of all Integers are : ");
  for(i=0;i<n;i++)
  {
   sum = sum + A[i];
  }
  avg = sum/n;
  System.out.print("\t"+avg);
 }
 void gta()
 {
  int c = 0,sum = 0,avg = 0;
  System.out.print("\nIntegers greater than average are : ");
  for(i=0;i<n;i++)
  {
   sum = sum + A[i];
  }
  avg = sum/n;
  for(i=0;i<n;i++)
  {
   if(A[i]>avg)
   {
    c = c+1;
    System.out.print("\t"+A[i]);
   }
  }
  if(c == 0)
  {
   System.out.print("\tNo Value");
  }
 }
 public static void main(String arg[])
 {
  Array obj1 = new Array();
  Scanner obj = new Scanner(System.in);
  System.out.print("Enter no. of Values = ");
  n = obj.nextInt();
  System.out.print("\n");
  for(i=0;i<n;i++)
  {
   System.out.print("Enter "+(i+1)+" Value = ");
   A[i] = obj.nextInt();
  }
  while(true)
  {
   System.out.print("\n1) Print all Integers");
   System.out.print("\n2) Print all Integers in reverse");
   System.out.print("\n3) Print Sum of all Integers");
   System.out.print("\n4) Print Values less than 5");
   System.out.print("\n5) Print Minimum Value");
   System.out.print("\n6) Print Maximum Value");
   System.out.print("\n7) Print Average of all Integers");
   System.out.print("\n8) Print Values that are greater than Average Value");
   System.out.print("\n9) Exit this Application");
   System.out.print("\n\nEnter your Choice = ");
   ch = obj.nextInt();
   switch(ch)
   {
    case 1:
    {
     obj1.disp();
    }
    break;
    case 2:
    {
     obj1.disprev();
    }
    break;
    case 3:
    {
     obj1.sum();
    }
    break;
    case 4:
    {
     obj1.lt5();
    }
    break;
    case 5:
    {
     obj1.min();
    }
    break;
    case 6:
    {
     obj1.max();
    }
    break;
    case 7:
    {
     obj1.avg();
    }
    break;
    case 8:
    {
     obj1.gta();
    }
    break;
    case 9:
    {
     System.exit(0);
    }
    break;
    default:
    {
     System.out.print("\nInvalid Choice...");
    }
   }
   System.out.print("\n");
  }
 }
}