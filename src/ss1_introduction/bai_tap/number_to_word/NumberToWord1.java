package ss1_introduction.bai_tap.number_to_word;

import java.util.Scanner;

public class NumberToWord1 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        int hundreds=number/100;
        int tens=(number%100);

    }
}
