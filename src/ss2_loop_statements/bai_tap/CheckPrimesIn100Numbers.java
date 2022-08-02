package ss2_loop_statements.bai_tap;

public class CheckPrimesIn100Numbers {
    public static void main(String[] args) {
        boolean check;
        for (int i = 2; i < 100; i++) {

            check = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }

            }
            if (check) {
                System.out.println(i);
            }
        }


    }
}

