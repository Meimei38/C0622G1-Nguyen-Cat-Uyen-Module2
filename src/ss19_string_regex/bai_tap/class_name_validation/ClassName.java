package ss19_string_regex.bai_tap.class_name_validation;

public class ClassName {
    private String className;

    public ClassName() {
    }

    public ClassName(String className) {
        this.className = className;
    }
    public boolean classNameCheck(String regex){
        return this.className.matches(regex);
    }

}
