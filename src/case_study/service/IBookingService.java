package case_study.service;

import case_study.model.Booking;

public interface IBookingService extends IService {
    void addBooking();

    void displayBooking();

    void createContract();

    void displayContract();

    void editContract();

    Booking getInfoBooking();

    String getBookingCode();
}
