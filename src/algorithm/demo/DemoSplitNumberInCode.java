package algorithm.demo;

import java.util.Arrays;
import java.util.Scanner;

public class DemoSplitNumberInCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String code=scanner.nextLine();
        String[] number = code.split("-");
        System.out.println(Integer.parseInt(number[1]));
    }
}
