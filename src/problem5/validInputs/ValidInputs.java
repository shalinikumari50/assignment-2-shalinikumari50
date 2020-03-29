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

}
