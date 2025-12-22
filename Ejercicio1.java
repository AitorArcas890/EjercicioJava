import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame la altura ");
        float altura = sc.nextFloat();
        System.out.println("Dame el radio ");
        float radio = sc.nextFloat();

        float volumen = (float) (Math.PI * radio * radio * altura);

        System.out.println("La altura es: " + volumen);
    }
}
