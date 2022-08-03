package ss3_array_and_methods.bai_tap;

import java.util.Scanner;

public class CountOccurrencesInList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();
        System.out.println("Enter a character to check occurrences: ");
        char character = scanner.nextLine().charAt(0);
        int count = 0;
        boolean checkOccurrence = false;
        for (int i = 0; i < str.length(); i++) {
            if (character == str.charAt(i)) {
                count++;
                checkOccurrence = true;
            }

        }
        if (checkOccurrence) {
            System.out.printf("Number of occurrences: %d", count);

        } else {
            System.out.println("No occurrence.");
        }

    }
}
