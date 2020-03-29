package problem5.validInputs;

import java.util.Scanner;

public class ValidInputs {
    private static Scanner scanner;

    static {
        scanner = new Scanner(System.in);
    }

    private boolean isEmpty(String inputFromUser) {
        return inputFromUser.equals("");
    }

    private String inputValidString() {
        String inputFromUser;
        while (true) {
            inputFromUser = scanner.nextLine().trim();
            if (isEmpty(inputFromUser)) {
                System.out.println("Enter a valid input");
                continue;
            }
            return inputFromUser;
        }
    }

    private char inputValidChar() {
        char input;
        while (true) {
            String inputFromUser = inputValidString();

            //check if user entered more than one character i.e. a string instead of a character
            if (inputFromUser.length() > 1) {
                System.out.println("Enter a single character");
                continue;
            }
            input = inputFromUser.charAt(0);
            return input;
        }
    }

}
