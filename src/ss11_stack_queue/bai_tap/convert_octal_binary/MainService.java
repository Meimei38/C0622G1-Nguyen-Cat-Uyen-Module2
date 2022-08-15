package ss11_stack_queue.bai_tap.convert_octal_binary;

import java.util.List;
import java.util.Stack;

public class MainService {
    public static void convertToBinary(int number) {
        Stack<Integer> integerStack = new Stack<>();
        while (number != 0) {
            integerStack.push((number % 2));
            number = number / 2;
        }
        while (integerStack.size() != 0) {
            System.out.print(integerStack.pop());

        }
    }
}
