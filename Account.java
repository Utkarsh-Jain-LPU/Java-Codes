import java.lang.*;
import java.util.*;

class Account
{
 static int id=1;
 static int id[80],ch;
 static int amt,monthlyInterest;
 double balance,annualInterestRate=4;
 Account()
 {
  id = 11716290;
  balance = 500;
 }
 Account(int id, double balance)
 {
  this.id = id;
  this.balance = balance;
 }
 void getMonthlyInterest()
 {
  System.out.print("Monthly Interest = "+monthlyInterest);
 }
 void withdraw()
 {
  Scanner sobj = new Scanner(System.in);
  System.out.print("Enter Amount you want to withdraw = ");
  amt = sobj.nextInt();
  if(balance >= amt)
  {
   balance = balance - amt;
   System.out.print("Money withdraw Succesfull...");
  }
  else
  { 
   System.out.print("Insufficient Balance...");
  }
 }
 void deposit()
 {
  
 }
 public static void main(String arg[])
 {
  Scanner sobj = new Scanner(System.in);
  System.out.println("Account Management\n");
  System.out.println("1) Default Account");
  System.out.println("2) Create Account");
  System.out.println("3) Get Monthly Interest");
  System.out.println("4) Withdraw Money");
  System.out.println("5) Deposit Money");
  System.out.println("6) Show Details\n");
  System.out.print("\nEnter your choice = ");
  ch = sobj.nextInt();
  switch(ch)
  {
   case 1:
   {
    Account obj = new Account();
    System.out.println("\nYour Account Create Successfully...");
    
   }
   break; 
   case 2:
   break;
   case 3:
   break;
   case 4:
   break;
   case 5:
   break; 
  }
 }
} 