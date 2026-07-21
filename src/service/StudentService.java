package service;

import model.Student;
import repository.StudentRepository;
import validation.Validation;

import java.util.ArrayList;

public class StudentService {

    private StudentRepository repository;

    public StudentService() {
        repository = new StudentRepository();
    }

    // Add Student
    public boolean addStudent(Student student) {

        if (!Validation.isValidName(student.getName()))
            return false;

        if (!Validation.isValidAge(student.getAge()))
            return false;

        if (!Validation.isValidDepartment(student.getDepartment()))
            return false;

        if (!Validation.isValidYear(student.getYear()))
            return false;

        if (!Validation.isValidPhone(student.getPhoneNumber()))
            return false;

        if (!Validation.isValidEmail(student.getEmail()))
            return false;

        // Duplicate Roll Number Check
        if (repository.findByRollNumber(student.getRollNumber()) != null) {
            return false;
        }

        repository.addStudent(student);

        return true;
    }

    // View All Students
    public ArrayList<Student> getAllStudents() {
        return repository.getAllStudents();
    }

    // Search Student
    public Student searchStudent(String rollNumber) {
        return repository.findByRollNumber(rollNumber);
    }

    // Delete Student
    public boolean deleteStudent(String rollNumber) {
        return repository.deleteStudent(rollNumber);
    }

    // Total Students
    public int totalStudents() {
        return repository.getStudentCount();
    }

    // Update Student
    public boolean updateStudent(Student updatedStudent) {

        Student existingStudent =
                repository.findByRollNumber(updatedStudent.getRollNumber());

        if (existingStudent == null) {
            return false;
        }

        existingStudent.setName(updatedStudent.getName());
        existingStudent.setAge(updatedStudent.getAge());
        existingStudent.setGender(updatedStudent.getGender());
        existingStudent.setDepartment(updatedStudent.getDepartment());
        existingStudent.setYear(updatedStudent.getYear());
        existingStudent.setPhoneNumber(updatedStudent.getPhoneNumber());
        existingStudent.setEmail(updatedStudent.getEmail());

        return true;
    }

}