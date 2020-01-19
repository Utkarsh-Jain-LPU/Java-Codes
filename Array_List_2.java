import java.lang.*;
import java.util.*;

class Array_List_2
{
 public static void main(String arv[])
 {
  ArrayList<Demo> obj = new ArrayList<Demo>();
  obj.add(new Demo("Demo"));
  obj.add(new Demo("Java"));
  System.out.println("Array List = "+obj);
  System.out.println("Hash Value of object = "+new Array_List());
 }
}

class Demo
{
 String Name;
 Demo(String x)
 {
  this.Name = x;
 }
 public String toString()
 {
  return Name;
 }
}