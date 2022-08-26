package ss19_string_regex.bai_tap.class_name_validation;

import java.util.Scanner;

public class ClassNameCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String CLASS_REGEX = "^[CAP]\\d{4}[GHIKLM]$";
        System.out.println("Please enter class name: ");
        String name = scanner.nextLine();
        ClassName className = new ClassName(name);
        boolean result = className.classNameCheck(CLASS_REGEX);
        System.out.println(result);

    }
}
