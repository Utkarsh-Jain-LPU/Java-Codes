import java.lang.*;
import java.util.*;

abstract class Shopping_Mall
{
 abstract void Bill_Counter(int x);
}

class Bill extends Shopping_Mall
{
 public void Bill_Counter(int x)
 {
  System.out.print("\nYour Bill = "+x+" Rs.\n");
 }
}

class Food_Item
{
 Scanner s_obj = new Scanner(System.in);
 int day,ch,burger=50,pizza=140,sandwich=60,coke=30;
 Food_Item()
 {
  System.out.print("\nFood-Item Store\n\n");
  System.out.print("1) Coke - "+coke+" Rs.\n");
  System.out.print("2) Pizza - "+pizza+" Rs.\n");
  System.out.print("3) Burger - "+burger+" Rs.\n");
  System.out.print("4) Sandwich - "+sandwich+" Rs.\n");
  System.out.print("\nEnter your Choice = ");
  ch = s_obj.nextInt();
  System.out.print("\nToday is - \n");
  System.out.print("1) Monday\n");
  System.out.print("2) Tuesday\n");
  System.out.print("3) Wednesday\n");
  System.out.print("4) Thursday\n");
  System.out.print("5) Friday\n");
  System.out.print("6) Saturday\n");
  System.out.print("7) Sunday\n");
  System.out.print("\nEnter your Choice = ");
  day = s_obj.nextInt();
  if(day<1 && day>7)
  {
   System.out.print("\nWrong Choice...");
  }
  switch(ch)
  {
   case 1:
   {
    if(day == 3)
    {
     System.out.print("\nCongrats.. You recieve 20% discount...\n");
     int temp=0;
     temp = coke-(int)(coke*0.2);
     Bill obj = new Bill();
     obj.Bill_Counter(temp);
    }
    else
    {
     Bill obj = new Bill();
     obj.Bill_Counter(coke);
    }
   }
   break;
   case 2:
   {
    if(day == 3)
    {
     System.out.print("\nCongrats.. You recieve 20% discount...\n");
     int temp=0;
     temp = pizza-(int)(pizza*0.2);
     Bill obj = new Bill();
     obj.Bill_Counter(temp);
    }
    else
    {
     Bill obj = new Bill();
     obj.Bill_Counter(pizza);
    }
   }
   break;
   case 3:
   {
    if(day == 3)
    {
     System.out.print("\nCongrats.. You recieve 20% discount...\n");
     int temp=0;
     temp = burger-(int)(burger*0.2);
     Bill obj = new Bill();
     obj.Bill_Counter(temp);
    }
    else
    {
     Bill obj = new Bill();
     obj.Bill_Counter(burger);
    }
   }
   break;
   case 4:
   {
    if(day == 3)
    {
     System.out.print("\nCongrats.. You recieve 20% discount...\n");
     int temp=0;
     temp = sandwich-(int)(sandwich*0.2);
     Bill obj = new Bill();
     obj.Bill_Counter(temp);
    }
    else
    {
     Bill obj = new Bill();
     obj.Bill_Counter(sandwich);
    }
   }
   break;
   default:
   {
   }
  }
 }
}

class Clothes
{
 Scanner s_obj = new Scanner(System.in);
 int day,ch,jeans=999,tshirts=249,trousers=1299,shirts=599;
 Clothes()
 {
  System.out.print("\nClothes Store\n\n");
  System.out.print("1) Jeans - "+jeans+" Rs.\n");
  System.out.print("2) Shirts - "+shirts+" Rs.\n");
  System.out.print("3) T-Shirts - "+tshirts+" Rs.\n");
  System.out.print("4) Trousers - "+trousers+" Rs.\n");
  System.out.print("\nEnter your Choice = ");
  ch = s_obj.nextInt();
  System.out.print("\nToday is - \n");
  System.out.print("1) Monday\n");
  System.out.print("2) Tuesday\n");
  System.out.print("3) Wednesday\n");
  System.out.print("4) Thursday\n");
  System.out.print("5) Friday\n");
  System.out.print("6) Saturday\n");
  System.out.print("7) Sunday\n");
  System.out.print("\nEnter your Choice = ");
  day = s_obj.nextInt();
  if(day<1 && day>7)
  {
   System.out.print("\nWrong Choice...");
  }
  switch(ch)
  {
   case 1:
   {
    if(day == 7)
    {
     System.out.print("\nCongrats.. You recieve 10% discount...\n");
     int temp=0;
     temp = jeans-(int)(jeans*0.1);
     Bill obj = new Bill();
     obj.Bill_Counter(temp);
    }
    else
    {
     Bill obj = new Bill();
     obj.Bill_Counter(jeans);
    }
   }
   break;
   case 2:
   {
    if(day == 7)
    {
     System.out.print("\nCongrats.. You recieve 10% discount...\n");
     int temp=0;
     temp = shirts-(int)(shirts*0.1);
     Bill obj = new Bill();
     obj.Bill_Counter(temp);
    }
    else
    {
     Bill obj = new Bill();
     obj.Bill_Counter(shirts);
    }
   }
   break;
   case 3:
   {
    if(day == 7)
    {
     System.out.print("\nCongrats.. You recieve 10% discount...\n");
     int temp=0;
     temp = tshirts-(int)(tshirts*0.1);
     Bill obj = new Bill();
     obj.Bill_Counter(temp);
    }
    else
    {
     Bill obj = new Bill();
     obj.Bill_Counter(tshirts);
    }
   }
   break;
   case 4:
   {
    if(day == 7)
    {
     System.out.print("\nCongrats.. You recieve 10% discount...\n");
     int temp=0;
     temp = trousers-(int)(trousers*0.1);
     Bill obj = new Bill();
     obj.Bill_Counter(temp);
    }
    else
    {
     Bill obj = new Bill();
     obj.Bill_Counter(trousers);
    }
   }
   break;
   default:
   {
   }
  }
 }
}

