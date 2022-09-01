package case_study.ulti.validations;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;

public class ValidateDate {
    public static LocalDate validateDateFormat(String date){
        try{
            String pattern ="dd/MM/uuuu";
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern).withResolverStyle(ResolverStyle.STRICT);
            return LocalDate.parse(date,formatter);
        }catch (DateTimeParseException e){
            return null;
        }catch (Exception e){
            return null;
        }

    }
    public static int validateAge(LocalDate date){
        return Period.between(date,LocalDate.now()).getYears();
    }
}
