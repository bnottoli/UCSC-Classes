
 import java.util. *;
 public class Average 
  {public static void main ( String [] args)
    {
      double number;
      int count = 0;
      double runningTotal = 0;
      Scanner scan = new Scanner (System.in);
      System.out.println("Type some numbers,the last one being 0");
      number = scan.nextDouble();
      while (number != 0)
      {
        runningTotal = runningTotal + number;
        count = count + 1;
        number = scan.nextDouble();
      }
      System.out.print("The average of the ");
      System.out.print(count);
      System.out.print(" number is ");
      System.out.println(runningTotal / count);
    }
 }