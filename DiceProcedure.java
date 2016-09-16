/*******************************************************************************
* Created by: Matthew Brean
* Created on: 2016-09-15
* Created for: ICS4U
* Daily Assignment: Unit #1-06
* This program calls a procedure to roll a dice
*******************************************************************************/

import java.util.Scanner;
import java.util.Random;


public class DiceProcedure {

    public static void RollDie(int maxValue) {
    	Random rand = new Random();
    	int a= 2; //random variable thats going to make while loop always true below
    	
    	Scanner DICE = new Scanner(System.in);
    	String re = "again";
    	
    	while (a==2) { //infinite loop to make it keep generating random numbers after pressing enter
	
    	int randomNumber = rand.nextInt(maxValue) + 1; // 6 is max and 1 is min # it can randomly generate
    		//maxValue is 6 as defined when passed in from main
        
    	System.out.println("Random number is: " + randomNumber);

    	System.out.println("Press 'enter' to generate another number.");

    		 re = DICE.nextLine();

    	}
    }
	
public static void main(String[] args)
{

    RollDie(6); //call above function

 }
}
