package case_study.service.impl;

import case_study.model.person.Customer;
import case_study.service.ICustomerService;
import case_study.ulti.features.GetInfoPerson;
import case_study.ulti.features.GetNumberInCode;
import case_study.ulti.read_write.ReadFile;
import case_study.ulti.read_write.WriteFile;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    public static final String CUSTOMER_LIST_CSV = "src\\case_study\\data\\customer_list.csv";
    private static Scanner scanner = new Scanner(System.in);
    List<Customer> customers = new LinkedList<>();

    @Override
    public void displayCustomer() {
        customers = readFileCustomer();
        for (Customer customer : customers) {
            System.out.println(customer);
        }

    }

    @Override
    public void addCustomer() {
        customers = readFileCustomer();
        Customer customer = GetInfoPerson.getInfoCustomer();
        //id tự động tăng
        if (customers.size() == 0) {
            customer.setCode("CM-1");
        } else {
            int num = GetNumberInCode.getNumberInCode(CUSTOMER_LIST_CSV);
            num += 1;
            customer.setCode("CM-" + num);
        }
        customers.add(customer);
        System.out.println("New customer is successfully added!");
        WriteFile.writeFile(CUSTOMER_LIST_CSV, convertListCustomerToListString(customers));
    }

    @Override
    public void editCustomer() {
        customers = readFileCustomer();
        Customer customer;
        if (this.findCustomer() == null) {
            System.out.println("Invalid customer code!");
        } else {
            while (true) {
                customer = this.findCustomer();
                System.out.println("1.Edit employee code\n2. Edit name\n3. Edit date of birth\n4. Edit gender\n5. Edit id\n" +
                        "6. Edit phone number\n7. Edit email\n8. Edit customer type\n9. Edit customer address\n10. Exit");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        customer.setCode(getEditInfo("code"));
                        System.out.println("New code updated!");
                        break;
                    case 2:
                        customer.setName(getEditInfo("name"));
                        System.out.println("New name updated!");
                        break;
                    case 3:
                        customer.setDateOfBirth(getEditInfo("date of birth"));
                        System.out.println("New date of birth updated!");
                        break;
                    case 4:
                        customer.setGender(getEditInfo("gender"));
                        System.out.println("New gender update!");
                        break;
                    case 5:
                        customer.setId(getEditInfo("id"));
                        System.out.println("New Id updated!");
                        break;
                    case 6:
                        customer.setPhoneNumber(getEditInfo("phone number"));
                        System.out.println("New phone number updated!");
                        break;
                    case 7:
                        customer.setEmail(getEditInfo("email"));
                        System.out.println("New email updated!");
                        break;
                    case 8:
                        customer.setCustomerType(getEditInfo("customer type"));
                        System.out.println("New customer type updated!");
                        break;
                    case 9:
                        customer.setCustomerAddress(getEditInfo("customer address"));
                        System.out.println("New customer address updated!");
                        break;
                    case 10:
                        return;
                    default:
                        System.out.println("Invalid choice, please choose again");
                }
            }
        }
        WriteFile.writeFile(CUSTOMER_LIST_CSV, convertListCustomerToListString(customers));
    }

    @Override
    public Customer findCustomer() {
        customers = readFileCustomer();
        System.out.println("Enter customer code: ");
        String inputCode = scanner.nextLine();
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getCode().equals(inputCode)) {
                return customers.get(i);
            }
        }
        return null;
    }

    private String getEditInfo(String editInfo) {
        System.out.printf("Enter new %s", editInfo);
        return scanner.nextLine();
    }

    public List<Customer> readFileCustomer() {
        List<String> customerList = ReadFile.readFile(CUSTOMER_LIST_CSV);
        List<Customer> customers = new ArrayList<>();
        if (customerList.size() == 0) {
            System.out.println("No data exists! Please add some information!");
        } else {
            String[] propertiesOfCustomer;
            Customer customer;
            for (int i = 0; i < customerList.size(); i++) {
                propertiesOfCustomer = customerList.get(i).split(",");
                customer = new Customer(propertiesOfCustomer[0], propertiesOfCustomer[1], propertiesOfCustomer[2],
                        propertiesOfCustomer[3], propertiesOfCustomer[4],
                        propertiesOfCustomer[5], propertiesOfCustomer[6], propertiesOfCustomer[7], propertiesOfCustomer[8]);
                customers.add(customer);
            }
        }
        return customers;
    }

    private String convertCustomerToString(Customer customer) {
        return customer.getCode() + "," + customer.getName() + "," + customer.getDateOfBirth() + ","
                + customer.getGender() + "," + customer.getId() + "," + customer.getPhoneNumber() + ","
                + customer.getEmail() + "," + customer.getCustomerType() + "," + customer.getCustomerAddress();
    }

    private List<String> convertListCustomerToListString(List<Customer> customers) {
        List<String> strings = new ArrayList<>();
        for (Customer customer : customers) {
            strings.add(convertCustomerToString(customer));
        }
        return strings;
    }
}
