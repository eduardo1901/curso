import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class archivo{


public static void main (String[] args){

BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in));

int grade= 0;
int num = 0; 

System.out.print("Please Enter Your grade: ");

try {
 grade = Integer.parseInt(dataIn.readLine());
/*60-70= c
71-80=b
81-90=a+
91=98=s
*/
 String  calificacion ="";

if (grade > 60 && grade <=70){
 calificacion = "C"; 
} 
else if (grade >= 71 && grade <=80){
 calificacion = "B";
}
else if(grade >= 81 && grade <=90){
 calificacion = "A" ;
}
else if (grade >= 91 && grade <=98){
calificacion = "A+";
}
else if (grade >=99 && grade <=100){
 calificacion= "S";
}

do{
System.out.println("grado = " + grade);
 grade++;
break;
}
while (grade<100);

switch (calificacion){
case "S":
System.out.println("Mencion Honorifica con S");
break;
case "A":
System.out.println("Mencion Honorifica con A");
break;
case "C":
System.out.println("de pansazo");
break;
default :
System.out.println("Estas en caso Default");
break;
}

}catch (IOException e) {
}
catch (NumberFormatException e){
 System.out.println("Formato desconocido");
}

}
}
