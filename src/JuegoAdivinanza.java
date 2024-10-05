import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanza {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);
        int intentos = 0;
        //Pasamos el numero magico a una constante
        final int MAX_INTENTOS = 10; 

        System.out.println("Adivina el número entre 1 y 100. Tienes " + MAX_INTENTOS + " intentos.");

        while (intentos < MAX_INTENTOS) {
            System.out.print("Intento " + (intentos + 1) + ": ");
            int adivinanza = scanner.nextInt();
            intentos++;

            if (adivinanza == numeroSecreto) {
                System.out.println("¡Correcto! Lo adivinaste en " + intentos + " intentos.");
                return;
            } else if (adivinanza < numeroSecreto) {
                System.out.println("El número que has elegido es mayor.");
            } else {
                System.out.println("El número que has elegido es menor.");
            }
        }

        System.out.println("Vayaa,has llegado al numero maximo de intetos. El número era " + numeroSecreto + ".");
        scanner.close();
    }
}

