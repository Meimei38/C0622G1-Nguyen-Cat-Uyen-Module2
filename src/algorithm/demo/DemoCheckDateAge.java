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
        String pattern = "dd/MM/uuuu";
        String date = scanner.nextLine();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern).withResolverStyle(ResolverStyle.STRICT);
        LocalDate birthday = LocalDate.parse(date, dateTimeFormatter);
        System.out.println("Age "+ calculateAge(birthday));
    }

    public static int calculateAge(LocalDate localDate) {
        LocalDate now = LocalDate.now();
        System.out.println(localDate);
        System.out.println(now);
        int age = Period.between(localDate, now).getYears();
        return age;

    }
}
