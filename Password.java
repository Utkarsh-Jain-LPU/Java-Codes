import java.lang.*;
import java.util.*;
import java.awt.*;

class Password
{
 public static void main(String arg[])
 {
  int i,nol=0,nod=0,c=0;
  String temp,pass,cpass;
  Scanner obj = new Scanner(System.in);
  System.out.print("\nYou have total 3 Attempts...\n\n");
  try
  {
   Thread.sleep(1000);
  }
  catch(InterruptedException ex)
  {
   Thread.currentThread().interrupt();
  }
  while(true)
  {
   System.out.print("\n  Enter Password = ");
   temp = obj.nextLine();
   pass = temp.trim();
   if(pass.length()<6 || pass.length()>10)
   {
    c = c+1;
    System.out.print("\nPassword must be of 6 to 10 characters...!!\n");
    Toolkit.getDefaultToolkit().beep();
    try
    {
     Thread.sleep(2000);
    }
    catch(InterruptedException ex)
    {
     Thread.currentThread().interrupt();
    }
    if(c<3)
    {
     System.out.print("\nOnly "+(3-c)+" Attempt remaining...\n\n");
     try
     {
      Thread.sleep(2000);
     }
     catch(InterruptedException ex)
     {
      Thread.currentThread().interrupt();
     }
     continue;
    }
    else
    {
     System.exit(0);
    }
   }
   else
   {
    for(i=0;i<pass.length();i++)
    {
     if((pass.charAt(i)>='a' && pass.charAt(i)<='z') || (pass.charAt(i)>='A' && pass.charAt(i)<='Z'))
     {
      nol = nol+1;
     }
     else if(pass.charAt(i)>='0' && pass.charAt(i)<='9')
     {
      nod = nod+1;
     }
    }
    if(nol == 0 || nod == 0)
    {
     c = c+1;
     System.out.print("\nPassword must contain atleast 1 Letter and 1 Digit...!!\n");
     Toolkit.getDefaultToolkit().beep();
     try
     {
      Thread.sleep(2000);
     }
     catch(InterruptedException ex)
     {
      Thread.currentThread().interrupt();
     }
     if(c<3)
     {
      System.out.print("\nOnly "+(3-c)+" Attempt remaining...\n\n");
      try
      {
       Thread.sleep(2000);
      }
      catch(InterruptedException ex)
      {
       Thread.currentThread().interrupt();
      }  
      continue;
     }
     else
     {
      System.exit(0);
     }
    }
    else
    {
     while(true)
     {
      System.out.print("Confirm Password = ");
      temp = obj.nextLine();
      cpass = temp.trim();
      if(pass.equals(cpass))
      {
       System.out.print("\nPassword Matched Successfully...\n");
       System.exit(0);
      }
      else
      {
       c = c+1;
       if(c<3)
       {
        System.out.print("\nConfirm Password not Matched...!!\n");
        Toolkit.getDefaultToolkit().beep();
       }
       else
       {
        System.out.print("\nSorry.. You Failed...!!\n");
        Toolkit.getDefaultToolkit().beep();
        try
        {
         Thread.sleep(500);
        }
        catch(InterruptedException ex)
        {
         Thread.currentThread().interrupt();
        } 
        Toolkit.getDefaultToolkit().beep();
       }
       try
       {
        Thread.sleep(2000);
       }
       catch(InterruptedException ex)
       {
        Thread.currentThread().interrupt();
       }
       if(c<3)
       {
        System.out.print("\nOnly "+(3-c)+" Attempt remaining...\n\n\n");
        try
        {
         Thread.sleep(2000);
        }
        catch(InterruptedException ex)
        {
         Thread.currentThread().interrupt();
        }
        System.out.println("   Your password = "+pass);
        continue;
       }
       else
       {
        System.exit(0);
       }
      }
     }
    }
   }
  }
 }
}