import java.lang.*;
import java.util.*;

class Demo_Scanner
{
 public static void main(String arg[])
 {
  Scanner obj = new Scanner(System.in);

  System.out.print("Enter String-2 value = ");
  String h = obj.nextLine();
  System.out.println("String-2 is "+h);

  System.out.print("Enter Byte value = ");
  byte a = obj.nextByte();
  System.out.println("Byte is "+a);

  System.out.print("Enter Short value = ");
  short b = obj.nextShort();
  System.out.println("Short is "+b);

  System.out.print("Enter Int value = ");
  int c = obj.nextInt();
  System.out.println("Int is "+c);

  System.out.print("Enter Long value = ");
  long d = obj.nextLong();
  System.out.println("Long is "+d);

  System.out.print("Enter Float value = ");
  float e = obj.nextFloat();
  System.out.println("Float is "+e);

  System.out.print("Enter Double value = ");
  double f = obj.nextDouble();
  System.out.println("Double is "+f);

  System.out.print("Enter String-1 value = ");
  String g = obj.next();
  System.out.println("String-1 is "+g);
 }
}