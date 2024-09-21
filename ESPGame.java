/*
 * Class: CMSC203 
 * Instructor: Professor Thai
 * Description: Assignment 1
 * Due: 08/20/2024
 * Platform/compiler: Visual Studio Code
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Johan (Stephen) Mbouwa
*/
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;

public class ESPGame {
    
    // Constants for color names
    public static final String COLOR_1 = "black";
    public static final String COLOR_2 = "white";
    public static final String COLOR_3 = "gray";
    public static final String COLOR_4 = "silver";
    public static final String COLOR_5 = "maroon";
    public static final String COLOR_6 = "red";
    public static final String COLOR_7 = "purple";
    public static final String COLOR_8 = "fuchsia";
    public static final String COLOR_9 = "green";
    public static final String COLOR_10 = "lime";
    public static final String COLOR_11 = "olive";
    public static final String COLOR_12 = "yellow";
    public static final String COLOR_13 = "navy";
    public static final String COLOR_14 = "blue";
    public static final String COLOR_15 = "teal";
    public static final String COLOR_16 = "aqua";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        // Step 1: Display the colors from the file colors.txt
        System.out.println("CMSC203 Assignment1: Test your ESP skills!");
        String fileName = "colors.txt";

        File colorFile = new File(fileName);
        Scanner fileReader = new Scanner(colorFile);

        System.out.println("There are sixteen colors from the file:");
        int colorCount = 1;
        while (fileReader.hasNextLine()) {
            String color = fileReader.nextLine();
            System.out.println(colorCount + " " + color);
            colorCount++;
        }
        fileReader.close();

        int correctGuesses = 0;

        // Step 2 & 3: Repeat guessing 3 times
        for (int round = 1; round <= 3; round++) {
            System.out.println("\nRound " + round);
            System.out.println("I am thinking of a color.");
            System.out.println("Is it one of the list of colors above?");

            // Randomly select a color
            int randomColorIndex = rand.nextInt(16) + 1;
            String randomColor = "";

            // No extra method - get color based on randomColorIndex directly in main()
            switch (randomColorIndex) {
                case 1: randomColor = COLOR_1; break;
                case 2: randomColor = COLOR_2; break;
                case 3: randomColor = COLOR_3; break;
                case 4: randomColor = COLOR_4; break;
                case 5: randomColor = COLOR_5; break;
                case 6: randomColor = COLOR_6; break;
                case 7: randomColor = COLOR_7; break;
                case 8: randomColor = COLOR_8; break;
                case 9: randomColor = COLOR_9; break;
                case 10: randomColor = COLOR_10; break;
                case 11: randomColor = COLOR_11; break;
                case 12: randomColor = COLOR_12; break;
                case 13: randomColor = COLOR_13; break;
                case 14: randomColor = COLOR_14; break;
                case 15: randomColor = COLOR_15; break;
                case 16: randomColor = COLOR_16; break;
            }

            // User guess
            System.out.print("Enter your guess: ");
            String userGuess = input.nextLine().trim().toLowerCase();

            // Display the randomly selected color
            System.out.println("I was thinking of " + randomColor.substring(0, 1).toUpperCase() + randomColor.substring(1).toLowerCase() + ".");

            // Compare user guess with random color (case insensitive)
            if (userGuess.equals(randomColor)) {
                correctGuesses++;
            }
        }

        // Step 4: Game Over - Display results
        System.out.println("\nGame Over");
        System.out.println("You guessed " + correctGuesses + " out of 3 colors correctly.");

        // Step 5: Ask for name, description, and due date
        System.out.print("Enter your name: ");
        String userName = input.nextLine();

        System.out.print("Describe yourself: ");
        String userDescription = input.nextLine();

        // Display the user info
        System.out.println("\nUser Name: " + userName);
        System.out.println("User Description: " + userDescription);
        System.out.print("Due Date (08/20/2024): ");
    }
}
