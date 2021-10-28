// author Esai Hernandez

// Write a program that asks the user for the name of their dog, and then generates a fake DNA background report on the pet dog.
// It should assign a random percentage to 5 dog breeds (that should add up to 100%!) 

import java.util.*;

public class DogGenetics {

    private static int num1, num2, num3, num4, num5;

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your dog's name? ");
        String userInput = input.nextLine();

        System.out.println("Well then, I have this highly reliable report on " + userInput
                + "'s prestigious background right here.\n");

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

    // generates 5 random percentages that add up to 100
    public static void generateRandomPercentages() {
        Random random = new Random();

        do {
            num1 = random.nextInt(100) + 1;
            num2 = random.nextInt(100) + 1;
            num3 = random.nextInt(100) + 1;
            num4 = random.nextInt(100) + 1;
            num5 = random.nextInt(100) + 1;
        } while (num1 + num2 + num3 + num4 + num5 != 100);

    }
}
