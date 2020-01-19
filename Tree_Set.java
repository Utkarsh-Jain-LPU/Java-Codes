import java.lang.*;
import java.util.*;

class Tree_Set
{
 public static void main(String arg[])
 {
  int i,n,sal;
  String name,degn;
  Scanner s_obj = new Scanner(System.in);
  System.out.print("\nEnter no of Employee's = ");
  n = s_obj.nextInt();
  s_obj.nextLine();
  System.out.print("\n");
  TreeSet Sal = new TreeSet();
  TreeSet Name = new TreeSet();
  TreeSet Degn = new TreeSet();
  for(i=0;i<n;i++)
  {
   System.out.print("For Employee "+(i+1)+" :-\n\n");
   System.out.print("\nEnter Name = ");
   name = s_obj.nextLine();
   Name.add(name);
   System.out.print("Enter Designation = ");
   degn = s_obj.nextLine();
   Degn.add(degn);
   System.out.print("Enter Salary = ");
   sal = s_obj.nextInt();
   s_obj.nextLine();
   Sal.add(sal); 
  }
  System.out.print("\n\n"+Name);
  System.out.print("\n\n"+Sal);
  System.out.print("\n\n"+Degn);
 }
}