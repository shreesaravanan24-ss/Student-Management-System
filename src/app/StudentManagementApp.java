package app;

import model.Student;
import service.StudentService;
import util.InputHelper;
import util.MenuPrinter;
import java.util.ArrayList;

public class StudentManagementApp {

    private StudentService service;

    public StudentManagementApp() {
        service = new StudentService();
    }

    public void start() {

        boolean running = true;

        while (running) {

            MenuPrinter.printMainMenu();

            int choice = InputHelper.readInt("");

            switch (choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    viewStudents();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    updateStudent();
                    break;

                case 5:
                    deleteStudent();
                    break;

                case 6:
                    totalStudents();
                    break;

                case 7:
                    System.out.println("\nThank you for using Student Management System.");
                    running = false;
                    break;

                default:
                    System.out.println("\nInvalid Choice!");
            }

        }

    }

    private void addStudent() {

        System.out.println("\n========== ADD STUDENT ==========");

        String roll = InputHelper.readString("Roll Number : ");
        String name = InputHelper.readString("Name        : ");
        int age = InputHelper.readInt("Age         : ");
        String gender = InputHelper.readString("Gender      : ");
        String department = InputHelper.readString("Department  : ");
        int year = InputHelper.readInt("Year        : ");
        String phone = InputHelper.readString("Phone       : ");
        String email = InputHelper.readString("Email       : ");

        Student student = new Student(
                roll,
                name,
                age,
                gender,
                department,
                year,
                phone,
                email
        );

        if (service.addStudent(student)) {
            System.out.println("\nStudent Added Successfully.");
        } else {
            System.out.println("\nUnable to Add Student.");
        }

    }

    private void viewStudents() {

        System.out.println("\n========== ALL STUDENTS ==========");

        ArrayList<Student> students = service.getAllStudents();

        if (students.isEmpty()) {

            System.out.println("No Students Available.");

            return;
        }

        for (Student student : students) {

            System.out.println(student);

        }

    }

    private void searchStudent() {

        System.out.println("\n========== SEARCH STUDENT ==========");

        String roll = InputHelper.readString("Enter Roll Number : ");

        Student student = service.searchStudent(roll);

        if (student == null) {

            System.out.println("Student Not Found.");

        } else {

            System.out.println(student);

        }

    }

    private void updateStudent() {

        System.out.println("\n========== UPDATE STUDENT ==========");

        String roll = InputHelper.readString("Enter Roll Number : ");

        Student existing = service.searchStudent(roll);

        if (existing == null) {

            System.out.println("Student Not Found.");

            return;
        }

        String name = InputHelper.readString("New Name        : ");
        int age = InputHelper.readInt("New Age         : ");
        String gender = InputHelper.readString("New Gender      : ");
        String department = InputHelper.readString("New Department  : ");
        int year = InputHelper.readInt("New Year        : ");
        String phone = InputHelper.readString("New Phone       : ");
        String email = InputHelper.readString("New Email       : ");

        Student updated = new Student(
                roll,
                name,
                age,
                gender,
                department,
                year,
                phone,
                email
        );

        if (service.updateStudent(updated)) {

            System.out.println("Student Updated Successfully.");

        } else {

            System.out.println("Update Failed.");

        }

    }

    private void deleteStudent() {

        System.out.println("\n========== DELETE STUDENT ==========");

        String roll = InputHelper.readString("Enter Roll Number : ");

        if (service.deleteStudent(roll)) {

            System.out.println("Student Deleted Successfully.");

        } else {

            System.out.println("Student Not Found.");

        }

    }

    private void totalStudents() {

        System.out.println("\nTotal Students : " + service.totalStudents());

    }

}