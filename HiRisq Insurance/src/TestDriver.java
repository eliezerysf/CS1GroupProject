/**
 * Tests class Driver by reading the data, calculating and printing
 * out the insurance premiums for four different drivers.
 */
import java.text.DecimalFormat;
class TestDriver {
	
   public static void main(String args[]) {
      Driver driver;
      driver = new Driver();
      driver.read();
      System.out.println("Premium: $" + driver.premium());
      driver.read();
      System.out.println("Premium: $" + driver.premium());
      driver.read();
      System.out.println("Premium: $" + driver.premium());
      driver.read();
      System.out.println("Premium: $" + driver.premium());
     
      DecimalFormat df = new DecimalFormat("#.##");
       System.out.println("Premium: $" + df.format(driver.premium()));
   }
}
 /* Driver's age
35
Number of Tickets
1
value of car
10000
Premium: $750.0
Driver's age
29
Number of Tickets
2
value of car
15000
Premium: $1406.25
Driver's age
19
Number of Tickets
3
value of car
850
Premium: $73.31249999999999
Driver's age
81
Number of Tickets
4
value of car
12500
Premium: $625.0 
*/

