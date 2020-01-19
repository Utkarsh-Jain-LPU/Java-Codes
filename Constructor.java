import java.lang.*;

class Constructor
{
 public Constructor()
 {
  System.out.println("Name : Utkarsh Jain");
 }
 public Constructor(int age)
 {
  System.out.println("Age : "+age);
 }
 public static void main(String arg[])
 { 
  Constructor obj1 = new Constructor();
  Constructor obj2 = new Constructor(18);
  System.out.println("Section : K17SJ");
 }
}