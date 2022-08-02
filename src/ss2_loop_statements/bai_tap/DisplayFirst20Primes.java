package ss2_loop_statements.bai_tap;

import java.util.Scanner;

public class DisplayFirst20Primes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of Primes: ");
        int number = scanner.nextInt();
        int count = 0;
        int input = 2;
        while (count < number) {
            boolean check = false;

            for (int i = 2; i < input; i++) {
                if (input % i == 0) {
                    check = true;
                    break;
                }

            }
            if (!check) {
                count++;
                System.out.print(input+"\t");
            }
            input++;
        }

    }
}
