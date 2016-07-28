/* ejercicio3 de la clase 2
@Eduardo Villanueva*/

import java.io.*;

public class ejercicio3{
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
int ageint = Integer.parseInt(age);
System.out.println("Hola " + name + "!"+ "Tu edad es "  + age);
if (ageint > 100){
System.out.println("Hello " + name + "!" + "" + "Tu eres viejo");
} else {
System.out.println("Hello " + name + "!" + "" + "Tu eres joven");
}
}
}
