//=================================================//
//  Author:      Bianca Nottoli                    //
//  Date:        Jan 18, 2015                      //
//  Program:     Lab 2 Assignment                  //
//  Description: Secret Number Program             //
//=================================================//

import java.util.*;

class Guess
{
  public static void main(String[] args)
  {
    // Setting up inital variables    
    Scanner scan = new Scanner( System.in );
    int     seed, secret, guessed, guesses = 0;
    boolean inLoop = true;
    
    // Calculating random integer
    System.out.print("Enter a positive integer: ");
    seed = scan.nextInt();
    System.out.format( "Seed value is: %d\n", seed );
    Random  generator = new Random( seed );
    secret = generator.nextInt( 100 ) + 1;	// 1..100 instead of 0..99
    
    // Looping for user guessing
    while (inLoop) 
    {
      System.out.print("Guess my number between 1 and 100: ");
      guessed = scan.nextInt();
      guesses++;
      inLoop = (guessed != secret);
      
      if(guessed > secret) {
        System.out.println("Guess a lower number");
      } else if(guessed < secret) {
        System.out.println("Guess a higher number");
      }
    }
    
    // User guessed right!
    System.out.format("GOT IT IN %s GUESSES!!\n", guesses);
  }
}
