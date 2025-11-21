package tut3.exercise1.solution;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        if (args.length != 1) {
            return;
        }
        String initial = args[0];

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            System.out.println("Enter something:");
            String line = scanner.nextLine();

            if (line.equals(Command.QUIT.name())) {
                break;
            } else if (line.equals(Command.SAY_HI.name())) {
                System.out.println("Hello World");
            } else if (line.equals(initial)) {
                correctAnswer();
            }
        }

        scanner.close();
    }

    static void correctAnswer() {
        System.out.println("Correct answer");
    }
}
