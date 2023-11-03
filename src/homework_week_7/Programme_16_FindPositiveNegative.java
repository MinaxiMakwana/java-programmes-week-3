package homework_week_7;

import java.util.Scanner;

/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 *  * “ZERO”
 */
public class Programme_16_FindPositiveNegative {
    public static void main(String[] args) {
        //scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        findNumberIsPositiveNegativeOrZero(number);
        //closing scanner object
    }
    //Finding the number is positive Negative or zero
    public static void findNumberIsPositiveNegativeOrZero(int number){
        if (number > 0){
            System.out.println(number + " is a Positive number");
        } else if (number < 0){
            System.out.println(number + " is a Negative number");
        } else {
            System.out.println(number + " is Zero");
        }
    }
}
