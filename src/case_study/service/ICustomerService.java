package case_study.service;

import case_study.model.person.Customer;

public interface ICustomerService extends IService {
    void displayCustomer();

    void addCustomer();

    void editCustomer();

    Customer findCustomer();
}
