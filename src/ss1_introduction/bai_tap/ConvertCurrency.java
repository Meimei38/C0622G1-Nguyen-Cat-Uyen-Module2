package ss1_introduction.bai_tap;

import java.util.Scanner;

public class ConvertCurrency {
    public static void main(String[] args) {
        System.out.println("Please enter the amount of money (in USD): ");
        Scanner scanner = new Scanner(System.in);
        double usd = scanner.nextDouble();
        double vnd = usd * 23000;
        System.out.println(usd + " USD" + " is " + vnd + " VNĐ");
    }
}