class Shoes
{
 Scanner s_obj = new Scanner(System.in);
 int day,ch,loffers=649,sports=2549,formal=1999,casual=1099;
 Shoes()
 {
  System.out.print("\nShoes Store\n\n");
  System.out.print("1) Loafers - "+loffers+" Rs.\n");
  System.out.print("2) Casual Shoes - "+casual+" Rs.\n");
  System.out.print("3) Formal Shoes - "+formal+" Rs.\n");
  System.out.print("4) Sports Shoes - "+sports+" Rs.\n");
  System.out.print("\nEnter your Choice = ");
  ch = s_obj.nextInt();
  switch(ch)
  {
   case 1:
   {
    Bill obj = new Bill();
    obj.Bill_Counter(loffers);
   }
   break;
   case 2:
   {
    Bill obj = new Bill();
    obj.Bill_Counter(casual);
   }
   break;
   case 3:
   {
    Bill obj = new Bill();
    obj.Bill_Counter(formal);
   }
   break;
   case 4:
   {
    Bill obj = new Bill();
    obj.Bill_Counter(sports);
   }
   break;
   default:
   {
   }
  }
 }
}

class Jewellery
{
 Scanner s_obj = new Scanner(System.in);
 int day,ch,neckles=999,bangles=549,bracelet=299,chain=149;
 Jewellery()
 {
  System.out.print("\nJewellery Store\n\n");
  System.out.print("1) Chain - "+chain+" Rs.\n");
  System.out.print("2) Bangles - "+bangles+" Rs.\n");
  System.out.print("3) Necklace - "+neckles+" Rs.\n");
  System.out.print("4) Bracelets - "+bracelet+" Rs.\n");
  System.out.print("\nEnter your Choice = ");
  ch = s_obj.nextInt();
  switch(ch)
  {
   case 1:
   {
    Bill obj = new Bill();
    obj.Bill_Counter(chain);
   }
   break;
   case 2:
   {
    Bill obj = new Bill();
    obj.Bill_Counter(bangles);
   }
   break;
   case 3:
   {
    Bill obj = new Bill();
    obj.Bill_Counter(neckles);
   }
   break;
   case 4:
   {
    Bill obj = new Bill();
    obj.Bill_Counter(bracelet);
   }
   break;
   default:
   {
   }
  }
 }
}

class Evaluation2
{
 public static void main(String arg[])
 {
  int i,n;
  Scanner s_obj = new Scanner(System.in);
  System.out.print("\nEnter no. of Customers = ");
  n = s_obj.nextInt();
  for(i=1;i<=n;i++)
  {
   int ch;
   System.out.print("\n\nFor Customer "+i+" :-\n");
   System.out.print("\nShopping Mall\n\n");
   System.out.print("1) Food Items\n");
   System.out.print("2) Clothes\n");
   System.out.print("3) Shoes\n");
   System.out.print("4) Jewellery\n");
   System.out.print("\nEnter your Choice = ");
   ch = s_obj.nextInt();
   switch(ch)
   {
    case 1:
    {
     Food_Item obj = new Food_Item();
    }
    break;
    case 2:
    {
     Clothes obj = new Clothes();
    }
    break;
    case 3:
    {
     Shoes obj = new Shoes();
    }
    break;
    case 4:
    {
     Jewellery obj = new Jewellery();
    }
    break;
    default:
    {
    }
   }
  } 
 }
}
