/*
 * Matt Keplinger, CSCI 1301
 * IF Statement Examples
 * 13 June, 2018
 */
package inclass13june18;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        int userAge = 0;
        boolean isEligible = false;
        String elig = "";

        Scanner input = new Scanner(System.in);
        //Age Requestor program. Compares Age given to legal voting age
        System.out.print("Please enter your age: ");
        userAge = input.nextInt();

        //Two-Way If Statement (IF-ELSE)
        if (userAge >= 18){
            System.out.println(userAge + " is eligible to vote.");
        } else { 
            System.out.println(userAge + " is ineligible to vote.");
        }        
        if (userAge >= 18) {
            isEligible = true;
            elig = " is";
            System.out.println(userAge + elig + " is old enough to vote.");
        } else {
            isEligible = false;
            elig = " is not";
            System.out.println(userAge + elig + " old enough to vote. Voters must be 18 years old.");
        }

    }
}
