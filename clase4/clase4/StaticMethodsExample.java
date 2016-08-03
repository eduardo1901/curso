package com.meltsan.curso.clase4;

public class StaticMethodsExample {

	public static void main(String[] args) {

        // Access a static variable of Methods class.  Note that you don't have to
        // create an object instance of Methods class.
        System.out.println("Methods.a = " + Methods.a);
        
        // Invoke a static method of Methods class. Note that you don't have to
        // create an object instance of Methods class.
        Methods.staticMethod(5);
        
        new Methods();
        System.out.println("d.a = " + Methods.a);
        
        // The static method can be invoked from an object instance.
        Methods.staticMethod(0);
        
        new Methods();
        System.out.println("e.a = " + Methods.a);
        Methods.a += 3;
        System.out.println("Methods.a = " + Methods.a);
        System.out.println("d.a = " + Methods.a);
        System.out.println("e.a = " + Methods.a);
        
    }
}
