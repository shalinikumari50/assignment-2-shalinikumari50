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

    public String inputValidName() {
        //a valid name contains only alphabets(a-z or A-Z)
        int flag = 0;
        while (true) {
            String input = inputValidString();
            if (input.matches(".*[^a-zA-Z].*")) {
                if (flag == 1 && input.equals("0")) {
                    return null;
                }
                System.out.println("The name should not contain any special characters or digits!");
                System.out.println("Enter a valid name or '0' to quit");
                flag = 1;
                continue;
            }
            return input;
        }
    }

    private int inputValidInteger(int flag) {
        int number;
        while (true) {
            String numberString = inputValidString();
            if (numberString.equals("q") && flag == 1) {
                return -1;
            }
            try {
                number = Integer.parseInt(numberString);
            } catch (NumberFormatException nfe) {
                System.out.println("Enter valid integer or 'q' to exit");
                flag = 1;
                continue;
            }
            return number;
        }
    }


    public int inputValidPositiveInteger() {
        int number;
        int flag = 0;
        while (true) {
            number = inputValidInteger(flag);
            if (number == -1) {
                return -1;
            }

            if (number < 1) {
                System.out.println("Enter positive integer or 'q' to quit");
                flag = 1;
                continue;
            }
            return number;
        }
    }

    public int inputValidNonNegativeInteger() {
        int number;
        int flag = 0;
        while (true) {
            number = inputValidInteger(flag);
            if (number == -1) {
                return -1;
            }

            if (number < 0) {
                System.out.println("Enter non-negative integer or 'q' to quit");
                flag = 1;
                continue;
            }
            return number;
        }
    }

    public char inputValidChoice(char char1, char char2) {
        char choice;
        choice = inputValidChar();
        while (choice != char1 && choice != char2) {
            System.out.println("Enter '" + char1 + "' or '" + char2 + "' to give your response");
            choice = inputValidChar();
        }
        return choice;
    }


}
