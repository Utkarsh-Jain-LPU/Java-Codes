import java.lang.*;
import java.util.*;
import java.io.*;

class File_program
{
 public static void main(String arg[])
 {
  String name;
  Scanner obj = new Scanner(System.in);
  System.out.print("\nEnter File Name = ");
  name = obj.next();
  try
  {
   File f1 = new File(name+".txt");
   FileReader fr = new FileReader(f1);
   System.out.print(name+".txt file Exist.");
  }
  catch(FileNotFoundException e)
  {
   System.out.print("\nFile not Found.\n");
  }
 }
}