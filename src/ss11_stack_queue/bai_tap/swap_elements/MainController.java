package ss11_stack_queue.bai_tap.swap_elements;

public class MainController {
    public static void main(String[] args) {
        int[] numberArray = new int[]{1, 3, 2, 6, 8, 0};
        System.out.println(MainService.swapNumber(numberArray));

        String stringInput = "Hello World";
        String[] stringArray = stringInput.split("");
        System.out.println(MainService.swapString(stringArray));


    }
}

