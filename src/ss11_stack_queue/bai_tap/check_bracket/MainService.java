package ss11_stack_queue.bai_tap.check_bracket;

import java.util.Stack;

public class MainService {
    public static boolean checkBrackets(String input) {
        String[] inputArray = input.split("");
        String left;
        String sym;
        Stack<String> bStack = new Stack<>();

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i].equals("(")) {
                bStack.push(inputArray[i]);
            }

            if (inputArray[i].equals(")")) {
                sym = inputArray[i];
                if (bStack.size() == 0) {
                    return false;
                } else {
                    left = bStack.pop();
                    /*if ((left.equals(sym))) {
                        return false;
                    }else bStack.isEmpty();*/
                }

            }

        }
        return bStack.isEmpty();

    }

}




