package Model;

import utils.Validator;

import java.util.List;
import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private String address;
    private String phoneNumber;

    public Student() {
    }

    public Student(int id, String name, String address, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Student ID: " + id +
                ",  Name: " + name +
                ",  Address: " + address +
                ",  Phone Number: " + phoneNumber;
    }

    public void inputStudent(List<Student> studentList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student Information:");
        boolean checkID;
        do {
            checkID = true;
            this.id = Validator.getInt(scanner, "Student ID: ");

            for (Student st : studentList) {
                if (st.getId() == this.id) {
                    System.out.println("The ID is available");
                    checkID = false;
                    break;
                }
            }
        } while (!checkID);
        this.name = Validator.getString(scanner, "Name: ");
        this.address = Validator.getString(scanner, "Address: ");
        this.phoneNumber = Validator.getString(scanner, "Phone Number: ");

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
