/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20june18;

import java.util.Scanner;

public class ConditionalOperators {

    public static void main(String[] args) {
        int num = 0;
        int num2 = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Number Range Comparison Tool");
        System.out.println("----------------------------");

        System.out.print("Enter an integer: ");
        num = input.nextInt();

        // one line to determine if user input is between 1 and 5, declare whether or not it fits criteria to user
        System.out.println((num >= 1 && num <= 5) ? num + " is within the specified range of 1-5." : num + " is not within the specified range of 1-5.");

        // ask for second input, compare first to second
        System.out.print("Enter a second integer: ");
        num2 = input.nextInt();
        System.out.println("Your specified numbers are: " + num + "and" + num2);
    }
}
