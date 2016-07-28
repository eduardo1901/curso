/* ejercicio2 de la clase 2
@Eduardo Villanueva*/

import java.io.*;

public class ejercicio2{
/*clase principal*/
public static void main (String[] args){

BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));
String name="";
System.out.println("Por favor tecla tu nombre");
try{
name = dataIn.readLine();
} catch (IOException e){
System.out.println("Error");
}

String age="";
System.out.println("Por favor tecla tu edad");
try{
 age = dataIn.readLine();
} catch (IOException e){
System.out.println("Error");
}
System.out.println("Hola " + name + "!"+ "Tu edad es "  + age);
}
}
