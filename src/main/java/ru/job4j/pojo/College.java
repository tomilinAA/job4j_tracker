package ru.job4j.pojo;

import java.time.LocalDate;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Angelina Petrova");
        student.setStudentGroup("DS17-11BP");
        student.setDateOfReceipt(LocalDate.now());
        System.out.println("Student: "  + student.getFullName() + System.lineSeparator() + "Student group: "
                + student.getStudentGroup() + System.lineSeparator()
                + "Date of Receipt: " + student.getDateOfReceipt());
    }
}
