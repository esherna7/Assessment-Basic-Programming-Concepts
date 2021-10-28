/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esai Hernandez
 */
import java.util.*;

public class DogGenetics {

    static int num1, num2, num3, num4, num5;

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your dog's name? ");
        String userInput = input.nextLine();

        System.out.println("Well then, I have this highly reliable report on "
                + userInput + "'s prestigious background right here.\n");

        System.out.println(userInput + " is:\n");
        generateRandomPercentages();
        System.out.println(num1 + "% St. Bernard");
        System.out.println(num2 + "% Chihuahua");
        System.out.println(num3 + "% Dramatic RedNosed Asian Pug");
        System.out.println(num4 + "% Common Cur");
        System.out.println(num5 + "% King Doberman");

        System.out.println("\nWow, that's QUITE the dog!");
        input.close();
    }

    public static void generateRandomPercentages() {
        Random random = new Random();
        int percentageLeft = 100;
        num1 = random.nextInt(percentageLeft) + 1;
        percentageLeft -= num1;
        num2 = random.nextInt(percentageLeft) + 1;
        percentageLeft -= num2;
        num3 = random.nextInt(percentageLeft) + 1;
        percentageLeft -= num3;
        num4 = random.nextInt(percentageLeft) + 1;
        percentageLeft -= num4;
        num5 = percentageLeft;
    }
}
