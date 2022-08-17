package ss13_searching_algorithm.bai_tap.find_longest_continuous_string;

import java.util.LinkedList;
import java.util.Scanner;

public class FindLongestContinuousString {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String inputString = "abcdabhijabdfgk";
        LinkedList<Character> maxList = new LinkedList();
        LinkedList<Character> list = new LinkedList();

        for (int i = 0; i < inputString.length(); i++) {
            list.add(inputString.charAt(0));
            for (int j = i + 1; j < inputString.length(); j++) {
                if (inputString.charAt(i) > list.getLast()) {
                    list.add(inputString.charAt(i));

                }

            }


        }



    }
}
