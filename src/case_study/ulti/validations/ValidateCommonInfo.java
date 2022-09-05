package case_study.ulti.validations;

import case_study.ulti.exceptions.DuplicateIdException;
import case_study.ulti.exceptions.InvalidIdException;
import case_study.ulti.read_write.ReadFile;

import java.util.ArrayList;
import java.util.List;

public class ValidateCommonInfo {
    public static boolean validateName(String name) {
        final String NAME_REGEX = "^\\p{Lu}\\p{Ll}+(\\s\\p{Lu}\\p{Ll}+)*$";
        return name.matches(NAME_REGEX) && (name.length() >= 5 && name.length() <= 50);
    }

    public static boolean validateEmail(String email) {
        String emailRegex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        return email.matches(emailRegex);
    }

    public static void validateId(String id, String src) throws DuplicateIdException, InvalidIdException {
        String idRegex = "^(\\d{9}|\\d{12})$";
        if (!id.matches(idRegex)) {
            throw new InvalidIdException("Invalid Id format. Please enter again!");
        } else {
            List<String> strings = new ArrayList<>(ReadFile.readFile(src));
            String[] properties;
            for (int i = 0; i < strings.size(); i++) {
                properties = strings.get(i).split(",");
                if (id.equals(properties[4])) {
                    throw new DuplicateIdException("This Id has already existed! Please enter new Id!");
                }
            }
        }

    }

    public static boolean validatePhoneNumber(String phoneNumber) {
        String phoneNumberRegex = "^[(]\\d{2}[)][-][(]\\d{9}[)]$";
        return phoneNumber.matches(phoneNumberRegex);
    }
    public static boolean validateMoney(double money){
        return (money < 0) && (money > Double.MAX_VALUE);

    }
}
