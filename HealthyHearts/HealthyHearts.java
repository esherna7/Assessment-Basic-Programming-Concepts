// author Esai Hernandez
// Make a simple calculator that asks the user for their age. Then calculate the healthy heart rate range for that age, and display it.
// Their maximum heart rate should be 220 - their age.
// The target heart rate zone is the 50 - 85% of the maximum.

import java.util.*;

public class HealthyHearts{
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int maxHeartRate = 220;

        // Read user age input
        System.out.print("What is your age? ");
        int inputAge = Integer.parseInt(input.nextLine());
        maxHeartRate -= inputAge;

        // calculate and print max heart rate and target HR zone
        System.out.println("Your maximum heart rate should be " + maxHeartRate + " beats per minute");
        System.out.println("Your target HR Zone is " + (int)(Math.round(maxHeartRate * .50)) + " - " + (int)(Math.round(maxHeartRate * .85)) + " beats per minute");

        input.close();
    }
}
