package ss15_exception_debug.bai_tap.illegal_triangle_exception;

import java.util.Scanner;

public class Triangle {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double firstSide = 0;
        double secondSide = 0;
        double thirdSide = 0;
        while (true) {
            try {
                System.out.println("Nhập số đo cạnh thứ nhất của tam giác: ");
                firstSide = Double.parseDouble(scanner.nextLine());
                if (firstSide < 0) {
                    throw new IllegalTriangleException("Độ dài cạnh bạn vừa nhập không hợp lệ");
                }
                System.out.println("Nhập số đo cạnh thứ hai của tam giác: ");
                secondSide = Double.parseDouble(scanner.nextLine());
                if (secondSide < 0) {
                    throw new IllegalTriangleException("Độ dài cạnh bạn vừa nhập không hợp lệ");
                }
                System.out.println("Nhập số đo cạnh thứ ba của tam giác: ");
                thirdSide = Double.parseDouble(scanner.nextLine());
                if (thirdSide < 0) {
                    throw new IllegalTriangleException("Độ dài cạnh bạn vừa nhập không hợp lệ");
                }
                if ((firstSide + secondSide <= thirdSide) || (secondSide + thirdSide <= firstSide) || (firstSide + thirdSide <= secondSide)) {
                    throw new IllegalTriangleException("Độ dài cạnh bạn nhập không hợp lệ");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Độ dài cạnh bạn nhập không phải số. Vui lòng nhập lại!");

            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Dữ liệu bạn nhập không hợp lệ!");
            }

        }
        System.out.printf("Độ dài 3 cạnh của tam giác là: %f, %f, %f", firstSide, secondSide, thirdSide);

    }
}