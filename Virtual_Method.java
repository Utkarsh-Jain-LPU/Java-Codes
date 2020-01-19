import java.lang.*;
import java.util.*;

class M1
{
 public void M()
 {
  System.out.println("M1");
 }
 public void MN()
 {
  System.out.println("MN1");
 }
}

class M2 extends M1
{
 public void M()
 {
  System.out.println("M2");
  super.M();
 }
 public void MN()
 {
  System.out.println("MN2");
  super.MN();
 }
}

class Virtual_Method
{
 public static void main(String arg[])
 {
  M1 obj0 = new M1();
  M1 obj1 = new M2();
  obj0.M();
  obj1.M();
  obj0.MN();
  obj1.MN();
 }
}