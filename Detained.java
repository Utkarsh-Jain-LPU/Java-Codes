import java.lang.*;
import java.util.*;

class Detained
{
 static float temp=0;
 static int n,s,i,j,k;
 public static void main(String arg[])
 {
  Detained c_obj = new Detained();
  Scanner s_obj = new Scanner(System.in);
  System.out.print("\nEnter no. of Student = ");
  n = s_obj.nextInt();
  System.out.print("Enter no. of Subjects = ");
  s = s_obj.nextInt();
  float agr[] = new float[n];
  float A[][] = new float[n][s+1];
  for(i=0;i<n;i++)
  {
   for(j=0;j<s+1;j++)
   {
    if(j==0)
    {
     System.out.print("\nEnter Registration no. of "+(i+1)+" Student = ");
     A[i][j] = s_obj.nextFloat();
    }
    else
    {
     System.out.print("Enter Attendance of "+j+" Subject ( in % ) = ");
     A[i][j] = s_obj.nextFloat();
    }
   }
  }
  for(i=0;i<n;i++)
  {
   float var=0;
   for(j=1;j<s+1;j++)
   {
    var = c_obj.CmpAgr(A[i][j]);
   }
   agr[i] = var/s;
   temp = 0;
  }
  System.out.print("\n<-- Attendance -->\n");
  for(k=0;k<n;k++)
  {
   c_obj.detain(agr[k],A[k][0]);
  }
 }
 public float CmpAgr(float x)
 {
  temp = temp+x;
  return temp;
 }
 public void detain(float y,float z)
 {
  if(y<40)
  {
   System.out.print("\n");
   System.out.print((int)z+" - Detained");
  }
  else
  {
   System.out.print("\n");
   System.out.print((int)z+" - Excellent");
  }
 }
}