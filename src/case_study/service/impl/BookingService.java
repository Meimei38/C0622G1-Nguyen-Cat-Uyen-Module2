package case_study.service.impl;

import case_study.model.Booking;
import case_study.model.facility.Facility;
import case_study.model.person.Customer;
import case_study.service.IBookingService;
import case_study.ulti.exceptions.InvalidDateException;
import case_study.ulti.exceptions.OverlappingPeriodException;
import case_study.ulti.features.BookingCompare;
import case_study.ulti.read_write.ReadFile;
import case_study.ulti.read_write.WriteFile;
import case_study.ulti.validations.ValidateDate;

import java.time.LocalDate;
import java.util.*;

public class BookingService implements IBookingService {
    public static final String BOOKING_LIST_CSV = "src\\case_study\\data\\booking_list.csv";
    public static BookingCompare bookingCompare = new BookingCompare();
    private static Scanner scanner = new Scanner(System.in);
    public static TreeSet<Booking> bookings = new TreeSet<>(bookingCompare);

    @Override
    public void addBooking() {
        bookings = readFileBooking();
        Booking booking = this.getInfoBooking();
        bookings.add(booking);
        WriteFile.writeFile(BOOKING_LIST_CSV, convertListBookingToListString(bookings));
    }

    @Override
    public void displayBooking() {
        bookings = readFileBooking();
        for (Booking booking : bookings) {
            System.out.println(booking);
        }
    }

    @Override
    public void createContract() {

    }

    @Override
    public void displayContract() {

    }

    @Override
    public void editContract() {

    }

    @Override
    public Booking getInfoBooking() {
        String bookingCode = this.getBookingCode();
        //getServiceCode
        FacilityService facilityService = new FacilityService();
        List<Facility> facilities = facilityService.readFileFacility(FacilityService.FACILITY_LIST_CSV);
        for (int i = 0; i < facilities.size(); i++) {
            System.out.println(i + 1 + "," + facilities.get(i));
        }
        int choiceFacilityCode;
        String serviceCode;
        while (true) {
            System.out.println("Enter 1-" + facilities.size());
            choiceFacilityCode = Integer.parseInt(scanner.nextLine());
            if (choiceFacilityCode < 0 || choiceFacilityCode > facilities.size()) {
                System.out.println("Invalid choice! Please choose again!");
            } else {
                serviceCode = facilities.get(choiceFacilityCode - 1).getServiceCode();
                break;
            }
        }
        //getStartDate
        String startDate;
        while (true) {
            try {
                System.out.println("Enter start date: ");
                startDate = scanner.nextLine();
                LocalDate lcStartDate = ValidateDate.validateDateFormat(startDate);
                if (lcStartDate == null) {
                    throw new InvalidDateException("Invalid date. Please check the date and its format");
                } else {
                    for (Booking booking : bookings) {
                        if (serviceCode.equals(booking.getServiceCode())) {
                            if (!ValidateDate.validateDate(lcStartDate, booking.getStartDate(), booking.getEndDate())) {
                                throw new OverlappingPeriodException("The facility you chose is not available at this time!");
                            }
                        }
                    }
                }
                break;
            } catch (InvalidDateException e) {
                System.err.println(e.getMessage());
            } catch (OverlappingPeriodException e) {
                System.err.println(e.getMessage());
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
        //getEndDate
        String endDate;
        while (true) {
            try {
                System.out.println("Enter end date: ");
                endDate = scanner.nextLine();
                LocalDate lcEndDate = ValidateDate.validateDateFormat(endDate);
                if (lcEndDate == null) {
                    throw new InvalidDateException("Invalid date. Please check the date and its format");
                } else {
                    for (Booking booking : bookings) {
                        if (serviceCode.equals(booking.getServiceCode())) {
                            if (!ValidateDate.validateDate(lcEndDate, booking.getStartDate(), booking.getEndDate())) {
                                throw new OverlappingPeriodException("The facility you chose is not available at this time!");
                            }
                        }

                    }
                }
                break;
            } catch (InvalidDateException e) {
                System.err.println(e.getMessage());
            } catch (OverlappingPeriodException e) {
                System.err.println(e.getMessage());
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
        // getCustomerCode
        CustomerService customerService = new CustomerService();
        List<Customer> customers = customerService.readFileCustomer();
        for (int i = 0; i < customers.size(); i++) {
            System.out.println(i + 1 + "," + customers.get(i));
        }
        int choiceCustomerCode;
        String customerCode;
        while (true) {
            System.out.println("Enter 1-" + customers.size());
            choiceCustomerCode = Integer.parseInt(scanner.nextLine());
            if (choiceCustomerCode < 0 || choiceCustomerCode > customers.size()) {
                System.out.println("Invalid choice! Please choose again!");
            } else {
                customerCode = customers.get(choiceCustomerCode - 1).getCode();
                break;
            }
        }

        //getServiceType
        int choice;
        String serviceType;
        loopServiceType:
        while (true) {
            try {
                System.out.println("1. Hourly rental\n2. Daily rental\n3. Weekly rental\n4. Monthly rental");
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        serviceType = "Hourly rental";
                        break loopServiceType;
                    case 2:
                        serviceType = "Daily rental";
                        break loopServiceType;
                    case 3:
                        serviceType = "Weekly rental";
                        break loopServiceType;
                    case 4:
                        serviceType = "Monthly rental";
                        break loopServiceType;
                    default:
                        System.out.println("Invalid choice! Please choose again!");
                }
            } catch (NumberFormatException e) {
                e.getStackTrace();

            } catch (Exception e) {
                e.getStackTrace();
            }
        }
        return new Booking(bookingCode, startDate, endDate, customerCode, serviceCode, serviceType);
    }

    @Override
    public String getBookingCode() {
        bookings = readFileBooking();
        if (bookings.size() == 0) {
            return "BK-1";
        } else {
            TreeSet<String> codes = new TreeSet<>();
            for (Booking booking : bookings) {
                codes.add(booking.getBookingCode());
            }
            String[] codeArray = codes.last().split("-");
            int number = Integer.parseInt(codeArray[1]);
            number += 1;
            return "BK-" + number;
        }
    }

    private TreeSet<Booking> readFileBooking() {
        List<String> bookingList = ReadFile.readFile(BOOKING_LIST_CSV);
        TreeSet<Booking> bookings = new TreeSet<>(bookingCompare);
        if (bookingList.size() == 0) {
            System.out.println("No data exists! Please add some information!");
        } else {
            String[] propertiesOfBooking;
            Booking booking;
            for (int i = 0; i < bookingList.size(); i++) {
                propertiesOfBooking = bookingList.get(i).split(",");
                booking = new Booking(propertiesOfBooking[0], propertiesOfBooking[1], propertiesOfBooking[2], propertiesOfBooking[3], propertiesOfBooking[4], propertiesOfBooking[5]);
                bookings.add(booking);
            }

        }
        return bookings;

    }

    private String convertBookingToString(Booking booking) {
        return booking.getBookingCode() + "," + booking.getStartDate() + ","
                + booking.getEndDate() + "," + booking.getCustomerCode() + ","
                + booking.getServiceCode() + "," + booking.getServiceType();
    }

    private List<String> convertListBookingToListString(TreeSet<Booking> bookings) {
        List<String> strings = new ArrayList<>();
        for (Booking booking : bookings) {
            strings.add(convertBookingToString(booking));
        }
        return strings;
    }
}
