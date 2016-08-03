package com.meltsan.curso.clase4;

public class MyStaticVariableExampleProject {
	
public static void main(String[] args) {
        
        // Access static variables of Variables class.
        // Note that you don't have to create an object instance
        // of Variables class.
        System.out.println("Variables.staticintA = " + Variables.staticintA);
        System.out.println("Variables.staticStringB = " + Variables.staticStringB);
        Variables.staticStringB = "Life is good!";
        System.out.println("Variables.staticStringB = " + Variables.staticStringB);
        
        // Access instance variables of Variables class.
        // Note that you have to create an object instance
        // of Variables class before you access them.
        Variables objectInstance1 = new Variables();
        Variables objectInstance2 = new Variables();
        objectInstance1.instanceintA = 1;
        System.out.println("objectInstance1.instanceintA = " + objectInstance1.instanceintA);
        objectInstance2.instanceintA = 3;
        System.out.println("objectInstance2.instanceintA = " + objectInstance2.instanceintA);
        
        // The static variable can be accessed from an object instance.
        System.out.println("objectInstance1.staticintA = " + Variables.staticintA);
        Variables.staticintA = 3;
        System.out.println("objectInstance1.staticintA = " + Variables.staticintA);
        System.out.println("Variables.staticintA = " + Variables.staticintA);
        
        // The static variable can be accessed from multiple object instances.
        Variables.staticintA = 550;
        System.out.println("objectInstance1.staticintA = " + Variables.staticintA);
        System.out.println("objectInstance2.staticintA = " + Variables.staticintA);
        System.out.println("Variables.staticintA = " + Variables.staticintA);
        System.out.println("Este es el mensaje prueba = " + Variables.staticStringC);
}


}

