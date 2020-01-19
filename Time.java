import java.lang.*;
import java.time.LocalTime;
import java.time.temporal.*;

class Time
{
 public static void main(String arg[])
 {
  LocalTime obj = LocalTime.now(); // Current Time
  LocalTime obj1 = LocalTime.of(12,23,34); // HH:MM:SS
  LocalTime obj2 = LocalTime.parse("20:29:32"); // Display as Time
  System.out.println("      Time : "+obj);
  System.out.println("      Time : "+obj1); 
  System.out.println("      Time : "+obj2); 
  System.out.println("Difference : "+obj1.until(obj2,ChronoUnit.HOURS)); // Difference according to Hours 
 }
}