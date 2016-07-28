/*Programas sobre array en java
@eduardo villanueva*/

import javax.swing.JOptionPane;

public class javaarray{
/*Clase principal */
public static void main (String [] args){

String [] nombre= new String[3];
String [] apellido= new String [3];
String nombrelargo="";
int count=0;

for (count=0; count<nombre.length; count+=1){
   do{
   nombre[count]=JOptionPane.showInputDialog(null,"Ingrese el nombre");
   if (nombre [count].equals("")){
     JOptionPane.showInputDialog(null,"Debes de ingresar un nombre");
      }
} while (nombre[count].equals(""));

do{
 apellido[count]=JOptionPane.showInputDialog(null,"Ingrese el apellido");
 if (apellido [count].equals("")){
   JOptionPane.showInputDialog(null,"Debes de ingresar un apellido");
     }
 } while (apellido[count].equals(""));
}
nombrelargo=(nombre[0].length()>nombre[1].length()) ? nombre[0]:nombre[1];

nombrelargo=(nombrelargo.length()>apellido[1].length()) ?nombrelargo: apellido[0];

JOptionPane.showMessageDialog(null,"El nombre mas largo de la familia es " +nombrelargo);


}
}
