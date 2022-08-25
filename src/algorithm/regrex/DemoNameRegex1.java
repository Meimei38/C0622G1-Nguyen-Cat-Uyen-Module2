package algorithm.regrex;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class DemoNameRegex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String NAME_REGEX = "^\\p{Lu}\\p{Ll}+(\\s\\p{Lu}\\p{Ll}+)*$";// Viết hoa chữ đầu,
        // có dấu cách giữa 2 từ, từ cuối cùng không được có dấu cách
        String input = scanner.nextLine();
        System.out.println(input.matches(NAME_REGEX));
    }


}
