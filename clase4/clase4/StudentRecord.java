package com.meltsan.curso.clase4;

/**
 * @author meltsan
 *
 */
public class StudentRecord {

    // Declare instance variables.
    private String name;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
       
    // Declare static variables.
    private static int studentCount = 0; 
    
 // Default constructor
    public StudentRecord() {
    }
    
    // Constructor that gets single parameter
    /**
     * @param name
     */
    public StudentRecord(String name){
        this.name = name;
    }
    
    // Constructor that gets two parameters
    public StudentRecord(String name, double mGrade){
        this.name = name;
        mathGrade = mGrade;
    }

    // Constructor that gets three parameters
    public StudentRecord(String name, double mGrade, double eGrade){
        this.name = name;
        mathGrade = mGrade;
        englishGrade = eGrade;
    }

    // Constructor that gets four parameters
    public StudentRecord(String name, double mGrade, double eGrade,
            double sGrade){
        this.name = name;
        mathGrade = mGrade;
        englishGrade = eGrade;
        scienceGrade = sGrade;
    }
    
   
    /** Returns the name of the student */
    public String getName(){
        return name;
    }
    
    /* Changes the name of the student
     */
    public void setName(String temp ){
        name =temp;
    }
    
    /* Computes the average of the english, math and science grades
     */
    public double getAverage(){
        double result =0;
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
    
 // Overloaded myprint(..) methods
    public void myprint(){
        System.out.println("First overloaded method: Nothing is passed on");
    }
    
    public void myprint(String name ){
        System.out.println("Second overloaded method: Name:"+name);
    }
    
    public void myprint(String name, double averageGrade){
        System.out.print("Third overloaded method: Name:"+name+" ");
        System.out.println("Average Grade:"+averageGrade);
    }
    
    
public static void main(String[] args) {
        
        // Create an object instance of StudentRecord class.
        StudentRecord annaRecord =new StudentRecord();
        
        // Increament the studentCount by invoking a static method.
        StudentRecord.increaseStudentCount();
        
        // Create another object instance of StudentRecord class.
        StudentRecord beahRecord =new StudentRecord();
        
        // Increament the studentCount by invoking a static method.
        StudentRecord.increaseStudentCount();
        
        // Create the 3rd object instance of StudentRecord class.
        StudentRecord crisRecord =new StudentRecord();
        
        // Increament the studentCount by invoking a static method.
        StudentRecord.increaseStudentCount();
        
        // Set the names of the students.
        annaRecord.setName("Anna");
        beahRecord.setName("Beah");
        crisRecord.setName("Cris");
        
        // Print anna's name.
        System.out.println("Name = " + beahRecord.getName());
        
        // Print number of students.
        System.out.println("Student Count = "+StudentRecord.getStudentCount());
        // Set Anna's grades
        annaRecord.setName("Anna");
        annaRecord.setEnglishGrade(95.5);
        annaRecord.setScienceGrade(100);
        annaRecord.setMathGrade(100);
        
        // Invoke overloaded methods
        annaRecord.myprint();
        annaRecord.myprint(annaRecord.getName());
        annaRecord.myprint(annaRecord.getName(), annaRecord.getAverage());

}
    
}

