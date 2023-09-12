import java.util.Random;
import java.util.Scanner;

class Game {
    int computer;

    public Game() {
        Random rand = new Random();
        computer = rand.nextInt(100);
        System.out.println("Guess the Number from 1 to 100");
    }

    public int computerNo() {
        return computer;
    }
}

public class Ngg {
    static int takeUserInput() {
        int user;
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        user = sc.nextInt();
        return user;
    }

    static void isCorrectNumber(int i, int j) {
        if (i == j) {
            System.out.println("Correct number guessed!");
        } else if (i > j) {
            System.out.println("Your number is greater than the computer's number.");
        } else {
            System.out.println("Your number is smaller than the computer's number.");
        }
    }

    public static void main(String[] args) {
        int user = 0, computer = 0, iteration = 0;
        Game g = new Game();
        do {
            user = takeUserInput();
            computer = g.computerNo();
            // Debug statements
            // System.out.println("User: " + user);
            // System.out.println("Computer: " + computer);
            isCorrectNumber(user, computer);
            iteration++;
        } while (user != computer);

        System.out.println("You guessed the number in " + iteration + " iterations.");
    }
}