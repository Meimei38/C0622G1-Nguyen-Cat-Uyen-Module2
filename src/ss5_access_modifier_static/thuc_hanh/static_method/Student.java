package ss5_access_modifier_static.thuc_hanh.static_method;

public class Student {
private int rollno;
private String name;
private static String college="BBDIT";
Student(int r, String n){
    rollno=r;
    name=n;
}
static void change(){
    college="CODEGYM";
}


}
