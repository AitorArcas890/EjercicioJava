import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce el numero de horas");
        int horas= sc.nextInt();
        int dias= horas / 24;
        int horas = horas % 24;
        System.out.println(horas + "El desglose es: " + dias + " dias y " + horas + " horas ");

    }
}
