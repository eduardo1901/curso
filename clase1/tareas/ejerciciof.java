/**Este es el ejercicio final
donde se determina que numero de 3 es el mas pequeño y si es mayor
o menor a 10 @Eduardo Villanueva */

public class ejerciciof{
//Esta es la clase principal

public static void main (String[] args){
int num1= 11, num2=28, num3=10, min=0; //Se declaran variables y se les da un valor

//Se determina cual de los 3 numeros es el mas pequeño
min = (num1 < num2) ? num1 : num2;
min = (min < num3) ? min : num3;

//Se imprimen los valores y el resultado del numero mas pequeño
System.out.println("Numero 1 = " + num1);
System.out.println("Numero 2 = " + num2);
System.out.println("Numero 3 = " + num3);
System.out.println("El numero mas pequeño es = " + min);

//Se hace un condicion para saber si el num es mayor o menor que 10
if (min == 10){
System.out.println("El numero mas pequeño es igual a 10");
} else{
if (min < 10){
System.out.println("El numero mas pequeño es menor a 10 ");
}
 else {
System.out.println("El numero mas pequeño es mayor a 10 ");
} 
}
}

}
