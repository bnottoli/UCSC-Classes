import static java.lang.Math. *;
public class SquareRoots 
{
  public static void main(String [] args)
  {
    int i;
    double squareRoot;
    for (i = 1, i <=  10; i++)
    {
      squareRoot = sqrt(i);
      System.out.println(" the square root of " + i + " is " + squareRoot);
    }
    System.out.println("That's All!");
  }
}