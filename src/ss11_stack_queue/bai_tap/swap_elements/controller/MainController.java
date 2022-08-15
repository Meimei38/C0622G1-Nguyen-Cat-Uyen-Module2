package ss11_stack_queue.bai_tap.swap_elements.controller;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.lang.reflect.Array;
import java.util.*;

import static ss11_stack_queue.bai_tap.swap_elements.controller.MainService.swapNumber;
import static ss11_stack_queue.bai_tap.swap_elements.controller.MainService.swapString;

public class MainController {
    public static void main(String[] args) {
        int[] numberArray = new int[]{1, 3, 2, 6, 8, 0};
        System.out.println(swapNumber(numberArray));

        String stringInput = "Hello World";
        String[] stringArray = stringInput.split("");
        System.out.println(swapString(stringArray));


    }
}

