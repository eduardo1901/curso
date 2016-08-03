package com.meltsan.curso.clase4;

public class Constructor {

public static void main(String[] args) {
        
        // Create an object instance of StudentRecord class.
        StudentRecord annaRecord = new StudentRecord("Anna");
        
        // Increament the studentCount by invoking a static method.
        StudentRecord.increaseStudentCount();
        
        // Create another object instance of StudentRecord class.
        StudentRecord beahRecord =new StudentRecord("Beah", 45);
        
        // Increament the studentCount by invoking a static method.
        StudentRecord.increaseStudentCount();
        
        // Create the 3rd object instance of StudentRecord class.
        StudentRecord crisRecord =new StudentRecord("Cris", 45, 67.45, 88.65);
        
        // Increament the studentCount by invoking a static method.
        StudentRecord.increaseStudentCount();
        
        // Print Cris' name and average
        System.out.println("Name = " + crisRecord.getName() + " Average = " + crisRecord.getAverage());
        
        // Print number of students.
        System.out.println("Student Count = "+StudentRecord.getStudentCount());
    }
}
