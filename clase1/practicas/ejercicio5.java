/** Este es el ejercicio 5 el cual selecciona
*el numero mas pequeño de 3 y determina si es mayor o menor que 10
*@Eduardo Villanueva
**/
public class ejercicio5{ //esta es la clase principal
public static void main (String[] args) {
int num1= 11, num2=13, num3=25, min=0;// se declaran variables y se le asigna un valor

min = (num1 < num2) ? num1 : num2;
min = (min < num3) ? min : num3;
//se hace la comparacion para determinar el menori de los numeros
System.out.println("Numero 1 = " + num1);
System.out.println("Numero 2 = " + num2);
System.out.println("Numero 3 = " + num3);
System.out.println("El menor de los numeros es: " + min);//se imprimen los resultados
if (min < 10){ //se hace una condicion para saber si es mayor o menor que 10
System.out.println("El numero mas pequeño es menor a 10");
}
else{
System.out.println("El numero mas pequeño es igual o mayor que  10");
}
}
}
