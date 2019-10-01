//#2.) I did not know what it meant by Initialization. Initialization is assigning/declaring a variable.
//     boolean: boolean climateChange = true;  integer num1 = 123;   String name = "Conrad Bradford";

//#3.) I got the first box of problem 3 wrong because I used the wrong variable in the equation.
//     m*r/n-n*m = 6-8 = -2

//#4.) I declared the object (rand) as the method instead of .nextInt().
//     The method within rand.nextInt(10); is nextInt() and the parameter is 10 (# of possible int).

//#5.) I used the wrong class and method to execute the task. The proper class to use would be the String class with the method .substring().

//#6.) casting (int) for Math.abs() is OK but redundant; The nounds of the random number are 1-100 inclusive not exclusive;

import java.util.Scanner;
import java.util.Random;

public class Unit2Corrections {
  public static void main (String[] args) {
//problem5
    String firstName = "Sofia";
    String middleName = "Maria";
    String lastName = "Hernandez";
    String firstInit = firstName.substring(0,1).toLowerCase();
    String middleInit = middleName.substring(0,1).toLowerCase();
    String lastInit = lastName.substring(0,1).toLowerCase();
    System.out.println(firstInit + middleInit + lastInit);

    Scanner scan = new Scanner(System.in);
    System.out.println("Provide a number between 1 and 100 inclusive");
    int provided = scan.nextInt();
    Random rand = new Random();
    int random = rand.nextInt(100) + 1;
    int luckyNum = Math.abs(provided - random);
    System.out.println("Your lucky number (" + luckyNum + ") is the absolute difference of: " + provided + " and " + random);
  }
}
