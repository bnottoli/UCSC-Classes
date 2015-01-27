//=================================================//
//  Author:      Bianca Nottoli                    //
//  Date:        Jan 8, 2014                       //
//  Program:     Lab 1 Assignment                  //
//  Description: Hello World program               //
//=================================================//


import java.util.*;

class Hello {
	public static String printer(String name) {
		Scanner scan = new Scanner( System.in );
    	System.out.print( "What's your name? ");
    	System.out.format( "Hi %s & %s!\n", scan.next(), name );
    	System.out.print("http://users.soe.ucsc.edu/~pang/12a/w14/\n");
		return "Bianca is fucking awesome!";
	}

    public static void main( String[] args) {
    	//String message = printer("Brian");
    	//System.out.println(message);
    }
}
