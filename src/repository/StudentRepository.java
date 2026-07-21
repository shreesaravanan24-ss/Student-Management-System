package repository;

import model.Student;

import java.util.ArrayList;

public class StudentRepository {

    private ArrayList<Student> students;

    public StudentRepository() {
        students = new ArrayList<>();
    }

    // Add Student
    public void addStudent(Student student) {
        students.add(student);
    }

    // Get All Students
    public ArrayList<Student> getAllStudents() {
        return students;
    }

    // Search Student by Roll Number
    public Student findByRollNumber(String rollNumber) {

        for (Student student : students) {

            if (student.getRollNumber().equalsIgnoreCase(rollNumber)) {
                return student;
            }

        }

        return null;
    }

    // Delete Student
    public boolean deleteStudent(String rollNumber) {

        Student student = findByRollNumber(rollNumber);

        if (student != null) {
            students.remove(student);
            return true;
        }

        return false;
    }

    // Count Students
    public int getStudentCount() {
        return students.size();
    }

}