package ss5_access_modifier_static.bai_tap.write_only_class;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Jin");
        student1.setClasses("C06");
        Student student2 = new Student();
        student2.setName("Mei");
        student2.setClasses("C06");
        Student studentDefault = new Student();
        System.out.println("Student 1: " + student1.getName() + ", " + student1.getClasses());
        System.out.println("Student 2: " + student2.getName() + ", " + student2.getClasses());
        System.out.println("Student Default: " + studentDefault.getName() + ", " + studentDefault.getClasses());

    }


}
