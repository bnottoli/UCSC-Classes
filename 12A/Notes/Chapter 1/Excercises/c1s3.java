import java.util.*;

class c1s3 {
  public static void main (String[] args) {
    int price, change, dimes, pennies;
    Scanner scan = new Scanner (System.in);
    System.out.println ("type price (0 to 100):");
    price = scan.nextInt();
    change = 100 - price;         // How much change 
    dimes = change / 10;          // Number of dimes
    pennies = change % 10;       // Number of pennies 
    System.out.print ("The change is :");
    System.out.format (" %s dimes %s pennies\n", dimes, pennies);
  }
}
