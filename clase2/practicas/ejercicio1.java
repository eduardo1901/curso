/* Ejercicio 1 de la clase numero 2
@Eduardo Villanueva*/

import java.io.*;

public class ejercicio1{

public static void main (String [] args){

BufferedReader dataIn = new BufferedReader (new InputStreamReader(System.in));

String name = "";
System.out.println("Por Favor Teclea Tu Nombre: ");
try{
name= dataIn.readLine();
}catch (IOException e){
System.out.println("Erorr");
}
System.out.println("Hello " + name + "!");
}
}
