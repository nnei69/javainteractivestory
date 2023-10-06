import java.util.Scanner;

public class InteractiveStory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Interactive Story!");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Introduction
        System.out.println("\nHello, " + name + "! You find yourself at a crossroad in the forest.");
        System.out.println("You have two paths to choose from: 'left' or 'right'.");
        System.out.print("Which path will you take? ");
        String choice = scanner.nextLine();

        if (choice.equals("left")) {
            // Left path
            System.out.println("\nYou chose the left path and found a hidden cave.");
            System.out.println("Inside the cave, you discover a treasure chest.");
            System.out.print("Will you open the chest ('open') or leave it ('leave')? ");
            choice = scanner.nextLine();

            if (choice.equals("open")) {
                // Open the chest
                System.out.println("\nYou open the chest and find a valuable gemstone!");
                System.out.println("Congratulations, " + name + "! You are rich!");
            } else if (choice.equals("leave")) {
                // Leave the chest
                System.out.println("\nYou decide to leave the chest and continue your journey.");
                // Add more story content and choices here...
            } else {
                // Invalid choice
                System.out.println("\nInvalid choice. You're paralyzed by indecision.");
            }
        } else if (choice.equals("right")) {
            // Right path
            System.out.println("\nYou chose the right path and encountered a mystical waterfall.");
            System.out.println("You notice a hidden cave behind the waterfall.");
            System.out.print("Do you want to explore the cave ('explore') or avoid it ('avoid')? ");
            choice = scanner.nextLine();

            if (choice.equals("explore")) {
                // Explore the cave
                System.out.println("\nYou enter the cave and find a chest filled with ancient artifacts.");
                // Add more story content and choices here...
            } else if (choice.equals("avoid")) {
                // Avoid the cave
                System.out.println("\nYou decide not to risk it and continue your journey.");
                // Add more story content and choices here...
            } else {
                // Invalid choice
                System.out.println("\nInvalid choice. Fear holds you back.");
            }
        } else {
            // Invalid choice
            System.out.println("\nInvalid choice. You're paralyzed by indecision.");
        }

        // End of the story
        System.out.println("\nThanks for playing, " + name + "! Goodbye.");
    }
}
