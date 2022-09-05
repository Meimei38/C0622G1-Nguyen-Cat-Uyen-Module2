package case_study.ulti.validations;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;

public class ValidateDate {
    public static LocalDate validateDateFormat(String date) {
        try {
            String pattern = "dd/MM/uuuu";
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern).withResolverStyle(ResolverStyle.STRICT);
            return LocalDate.parse(date, formatter);
        } catch (DateTimeParseException e) {
            return null;
        } catch (Exception e) {
            return null;
        }

    }

    public static int validateAge(LocalDate date) {
        return Period.between(date, LocalDate.now()).getYears();
    }

    public static boolean validateDate(LocalDate date, String min, String max) {
        String pattern = "dd/MM/uuuu";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern).withResolverStyle(ResolverStyle.STRICT);
        LocalDate minDate = LocalDate.parse(min, formatter).plusDays(-1);
        LocalDate maxDate = LocalDate.parse(max, formatter).plusDays(1);
        return date.isBefore(minDate) || date.isAfter(maxDate);

    }
}
