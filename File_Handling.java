import java.io.*;
import java.lang.*;
import java.util.*;

class File_Handling
{
 public static void main(String arg[])
 {
  String age;
  String name;
  Scanner s_obj = new Scanner(System.in);
  System.out.print("Enter Name = ");
  name = s_obj.nextLine();
  System.out.print(" Enter Age = ");
  age = s_obj.nextLine();
  FileWriter fw = null;
  try
  {
   fw = new FileWriter(name+".txt"); 
   PrintWriter pw = new PrintWriter(fw);
   pw.println(name);
   pw.print(age);
   pw.close();
  }
  catch(IOException e)
  {
   // Exception Caught
  }
 }
}