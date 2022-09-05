package case_study.ulti.features;

import case_study.model.person.Customer;
import case_study.model.person.Employee;
import case_study.service.impl.CustomerService;
import case_study.service.impl.EmployeeService;
import case_study.ulti.exceptions.*;
import case_study.ulti.validations.ValidateCommonInfo;
import case_study.ulti.validations.ValidateDate;

import java.time.LocalDate;
import java.util.Scanner;

public class GetInfoPerson {
    private static Scanner scanner = new Scanner(System.in);
    private static String code;
    private static String name;
    private static String dateOfBirth;
    private static String gender;
    private static String id;
    private static String phoneNumber;
    private static String email;


    public static void getInfoPerson(String src) {
        while (true) {
            try {
                System.out.println("Enter full name: ");
                name = scanner.nextLine();
                name = name.trim();
                if (!ValidateCommonInfo.validateName(name)) {
                    throw new WrongFormattedNameException("Wrong formatted name!\n" +
                            "The first letter of each word must be in uppercase.\n" +
                            "Length of name must be in [5;50] characters.");
                }
                break;
            } catch (WrongFormattedNameException e) {
                System.err.println(e.getMessage());

            } catch (NullPointerException e) {
                e.getStackTrace();
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
        while (true) {
            try {
                System.out.println("Enter date of birth (dd/MM/yyyy): ");
                dateOfBirth = scanner.nextLine();
                LocalDate localDate = ValidateDate.validateDateFormat(dateOfBirth);
                if (localDate == null) {
                    throw new InvalidDateException("Invalid date. Please check the date and its format");
                } else {
                    int age = ValidateDate.validateAge(localDate);
                    if (age < 18 || age > 100) {
                        throw new InvalidAgeException("Invalid age!\nAge must be in [18,100]!");
                    }
                }
                break;
            } catch (InvalidDateException e) {
                System.err.println(e.getMessage());
            } catch (InvalidAgeException e) {
                System.err.println(e.getMessage());
            } catch (Exception e) {
                e.getStackTrace();
            }
        }

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
        while (true) {
            try {
                System.out.println("Enter identity number (9 digits or 12 digits): ");
                id = scanner.nextLine();
                ValidateCommonInfo.validateId(id, src);
                break;
            } catch (DuplicateIdException e) {
                System.err.println(e.getMessage());
                ;
            } catch (InvalidIdException e) {
                System.err.println(e.getMessage());
                ;
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
        while (true) {
            try {
                System.out.println("Enter phone number (E.g.: (84)-(123456789): ");
                phoneNumber = scanner.nextLine();
                if (!ValidateCommonInfo.validatePhoneNumber(phoneNumber)) {
                    throw new InvalidPhoneNumberException("Invalid phone number, please check and enter again!");
                }
                break;
            } catch (InvalidPhoneNumberException e) {
                System.err.println(e.getMessage());
            } catch (Exception e) {
                e.getStackTrace();
            }
        }


        while (true) {
            try {
                System.out.println("Enter email: ");
                email = scanner.nextLine();
                if (!ValidateCommonInfo.validateEmail(email)) {
                    throw new InvalidEmailException("Invalid email! Please enter again!");
                }
                break;
            } catch (InvalidEmailException e) {
                System.err.println(e.getMessage());
            } catch (Exception e) {
                e.getStackTrace();
            }
        }

    }

    public static Employee getInfoEmployee() {
        getInfoPerson(EmployeeService.EMPLOYEE_LIST_CSV);
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
        double wage;
        while (true) {
            try {
                System.out.println("Enter wage: ");
                wage = Double.parseDouble(scanner.nextLine());
                if (!ValidateCommonInfo.validateMoney(wage)) {
                    throw new InvalidMoneyException("Valid amount of money must be in range of [0;2^63-1]");
                }
                break;
            } catch (InvalidMoneyException e) {
                System.err.println(e.getMessage());
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
        Employee employee = new Employee(code, name, dateOfBirth, gender, id, phoneNumber, email, level, position, wage);
        return employee;
    }


    public static Customer getInfoCustomer() {
        getInfoPerson(CustomerService.CUSTOMER_LIST_CSV);
        String customerType;
        int choiceOfType;
        loopCustomerType:
        while (true) {
            System.out.println("1. Diamond\n2.Platinum\n3. Golden\n4. Silver\n5. Member");
            System.out.println("Enter customer type: ");
            choiceOfType = Integer.parseInt(scanner.nextLine());
            switch (choiceOfType) {
                case 1:
                    customerType = "Diamond";
                    break loopCustomerType;
                case 2:
                    customerType = "Platinum";
                    break loopCustomerType;
                case 3:
                    customerType = "Golden";
                    break loopCustomerType;
                case 4:
                    customerType = "Silver";
                    break loopCustomerType;
                case 5:
                    customerType = "Member";
                    break loopCustomerType;
                default:
                    System.out.println("Invalid choice! Please choose again!");

            }
        }
        String address;
        while (true) {
            try {
                System.out.println("Enter customer address (province/city): ");
                address = scanner.nextLine();
                if (!ValidateCommonInfo.validateName(address)) {
                    throw new WrongFormattedNameException("Wrong formatted name!\n" +
                            "The first letter of each word must be in uppercase.\n" +
                            "Length of name must be in [5;50] characters.");
                }
                break;
            } catch (WrongFormattedNameException e) {
                System.err.println(e.getMessage());
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
        Customer customer = new Customer(code, name, dateOfBirth, gender, id, phoneNumber, email, customerType, address);
        return customer;
    }

}

