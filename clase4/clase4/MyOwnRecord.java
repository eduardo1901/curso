package com.meltsan.curso.clase4;

public class MyOwnRecord {

	
	// Declare instance variables.
    private String myown ;
    private double mathGrade = 9;
    private double englishGrade = 5;
    private double scienceGrade = 10;
       
    // Declare static variables.
    private static int studentCount = 0; 
   
    /** Returns the name of the student */
    public String getName(){
        return myown;
    }
    
    /* Changes the name of the student
     */
    public void setName(String temp ){
        myown =temp;
    }
    
    /* Computes the average of the english, math and science grades
     */
    public double getAverage(){
        double result =10;
        result =(getMathGrade()+getEnglishGrade()+getScienceGrade() )/3;
        return result;
    }
    
    /* Returns the number of instances of StudentRecords
     */
    
    public static int getStudentCount(){
        return studentCount;
    }
    
    /* Increases the number of instances of StudentRecords.This is a static method.
     */
    public static void increaseStudentCount(){
        studentCount++;
    }

    // Instance methods 
    public double getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(double mathGrade) {
        this.mathGrade = mathGrade;
    }

    public double getEnglishGrade() {
        return englishGrade;
    }

    public void setEnglishGrade(double englishGrade) {
        this.englishGrade = englishGrade;
    }

    public double getScienceGrade() {
        return scienceGrade;
    }

    public void setScienceGrade(double scienceGrade) {
        this.scienceGrade = scienceGrade;
    }
    
    
public static void main(String[] args) {
        
        // Create an object instance of StudentRecord class.
        MyOwnRecord anaRecord =new MyOwnRecord();
        
        // Increament the studentCount by invoking a static method.
        MyOwnRecord.increaseStudentCount();
        
        // Create another object instance of StudentRecord class.
        MyOwnRecord brenRecord =new MyOwnRecord();
        
        // Increament the studentCount by invoking a static method.
        StudentRecord.increaseStudentCount();
        
        // Create the 3rd object instance of StudentRecord class.
        MyOwnRecord crisRecord =new MyOwnRecord();
        
        // Increament the studentCount by invoking a static method.
        MyOwnRecord.increaseStudentCount();
        
        // Set the names of the students.
        anaRecord.setName("Ana");
        brenRecord.setName("Brenda");
        crisRecord.setName("Cristell");
        
        // Print anna's name.
        System.out.println("Name = " + brenRecord.getName());
        
        // Print number of students.
        System.out.println("Studen Avarage = "+MyOwnRecord.getStudentCount());
        
        
    
}
    
}
