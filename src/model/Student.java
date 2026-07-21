package model;

public class Student {

    private String rollNumber;
    private String name;
    private int age;
    private String gender;
    private String department;
    private int year;
    private String phoneNumber;
    private String email;

    // Default Constructor
    public Student() {
    }

    // Parameterized Constructor
    public Student(String rollNumber, String name, int age,
                   String gender, String department,
                   int year, String phoneNumber, String email) {

        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.year = year;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    // Getters

    public String getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getDepartment() {
        return department;
    }

    public int getYear() {
        return year;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    // Setters

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Display Student Details

    @Override
    public String toString() {
        return "----------------------------------\n" +
                "Roll Number : " + rollNumber + "\n" +
                "Name        : " + name + "\n" +
                "Age         : " + age + "\n" +
                "Gender      : " + gender + "\n" +
                "Department  : " + department + "\n" +
                "Year        : " + year + "\n" +
                "Phone       : " + phoneNumber + "\n" +
                "Email       : " + email + "\n" +
                "----------------------------------";
    }
}