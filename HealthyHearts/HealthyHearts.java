import java.util.*;

public class HealthyHearts{
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int maxHeartRate = 220;

        System.out.print("What is your age? ");
        int inputAge = Integer.parseInt(input.nextLine());
        maxHeartRate -= inputAge;

        System.out.println("Your maximum heart rate should be " + maxHeartRate + " beats per minute");
        System.out.println("Your target HR Zone is " + (int)(Math.round(maxHeartRate * .50)) + " - " + (int)(Math.round(maxHeartRate * .85)) + " beats per minute");

        input.close();
    }
}
