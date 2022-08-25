package ss19_string_regex.bai_tap.phone_number_validation;

public class PhoneNumber {
    String phoneNumber;

    public PhoneNumber() {
    }

    public PhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;

    }

    public boolean validate(String regex){
        return phoneNumber.matches(regex);
    }
}
