package case_study.service.impl;

import case_study.model.person.Employee;
import case_study.service.IEmployeeService;
import case_study.ulti.features.GetInfoPerson;
import case_study.ulti.features.GetNumberInCode;
import case_study.ulti.read_write.ReadFile;
import case_study.ulti.read_write.WriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    public static final String EMPLOYEE_LIST_CSV = "src\\case_study\\data\\employee_list.csv";
    private static Scanner scanner = new Scanner(System.in);
    private static List<Employee> employees = new ArrayList<>();

    @Override
    public void addEmployee() {
        employees = readFileEmployee();
        Employee employee = GetInfoPerson.getInfoEmployee();
        //id tự động tăng
        if (employees.size() == 0) {
            employee.setCode("EP-1");
        } else {
            int num = GetNumberInCode.getNumberInCode(EMPLOYEE_LIST_CSV);
            num += 1;
            employee.setCode("EP-" + num);
        }
        employees.add(employee);
        System.out.println("New employee successfully added!");
        WriteFile.writeFile(EMPLOYEE_LIST_CSV, convertListEmployeeToListString(employees));
    }

    @Override
    public void displayEmployee() {
        employees = readFileEmployee();
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    @Override
    public void editEmployee() {
        employees = readFileEmployee();
        Employee employee;
        if (this.findEmployee() == null) {
            System.out.println("Invalid employee code!");
        } else {
            try {
                while (true) {
                    employee = this.findEmployee();
                    System.out.println("1.Edit employee code\n2. Edit name\n3. Edit date of birth\n4. Edit gender\n5. Edit id\n" +
                            "6. Edit phone number\n7. Edit email\n8. Edit educational level\n9. Edit position\n10. Edit wage\n11. Exit");
                    int choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                        case 1:
                            employee.setCode(getEditInfo("code"));
                            System.out.println("New code updated!");
                            break;
                        case 2:
                            employee.setName(getEditInfo("name"));
                            System.out.println("New name updated!");
                            break;
                        case 3:
                            employee.setDateOfBirth(getEditInfo("date of birth"));
                            System.out.println("New date of birth updated!");
                            break;
                        case 4:
                            employee.setGender(getEditInfo("gender"));
                            System.out.println("New gender update!");
                            break;
                        case 5:
                            employee.setId(getEditInfo("Id"));
                            System.out.println("New Id updated!");
                            break;
                        case 6:
                            employee.setPhoneNumber(getEditInfo("phone number"));
                            System.out.println("New phone number updated!");
                            break;
                        case 7:
                            employee.setEmail(getEditInfo("email"));
                            System.out.println("New email updated!");
                            break;
                        case 8:
                            employee.setEducationalLevel(getEditInfo("educational level"));
                            System.out.println("New educational level updated!");
                            break;
                        case 9:
                            employee.setPosition(getEditInfo("position"));
                            System.out.println("New position updated!");
                            break;
                        case 10:
                            employee.setWage(Double.parseDouble(getEditInfo("wage")));
                            System.out.println("New wage updated!");
                            break;
                        case 11:
                            return;
                        default:
                            System.out.println("Invalid choice, please choose again");
                    }
                }
            } catch (NumberFormatException e) {
                e.getStackTrace();
            } catch (Exception e) {
                e.getStackTrace();
            }
            WriteFile.writeFile(EMPLOYEE_LIST_CSV, convertListEmployeeToListString(employees));

        }
    }

    @Override
    public Employee findEmployee() {
        employees = readFileEmployee();
        System.out.println("Enter employee code: ");
        String inputCode = scanner.nextLine();
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getCode().equals(inputCode)) {
                return employees.get(i);
            }
        }
        return null;

    }

    public String getEditInfo(String editInfo) {
        System.out.printf("Enter new %s", editInfo);
        return scanner.nextLine();

    }

    private List<Employee> readFileEmployee() {
        List<String> employeeList = ReadFile.readFile(EMPLOYEE_LIST_CSV);
        List<Employee> employees = new ArrayList<>();
        if (employeeList.size() == 0) {
            System.out.println("No data exists! Please add some information!");
        } else {
            String[] propertiesOfEmployee;
            Employee employee;
            for (int i = 0; i < employeeList.size(); i++) {
                propertiesOfEmployee = employeeList.get(i).split(",");
                employee = new Employee(propertiesOfEmployee[0], propertiesOfEmployee[1], propertiesOfEmployee[2],
                        propertiesOfEmployee[3], propertiesOfEmployee[4], propertiesOfEmployee[5],
                        propertiesOfEmployee[6], propertiesOfEmployee[7], propertiesOfEmployee[8], Double.parseDouble(propertiesOfEmployee[9]));
                employees.add(employee);
            }

        }
        return employees;

    }

    private String convertEmployeeToString(Employee employee) {
        return employee.getCode() + "," + employee.getName() + "," + employee.getDateOfBirth() + ","
                + employee.getGender() + "," + employee.getId() + "," + employee.getPhoneNumber()
                + "," + employee.getEmail() + "," + employee.getEducationalLevel() + "," + employee.getPosition() + "," + employee.getWage();
    }

    private List<String> convertListEmployeeToListString(List<Employee> employees) {
        List<String> strings = new ArrayList<>();
        for (Employee employee : employees) {
            strings.add(convertEmployeeToString(employee));
        }
        return strings;
    }
}

