package ss13_searching_algorithm.bai_tap.find_longest_continuous_string;

import java.util.LinkedList;
import java.util.Scanner;

public class FindLongestContinuousString {
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        String inputString = "abcabcdgabxyabcdg";
        LinkedList<Character> maxList = new LinkedList();
        LinkedList<Character> list = new LinkedList();

        for (int i = 0; i < inputString.length(); i++) {
            if (list.size() > 1 && inputString.charAt(i) <= list.getLast() && list.contains(inputString.charAt(i))) {
                list.clear();
            }
            list.add(inputString.charAt(i));
            if (list.size() > maxList.size()) {
                maxList.clear();
                maxList.addAll(list);
            }


        }

        for (Character ch : maxList) {
            System.out.print(ch);

        }
        System.out.println();


    }
}
