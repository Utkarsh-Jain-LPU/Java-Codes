import java.lang.*;
import java.util.*;

@FunctionalInterface
interface Predicate
{
 boolean test(String t);
}
class Functional_Interface
{
 static int n,i;
 static String str; 
 public static void main(String arg[])
 {
  ArrayList<String> a_obj = new ArrayList<String>();
  Scanner s_obj = new Scanner(System.in);
  System.out.print("\nEnter no of String you want to add = ");
  n = s_obj.nextInt();
  System.out.print("\n");
  for(i=0;i<n;i++)
  {
   System.out.print("Enter "+(i+1)+" String = ");
   str = s_obj.next();
   a_obj.add(str);
  }
  System.out.print("\nStrings that ended with 'g' are :-\n\n");
  Predicate l_obj = new Predicate(){
                                    public boolean test(String x)
                                    {
                                     return (x.charAt(x.length()-1) == 'g');
                                    }
                                   };  
  for(i=0;i<n;i++)
  {
   boolean req;
   req = l_obj.test(a_obj.get(i));
   System.out.print(a_obj.get(i)+" --> "+req+"\n");
  }
 }
}