package ss13_searching_algorithm.bai_tap.find_longest_ascending_string;

import java.util.LinkedList;
import java.util.Scanner;

public class FindLongestAscendingString {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Vui lòng nhập vào một chuỗi bất kì: ");
        String inputString = scanner.nextLine();
        LinkedList<Character> maxList = new LinkedList<>();
        LinkedList<Character> charList = new LinkedList<>();
        for (int i = 0; i < inputString.length(); i++) {
            charList.add(inputString.charAt(i));
            for (int j = i + 1; j < inputString.length(); j++) {
                if (inputString.charAt(j) > charList.getLast()) {
                    charList.add(inputString.charAt(j));
                }

            }
            if (charList.size() > maxList.size()) {
                maxList.clear();
                maxList.addAll(charList);
            }
            charList.clear();


        }
        for (char ch : maxList) {
            System.out.print(ch);
        }

    }
}
