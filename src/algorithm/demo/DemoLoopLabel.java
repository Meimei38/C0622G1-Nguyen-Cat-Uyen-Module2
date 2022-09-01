package algorithm.demo;

import case_study.model.person.Employee;

import java.util.Scanner;
//Dùng loop label để break vòng lặp
public class DemoLoopLabel {
    private static Scanner scanner = new Scanner(System.in);
    private static String code;
    private static String name;
    private static String dateOfBirth;
    private static String gender;
    private static String id;
    private static String phoneNumber;
    private static String email;

    public static void getInfoPerson() {
        System.out.println("Enter code: ");
        code = scanner.nextLine();
        System.out.println("Enter full name: ");
        name = scanner.nextLine();
        System.out.println("Enter date of birth: ");
        dateOfBirth = scanner.nextLine();
        System.out.println("1. Male\n2. Female\n3.Others");
        int choiceOfGender;
        loopGender:
        while (true) {
            System.out.println("Enter gender: ");
            choiceOfGender = Integer.parseInt(scanner.nextLine());
            switch (choiceOfGender) {
                case 1:
                    gender = "Male";
                    break loopGender;
                case 2:
                    gender = "Female";
                    break loopGender;
                case 3:
                    gender = "Others";
                    break loopGender;
                default:
                    System.out.println("Invalid choice! Please choose again!");
            }
        }

        System.out.println("Enter identity number (9 digits or 12 digits): ");
        id = scanner.nextLine();
        System.out.println("Enter phone number: ");
        phoneNumber = scanner.nextLine();
        System.out.println("Enter email: ");
        email = scanner.nextLine();
    }

    public static Employee getInfoEmployee() {
        getInfoPerson();
        String level;
        int choiceOfLevel;

        loopLevel:
        while (true) {
            System.out.println("1. Vocational training\n2. College\n3. University\n4. Post-graduate\n5. Others");
            System.out.println("Enter educational level: ");
            choiceOfLevel = Integer.parseInt(scanner.nextLine());
            switch (choiceOfLevel) {
                case 1:
                    level = "Vocational training";
                    break loopLevel;
                case 2:
                    level = "College";
                    break loopLevel;
                case 3:
                    level = "University";
                    break loopLevel;
                case 4:
                    level = "Post-graduate";
                    break loopLevel;
                case 5:
                    level = "Others";
                    break loopLevel;
                default:
                    System.out.println("Invalid choice! Please choose again!");
            }
        }

        String position;
        int choiceOfPosition;

        loopPosition:
        while (true) {
            System.out.println("1. Receptionist\n2. Server\n3. Executive\n4. Supervisor\n5. Manager\n6. Director");
            System.out.println("Enter position: ");
            choiceOfPosition = Integer.parseInt(scanner.nextLine());
            switch (choiceOfPosition) {
                case 1:
                    position = "Receptionist";
                    break loopPosition;
                case 2:
                    position = "Server";
                    break loopPosition;
                case 3:
                    position = "Executive";
                    break loopPosition;
                case 4:
                    position = "Supervisor";
                    break loopPosition;
                case 5:
                    position = "Manager";
                    break loopPosition;
                case 6:
                    position = "Director";
                    break loopPosition;
                default:
                    System.out.println("Invalid choice! Please choose again!");
            }
        }

        System.out.println("Enter wage: ");
        double wage;
        wage = Double.parseDouble(scanner.nextLine());
        Employee employee = new Employee(code, name, dateOfBirth, gender, id, phoneNumber, email, level, position, wage);
        return employee;
    }


}

