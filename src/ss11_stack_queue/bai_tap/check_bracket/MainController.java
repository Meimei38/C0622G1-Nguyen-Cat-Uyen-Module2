package ss11_stack_queue.bai_tap.check_bracket;

import static ss11_stack_queue.bai_tap.check_bracket.MainService.checkBrackets;

public class MainController {
    public static void main(String[] args) {
        String string = "s * (s – a) * (s – b) * (s – c)())(()";
        String string1 = "s * (s – a) * (s – b * (s – c)";
        String string2 = "(– b + (b2 – 4*a*c)^0.5) / 2*a ";
        String string3 = "(– b + (b^2 – 4*a*c)^(0.5/ 2*a)";
        String string4 = "2*1)+3)-1*(3+2(";
        String string5 = "1+2)*(3-1)*(2+1";

        System.out.println(checkBrackets(string));
        System.out.println(checkBrackets(string1));
        System.out.println(checkBrackets(string2));
        System.out.println(checkBrackets(string3));
        System.out.println(checkBrackets(string4));
        System.out.println(checkBrackets(string5));

    }


}
