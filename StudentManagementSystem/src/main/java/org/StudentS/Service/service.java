package org.StudentS.Service;
import org.StudentS.model.;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

class StudentManager {
    private ArrayList<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayAllStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void searchStudentByID(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                System.out.println(student);
                return;
            }
        }
        System.out.println("Student not found with ID: " + id);
    }

    public void updateStudentInfo(int id, String name, int age, String grade) {
        for (Student student : students) {
            if (student.getId() == id) {
                student.setName(name);
                student.setAge(age);
                student.setGrade(grade);
                System.out.println("Student information updated successfully.");
                return;
            }
        }
        System.out.println("Student not found with ID: " + id);
    }

    public void sortStudentsByName() {
        Collections.sort(students, (s1, s2) -> s1.getName().compareTo(s2.getName()));
    }

    public void saveDataToFile(String filename) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filename))) {
            outputStream.writeObject(students);
            System.out.println("Data saved to " + filename);
        } catch (IOException e) {
            System.out.println("Error while saving data: " + e.getMessage());
        }
    }
}

