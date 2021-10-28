// author Esai Hernandez

import java.util.*;

public class RockPaperScissors {

    private static int numOfTies = 0, numOfUserWins = 0, numOfComputerWins = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean validChoice = false;
        boolean userPlayAgain = true;
        int userInput;

        do {
            // Reset game stats for new rounds
            numOfTies = 0; 
            numOfUserWins = 0; 
            numOfComputerWins = 0;
            
            int numOfRounds = setNumOfRounds(input);

            // if rounds not between 0 or 10 quit game
            if (numOfRounds == 0) {
                return;
            }
            // if not valid number inputted for rounds quit game
            if (numOfRounds == -1) {
                return;
            }
            // play game for numOfRounds
            for (int x = 0; x < numOfRounds; x++) {
                validChoice = false;
                do {
                    System.out.println("Will you throw Rock, Paper, or Scissors?");
                    System.out.println("Please enter digit input: Rock = 1, Paper = 2, Scissors = 3");

                    // verify user input is integer value
                    try {
                        userInput = Integer.parseInt(input.nextLine());
                    } catch (Exception e) {
                        System.out.println("Not a valid input");
                        return;
                    }
                    
                    // Verify user input is option choice between 1 - 3
                    if (userInput > 3 || userInput < 1) {
                        System.out.println("Not a valid Choice");
                    } else {
                        validChoice = true;
                    }
                } while (!validChoice);

                int computerInput = genComputerChoice();
                checkWhoWinsRound(userInput, computerInput);
            }

            //Display final game results
            display();

            // Check if player wants to play again
            validChoice = false;
            do {
                System.out.println("Do you want to play again? Yes or No");
                String playAgain = input.nextLine();
                if (playAgain.equalsIgnoreCase("Yes")) {
                    userPlayAgain = true;
                    validChoice = true;
                } else if (playAgain.equalsIgnoreCase("No")) {
                    userPlayAgain = false;
                    validChoice = true;
                } else {
                    System.out.println("Not a valid choice");
                }
            } while (!validChoice);

        } while (userPlayAgain);

        //End of game
        System.out.println("Thanks for playing!");
        input.close();
    }

    // Print out Game Round Results
    public static void display() {
        System.out.println("\nUser Wins: " + numOfUserWins);
        System.out.println("Computer Wins: " + numOfComputerWins);
        System.out.println("Total Ties: " + numOfTies);
        if (numOfUserWins > numOfComputerWins) {
            System.out.println("Winner: User");
        } else if (numOfUserWins < numOfComputerWins) {
            System.out.println("Winner: Computer");
        } else {
            System.out.println("Tie Game");
        }
    }

    // check who won round and updates win and ties values
    public static void checkWhoWinsRound(int userInput, int computerInput) {
        switch (userInput) {
            case 1:
                switch (computerInput) {
                    case 1:
                        System.out.println("Tie");
                        numOfTies++;
                        break;
                    case 2:
                        System.out.println("Computer Win");
                        numOfComputerWins++;
                        break;
                    case 3:
                        System.out.println("User Win");
                        numOfUserWins++;
                        break;
                }
                break;
            case 2:
                switch (computerInput) {
                    case 1:
                        System.out.println("User Win");
                        numOfUserWins++;
                        break;
                    case 2:
                        System.out.println("Tie");
                        numOfTies++;
                        break;
                    case 3:
                        System.out.println("Computer Win");
                        numOfComputerWins++;
                        break;
                }
                break;
            case 3:
                switch (computerInput) {
                    case 1:
                        System.out.println("Computer Win");
                        numOfComputerWins++;
                        break;
                    case 2:
                        System.out.println("User Win");
                        numOfUserWins++;
                        break;
                    case 3:
                        System.out.println("Tie");
                        numOfTies++;
                        break;
                }
                break;
        }
    }

    // generate Random computer choice
    public static int genComputerChoice() {
        Random random = new Random();
        int computerChoice = random.nextInt(3) + 1;
        return computerChoice;
    }

    // Get user input on how many rounds they will like to play
    public static int setNumOfRounds(Scanner input) {
        int numInput = 0;
        System.out.println("How many rounds would you like to play? Max = 10, Min = 1");

        // verify user input is integer value
        try {
            numInput = Integer.parseInt(input.nextLine());
        } catch (Exception e) {
            System.out.println("Not a valid input");
            return -1;
        }

        if (numInput > 10 || numInput <= 0) {
            System.out.println("Not a valid range input");
            return 0;
        }

        return numInput;
    }

}
