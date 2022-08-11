package algorithm;

public class Algorithm1 {
    public static void main(String[] args) {
        for (int i = -5; i < 6; i++) {
            if (i == 0 || i == -1) {
                continue;
            }
            for (int j = -5; j < 6; j++) {
                if (Math.abs(i) + Math.abs(j) == 6) {
                    System.out.print(Math.abs(j));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}
