package ss1_introduction.bai_tap.number_to_word;

import java.util.Scanner;

public class NumberToWord {
    public static void main(String[] args) {
        String[] ones = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        String[] tens = {"ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String[] teens = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number <= 10) {
            System.out.println(ones[number]);

        } else if (number < 20) {
            System.out.println(teens[(number % 10)]);
        } else if (number < 100) {
            if (number % 10 == 0) {
                System.out.println(tens[(number / 10) - 1]);
            } else {
                System.out.println(tens[(number / 10) - 1] + "-" + ones[(number % 10)]);
            }
        } else if (number < 1000) {
            if (number % 100 == 0) {
                System.out.println(ones[number / 100] + "hundred");
            } else {
                if (((number % 100)) < 10) {
                    System.out.println(ones[number / 100] + " hundred " + ones[((number % 100) % 10)]);
                } else if (((number % 100)) < 20) {
                    System.out.println(ones[number / 100] + " hundred " + teens[((number % 100) % 10)]);

                } else {
                    System.out.println(ones[number / 100] + " hundred " + tens[((number % 100) / 10) - 1] + " and " + ones[(number % 100) % 10]);

                }
            }
        }
    }
}
