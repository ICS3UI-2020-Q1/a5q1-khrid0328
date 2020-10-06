import java.util.Scanner;
/**
 * This program asks the user for an integer. It then creates a “multiplication table” for that number from 1 to 12.
 * @author Dafna Khripun
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    // ask the user to enter a number to create a multiplication table for
    System.out.println("Please enter an integer to create a multiplication table for");

    // create a variable for user input
    int integer = input.nextInt();
    
    // use a for loop to create a multiplication table
    for(int i = 1; i <= 12; i++ ){

      // calculate the product of the integer times the count
      int product = i * integer;

      // loop action: print the "multiplication line"
      System.out.println(i + " x " + integer + " = " + product);
    }
  }
}
