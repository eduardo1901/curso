/**Este es el ejercicio numero 4 donde se dan 3 numeros
y se determina que numero de los 3 es mas alto
*@Eduardo Villanueva */

public class ejercicio4{
//Esta es la clase principal
public static void main (String [] args){
int num1=10, num2=23, num3=5, max=0; // Se declaran y se dan valores


//Se hacen comparaciones entre los 3 numeros para determinar cual es el mas grande
max = (num1 >  num2) ? num1 : num2;
max = (max > num3) ? max : num3;

//Se imprimen los numero y el resultado de que numero es el mayor
System.out.println ("number 1 = " + num1);
System.out.println ("number 2 = " + num2);
System.out.println ("number 3 = " + num3);
System.out.println ("The highest number  is  = " + max);

}
}

