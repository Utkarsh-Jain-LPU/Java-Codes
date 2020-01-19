import java.lang.*;
import java.util.*;
import java.io.*;

class SourceFile
{
 public static void main(String arg[])
 {
  int i,j,nop,c=0;
  String temp="";
  Scanner obj = new Scanner(System.in);
  System.out.print("\nEnter no. of pieces you want to divide = ");
  nop = obj.nextInt();
  try
  {
   File f0 = new File("SourceFile.txt");
   File f1 = new File("temp.txt");
   FileReader fr1 = new FileReader(f0);
   FileWriter fw1 = new FileWriter(f1);
   BufferedReader br1 = new BufferedReader(fr1);
   PrintWriter pw1 = new PrintWriter(fw1);
   fw1.close(); 
   pw1.close();
  // temp = br1.readLine();
   while(temp != null)
   {
    FileWriter fw2 = new  FileWriter(f1,true);
    PrintWriter pw = new PrintWriter(fw2);
    c++;
    temp = br1.readLine();
    if(temp != null)
    {
     pw.println(temp);
    }
    pw.close();
    fw2.close();
   }
   fr1.close();
   br1.close();
  }
  catch(IOException e)
  {
   // Exception Caught
  }
  for(i=0;i<nop;i++)
  {
   try
   {
    File f1 = new File("File"+(i+1)+".txt");
    PrintWriter pw1 = new PrintWriter(f1);
    pw1.close();
   }
   catch(FileNotFoundException e)
   {
    // Exception Caught
   }
  }
  int data; 
  data = (int)c/nop;
  c = 0;
  try
  {
   File f0 = new File("temp.txt");
   FileReader fr2 = new FileReader(f0);
   BufferedReader br1 = new BufferedReader(fr2);
   temp = br1.readLine();
   System.out.print(temp+"\n");
   while(temp != null)
   {
    try
    {
     for(i=0;i<nop;i++)
     {
      for(j=0;j<data;j++)
      {
       File f = new File("File"+(i+1)+".txt");
       FileWriter fr = new FileWriter(f,true);
       PrintWriter pw = new PrintWriter(fr);
       if(temp != null)
       {
        pw.println(temp);
       }
       pw.flush();
       pw.close();
       fr.close();
       temp = br1.readLine(); 
      } 
     }
    }
    catch(FileNotFoundException e)
    {
     // Exception Caught
    }
   }
   fr2.close();
   br1.close();
   f0.delete();
  }
  catch(IOException e)
  {
   // Exception Caught
  }
 }
}