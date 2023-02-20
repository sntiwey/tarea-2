import java.util.Scanner;

public class cadenastringtarea{

     public static void main(String[] args){

        Scanner sc =new Scanner (System.in);

        System.out.println("Cual es tu nombre?");
        String nombre = sc.nextLine();  //Introducimos nombre

                System.out.println("");

        Scanner dp = new Scanner (System.in);

        System.out.println("Cual es tu profesion?" );
        String profesion = sc.nextLine();  //Introducimos la profesion

                System.out.println("");

        Scanner kp = new Scanner (System.in);

        System.out.println("Donde vives?");
        String pais = sc.nextLine();  //Introducimos donde vives (pais)

               System.out.println("");
          System.out.println("Nombre: " + nombre);
          System.out.println("Profesion: " + profesion);
          System.out.println("Pais: " + pais);

 }
}
