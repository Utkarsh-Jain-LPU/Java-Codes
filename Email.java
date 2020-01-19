import java.lang.*;
import java.util.*;
import java.util.regex.*; 
  
class Email 
{ 
 public boolean isValid(String email) 
 { 
  String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+"[a-zA-Z0-9_+&*-]+)*@"+"(?:[a-zA-Z0-9-]+\\.)+[a-z"+"A-Z]{2,7}$"; 
  Pattern pat = Pattern.compile(emailRegex); 
  if(email == null) 
  {
   return false;
  }
  else
  {
   return pat.matcher(email).matches(); 
  }   
 } 
 public static void main(String[] args) 
 {
  String email;
  Email obj = new Email();
  Scanner s_obj = new Scanner(System.in);
  System.out.print("Enter E-mail Address = ");
  email = s_obj.next(); 
  if(obj.isValid(email))
  {
   System.out.print("Yes");
  } 
  else
  {
   System.out.print("No"); 
  }
 } 
} 