package inclass13june18;

import java.util.Scanner;

public class WindScale {

    public static void main(String[] args) {
        double windSpeed = 0;
        int cat = 0;
        Scanner input = new Scanner(System.in);

        //user input for a wind speed
        System.out.print("Enter a wind speed in mph: ");
        windSpeed = input.nextDouble();

        //if statement for the Saffir-Simpson Hurricane Scale
        if (windSpeed >= 156) {
            cat = 5;
            System.out.println(windSpeed + " mph is a Category " + cat + " hurricane.");
        } else if (windSpeed >= 131) {
            cat = 4;
            System.out.println(windSpeed + " mph is a Category " + cat + " hurricane.");
        } else if (windSpeed >= 111) {
            cat = 3;
            System.out.println(windSpeed + " mph is a Category " + cat + " hurricane.");
        } else if (windSpeed >= 96) {
            cat = 2;
            System.out.println(windSpeed + " mph is a Category " + cat + " hurricane.");
        } else if (windSpeed >= 74) {
            cat = 1;
            System.out.println(windSpeed + " mph is a Category " + cat + " hurricane.");
        } else {
            cat = 0;
            System.out.println(windSpeed + " mph is a Category " + cat + " hurricane.");
        }
    }
}
