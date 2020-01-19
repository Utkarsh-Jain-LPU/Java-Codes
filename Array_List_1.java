import java.lang.*;
import java.util.*;

class Array_List_1
{
 public static void main(String arv[])
 {
  ArrayList obj = new ArrayList();
  obj.add(10);
  obj.add(56.8);
  obj.add("Utkarsh");
  obj.add(new Demo("Demo"));
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