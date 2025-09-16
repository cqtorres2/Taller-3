import java.util.Scanner;

public class Matematica {
    int numero1;
    int numero2;
    static int resultado;

    public Matematica(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(
                    "Por favor seleccióne un numero de 1 a 4 para realizar su operación 1-suma, 2-resta, 3-multiplicación y 4-división");
            int Eleccion = scanner.nextInt();
            System.out.println("Seleccione los numeros a usar en la operación");
            double numero1 = scanner.nextDouble();
            double numero2 = scanner.nextDouble();
            double resultado = 0;
            if (Eleccion == 1) {

                resultado = numero1 + numero2;
            }
            if (Eleccion == 2) {

                resultado = numero1 - numero2;
            }
            if (Eleccion == 3) {

                resultado = numero1 * numero2;
            }
            if (Eleccion == 4) {
                resultado = numero1 / numero2;
            }
            System.out.println("El resultado de la opreación es: " + Math.floor(resultado));
        }
    }
}
