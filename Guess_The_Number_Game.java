package CoreJava;

/*
Create a class Game, which allow a user to play "Guess the number" game once. Game should have the following methods
 1. Constructor to generate random number
 2. take user input of number
 3. is correct number to detect the number entered by the user is true
 4. getters and setters for number of guesses
*/

import java.util.Scanner;
import java.util.Random;

class Game{
    public int number;
    public int InputNumber;

    Game() {
        Random random = new Random();
        this.number = random.nextInt(100);
    }

    void takeUserInput() {
        System.out.print("Guess the number : ");
        Scanner scanner = new Scanner(System.in);
        InputNumber = scanner.nextInt();
    }

    boolean isCorrectNumber() {
        if (InputNumber == number) {
            System.out.println("Yes You Won!!!!!");
            return true;
        }
        else if (InputNumber > number) {
            System.out.println("Number is smaller than your Input.");
        }
        else {
            System.out.println("Number is greater than your Input.");
        }
        return false;
    }
}

public class Guess_The_Number_Game {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while (!b) {
            g.takeUserInput();
            b = g.isCorrectNumber();
            System.out.println(b);
        }
    }
}
