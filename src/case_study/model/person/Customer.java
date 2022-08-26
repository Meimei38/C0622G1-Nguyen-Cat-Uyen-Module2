package case_study.model.person;

public class Customer extends Person {
    private String customerType;
    private String customerAddress;

    public Customer() {
    }

    public Customer(String customerType, String customerAddress) {
        this.customerType = customerType;
        this.customerAddress = customerAddress;
    }

    public Customer(String code, String name, String dateOfBirth, String gender, int id, String phoneNumber, String email, String customerType, String customerAddress) {
        super(code, name, dateOfBirth, gender, id, phoneNumber, email);
        this.customerType = customerType;
        this.customerAddress = customerAddress;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerType='" + customerType + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                "} " + super.toString();
    }
}
