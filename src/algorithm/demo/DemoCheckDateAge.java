package algorithm.demo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.util.Date;
import java.util.Scanner;

public class DemoCheckDateAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Nhập định dạng của chuỗi input ngày tháng năm
        String pattern = "dd/MM/uuuu";
        //Người dùng nhập chuỗi ngày tháng năm (theo định dạng trên)
        String date = scanner.nextLine();
        //Chuyển chuỗi ngày tháng năm thành localdate (Định dạng của localDate là yyyy/MM/dd
        // withResolverStyle(ResolverStyle.STRICT) là chế độ khắc khe, sẽ bắt tất cả các lỗi xuất hiện
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern).withResolverStyle(ResolverStyle.STRICT);
        LocalDate birthday = LocalDate.parse(date, dateTimeFormatter);
        // dùng ngày tháng năm sinh để tính tuổi
        System.out.println("Age " + calculateAge(birthday));
    }

    public static int calculateAge(LocalDate localDate) {
        LocalDate now = LocalDate.now();
        System.out.println(localDate);
        System.out.println(now);
        int age = Period.between(localDate, now).getYears();
        // phương thức tính khoảng thời gian giữa 2 mốc. getYears để lấy ra năm (đã được làm tròn). Ví dụ 1.5 năm sẽ tính là 1
        return age;

    }
}
