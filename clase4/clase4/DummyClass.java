package com.meltsan.curso.clase4;

/**
 * @author Eduardo Villanueva
 *
 */
public class DummyClass {
	
	  String hello ="Hola";
	    String bye = "Adios";
	    
 void mymethod1(){

	       
	    String s1 = mymethod2("Meltsan");
	    String s2 = this.mymethod2("Eduardo");   

	    System.out.println("s1 = " + s1 + " s2 = " + s2);
        String s3 = this.mymethod3(this, this.hello);
	    System.out.println("s3 = " + s3);
	    
	    s3 = this.mymethod3(this, this.bye);
	 
	    System.out.println("s3 = " + s3);
	 }
	    
    String mymethod2(String name){
    	return "Que tal  " + name;
	    }
	    String mymethod3(Object o1, String s){
	        return s + " " + o1.getClass().getName();
	    }
	    
}


