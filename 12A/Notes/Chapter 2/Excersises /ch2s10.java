import java.util.*;

class MakeChange 
{
  public static void main(String[] args)
  {
    int price, change, dimes, pennies;
    Scanner scan = new Scanner(System.in);
    System.out.println("type price (0 to 100): ");
    price = scan.nextInt();
    change = 100- price;
    dimes = change / 10;
    pennies = change % 10;
    System.out.print ("The change is : ");
    System.out.println(dimes + "dimes" + pennies + "pennies");
    
  }
}