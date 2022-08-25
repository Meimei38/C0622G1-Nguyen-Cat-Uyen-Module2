package ss19_string_regex.bai_tap.phone_number_validation;

import java.util.Scanner;

public class PhoneNumberCheck {
    public static void main(String[] args) {
        final String PHONE_NUMBER_REGEX= "[(][0-9]{2}[)][-][(][0-9]{10}[)]";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the phone number: ");
        String number = scanner.nextLine();
        PhoneNumber phoneNumber = new PhoneNumber(number);
        boolean result = phoneNumber.validate(PHONE_NUMBER_REGEX);
        System.out.println(result);
    }

}
