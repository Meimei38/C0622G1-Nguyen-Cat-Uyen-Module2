package case_study.model;

import java.util.Objects;

public class Booking {
    private String bookingCode;
    private String startDate;
    private String endDate;
    private String customerCode;
    private String serviceCode;
    private String serviceType;

    public Booking() {
    }

    public Booking(String bookingCode, String startDate, String endDate, String customerCode, String serviceCode, String serviceType) {
        this.bookingCode = bookingCode;
        this.startDate = startDate;
        this.endDate = endDate;
        this.customerCode = customerCode;
        this.serviceCode = serviceCode;
        this.serviceType = serviceType;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingCode='" + bookingCode + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", customerCode='" + customerCode + '\'' +
                ", serviceCode='" + serviceCode + '\'' +
                ", serviceType='" + serviceType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return  Objects.equals(startDate, booking.startDate) &&
                Objects.equals(endDate, booking.endDate) &&
                Objects.equals(serviceCode, booking.serviceCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startDate, endDate, serviceCode);
    }
}
