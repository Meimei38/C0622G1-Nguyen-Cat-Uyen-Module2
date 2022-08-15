package ss11_stack_queue.bai_tap.check_palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MainService {
    public static void isPalindrome(String input) {
        String[] stringArray = input.split("");
        Stack<String> stringStack = new Stack<>();
        Queue<String> stringQueue = new LinkedList<>();
        for (int i = 0; i < stringArray.length; i++) {
            stringStack.push(stringArray[i]);
            stringQueue.add(stringArray[i]);
        }
        Stack<String> reversedStringStack = new Stack<>();
        while (stringStack.size() != 0) {
            reversedStringStack.push(stringStack.pop());

        }
        String reversedString = (String.join("", reversedStringStack)).toLowerCase();
        String string = (String.join("", stringQueue)).toLowerCase();
        if (string.equals(reversedString)) {
            System.out.println(input + " là palindrome");
        } else {
            System.out.println(input + " không là palindrome");

        }
    }

}

