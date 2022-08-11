package ss9_data_structures_algorithms.bai_tap.controller;

import ss9_data_structures_algorithms.bai_tap.model.MyList;

public class MyListTest {
    public static class Student {
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String toString() {
            return "Name: " + getName() + ", id: " + getId();
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student(1, "John");
        Student student2 = new Student(2, "Anne");
        Student student3 = new Student(3, "Maria");
        Student student4 = new Student(4, "Andy");
        Student student5 = new Student(5, "Karen");
        MyList<Student> studentMyList = new MyList<>();
        studentMyList.add(student1);
        studentMyList.add(student2);
        studentMyList.add(student3);
        studentMyList.add(student4);
        studentMyList.add(student5);
        for (int i = 0; i < studentMyList.size(); i++) {
            Student student = (Student) studentMyList.elements[i];
            System.out.println(student);
        }
        System.out.println(studentMyList.get(3));

    }
}