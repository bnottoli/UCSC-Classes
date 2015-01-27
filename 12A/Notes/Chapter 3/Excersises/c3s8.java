import java.util.*;
class BreakContinue 
{
  public static void main (String [] args)
  {
    int n;
    Scanner scan = new Scanner(System.in);
    while (true)
    {
      System.out.print("Enter a positive integer ");
      System.out.print("or 0 to exit");
      n = scan.nextInt();
      if (n == 0)
        break;
      if (n < 0)
        continue;
      System.out.print("squareroot of " + n);
      System.out.println(" = " + Math.sqrt(n));
    }
    System.out.println("a zero was entered");
  }
}