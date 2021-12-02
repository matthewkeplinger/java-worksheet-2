/**
 * File: RandomNumbers.java
 * @author Christopher Williams
 * Created on: Jun 13, 2017
 * Description: Generate random numbers, scales, limits to whole number
 * 				NOTE:  run multiple times to get different values  
 */
public class RandomNumbers {

	public static void main(String[] args) {
		// generate and view random number
		double randNum = Math.random();
		System.out.println("Random number (original): \t" + randNum);
		
		// scale to be from 0-10
		double scaledRand = randNum * 11;
		System.out.println("Random number (scaled): \t" + scaledRand);
		
		// whole number from scaled version, note data type
		int wholeRand = (int)scaledRand;
		System.out.println("Random number (whole #): \t" + wholeRand);
	}

}
