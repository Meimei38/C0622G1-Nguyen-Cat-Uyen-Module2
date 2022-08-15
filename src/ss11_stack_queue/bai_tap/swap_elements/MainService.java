package ss11_stack_queue.bai_tap.swap_elements;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MainService {
    public static String swapString(String[] stringArray) {
        Stack<String> stringStack = new Stack<>();
        for (int i = 0; i < stringArray.length; i++) {
            stringStack.push(stringArray[i]);

        }
        List<String> resultArray = new ArrayList<>();
        while (stringStack.size() != 0) {
            resultArray.add(stringStack.pop());
        }
        return String.join("", resultArray);
    }

    public static List<Integer> swapNumber(int[] array) {
        Stack<Integer> numberStack = new Stack<>();
        for (int i = 0; i < array.length; i++) {
            numberStack.push(array[i]);
        }
        List<Integer> resultArray = new ArrayList<>();
        while (numberStack.size() != 0) {
            resultArray.add(numberStack.pop());
        }
        return resultArray;

    }
}
