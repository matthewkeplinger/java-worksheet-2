/*-----------------------------------------------
 *Basic Calculator with divide by 0 error handler
 *Matt Keplinger, CSCI 1301
 *20June18, BasicCalculator.java
 *----------------------------------------------
*/
package pkg20june18;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        
        //declare variables for choice of operator, character of operator, and the inputs and result
        int choice = 0;
        double op1 = 0.0, op2 = 0.0, result = 0.0;
        char operator;

        Scanner input = new Scanner(System.in);

        System.out.println("       Basic Calculator");
        System.out.println("------------------------------");
        System.out.println("Now with improved divide by zero");
        System.out.println("function and kung-fu grip.");
        System.out.println(" ");
        //gather and store user input for two values
        System.out.print("Enter your first double value: ");
        op1 = input.nextDouble();

        System.out.print("Enter your second double value: ");
        op2 = input.nextDouble();
        
        //construct a menu with options for the operators
        System.out.println(" 1. + ");
        System.out.println(" 2. - ");
        System.out.println(" 3. * ");
        System.out.println(" 4. / ");
        System.out.print("Make your selection: ");
        choice = input.nextInt();
           
        //switch statement for the four basic operators 
        switch (choice) {
            case 1:
                result = op1 + op2;
                operator = '+';
                break;
            case 2:
                result = op1 - op2;
                operator = '-';
                break;
            case 3:
                result = op1 * op2;
                operator = '*';
                break;
            case 4:
                //result = op1 / op2;
                operator = '/';
                if (op2 != 0){
                    result = op1 / op2;
                } else { 
                    System.out.println("Cannot divide by zero.");
                    result = 0;
                }
                break;
            default:
                System.out.println("Not an option.");
                operator = ' ';
                break;
        }
        System.out.println("Your calculation is displayed below:");
        System.out.println(op1 + " " + operator + " " + op2 + " = " + result);
    }
}
