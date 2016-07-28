/*Se modificara uno de los ejercicios vistos donde se pide usuario y contraseña*/

import java.io.*;

public class tarea{
private static final String USERNAME ="eduardo";
private static final String PASSWORD = "1234";

public static void main (String [] args){
BufferedReader dataIn = new BufferedReader( new InputStreamReader(System.in));
String username="", password="";
try{
do{
System.out.println("Usuario = ");
username = dataIn.readLine();
}while (username.equals("") ||  !username.equals(USERNAME) );
}catch (IOException e){
System.out.println("Usuario correcto");
}

try{
 do{
System.out.println("Contraseña = ");
password= dataIn.readLine();
}while (!password.equals(PASSWORD)|| username.equals(""));
}catch (IOException e){
System.out.println("Error de contraseña");

}
System.out.println("Bienvenido!!!!");
}


}


