/*este es el primer ejercicio de java
@eduardo villanueva*/
import javax.swing.JOptionPane;
public class array1 {


public static void main (String [] args) {
   /*se declaran las variables*/
   int [] num = new int [10];
   int counter;
   int max= 0;
   int totalnumber=3;

for (counter =0; counter < totalnumber; counter++ ){
  num[counter] = Integer.parseInt (JOptionPane.showInputDialog("Enter numbers until" + totalnumber + "numbers are entered"));
if((counter == 0)||(num[counter] > max))
max = num [counter];
}

JOptionPane.showMessageDialog(null,"The number with the greatest value is " +max);
}
}
