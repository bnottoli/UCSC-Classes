import java.util.*;

class GreatestCommonDivisor 
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter 2 integers. ");
    int num1 = scan.nextInt();
    int num2 = scan.nextInt();
    int m = num1, n = num2, remainder;
    do 
    {
      remainder = m % n; 
      m = n;
      n = remainder;
    }
    while(n != 0);
    System.out.println("GCD (" + num1 + "," + num2 +") = " + m);
  }
}