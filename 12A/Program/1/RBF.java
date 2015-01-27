//=================================================//
//  Author:      Bianca Nottoli                    //
//  Date:        Jan 13, 2015                      //
//  Program:     Program 1 Assignment              //
//  Description: RBF Program                       //
//=================================================//


import java.util.*;
import java.lang.*;

class RBF {

  static float cSquared = (float) Math.pow(0.456, 2);

  public static float linear (float distance)
  {
    return distance;
  }

  public static float multiquadric (float distance)
  {
    float dSquared = (float) Math.pow(distance, 2);
    return (float) Math.sqrt(dSquared + cSquared);
  }

  public static float gaussian (float distance)
  {
    float dSquared = (float) Math.pow(distance, 2);
    return (float) Math.exp(-cSquared * dSquared);
  }
  
  public static float thinPlate (float distance)
  {
    float dSquared = (float) Math.pow(distance, 2);
    return (float) (dSquared * Math.log(distance));
  }

  public static void main (String[] args)
  {
    /*
      1. print Enter Distance d:
      2. wait for a number and enter key (Scanner)
      3. Parse string and turn into float
      4. Call calculation functions (each function should print)
    */

    // Get Distance
    Scanner scan = new Scanner( System.in );
    System.out.print("Enter Distance d  : ");
    float distance = scan.nextFloat();

    // Calculations
    System.out.format("Linear RBF       = %.3f\n", linear(distance));
    System.out.format("Multiquadric RBF = %.3f\n", multiquadric(distance));
    System.out.format("Gaussian RBF     = %.3f\n", gaussian(distance));
    System.out.format("Thin Plate RBF   = %.3f\n", thinPlate(distance));
  }
}
