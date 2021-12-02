
package inclass13june18;
import java.util.Scanner;
public class InClass13June18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //use mod operator to constrain value to 0-10
        long randNum = System.currentTimeMillis(); 
        long compareNum = randNum % 11;
        //output the randomly generated number for the user (error checking)
        System.out.println("Randomly generated number is: " + compareNum + ".");
        
        //user input
        System.out.print("Please input a number: ");
        int userNum = input.nextInt();
        
        //boolean conditions to compare user input to randomly generated value
        boolean higherUserNum = userNum > compareNum;
        boolean lowerUserNum = userNum < compareNum;
        boolean equalUserNum = userNum == compareNum;
        
        //output of comparison results to user for modification/evaluation
        System.out.println("User number is higher: " + higherUserNum);
        System.out.println("User number is lower: " + lowerUserNum);
        System.out.println("User number is equal to: " + equalUserNum);
          
        }
}
