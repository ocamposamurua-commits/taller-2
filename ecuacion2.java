import java.util.Scanner;

public class ecuacion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- CÁLCULO DE LA ECUACIÓN 2 ---");
        //commit 6
        System.out.print("Ingrese el valor de x: ");
        double x = scanner.nextDouble();
        System.out.print("Ingrese el valor de z: ");
        double z = scanner.nextDouble();

        //commit 7

        // Término 1
        double termino1 = (Math.pow(x, 2) + 3 * z + 2) / (2.0 + (1.0 / (1.0 + 2 * z)));

        // Término 2 (Fracción compleja)
        double numTermino2 = 2.0 / (1.0 + 3 * Math.pow(x, 3) + 3 * z + 2.0);
        double denomFraccionInterna = 2 * z + (3.0 / (1.0 + (5.0 / z)));
        double denTermino2 = 1.0 / ((1.0 / (1.0 + 3 * x)) + ((3 * x + 1) / denomFraccionInterna));

        double termino2 = numTermino2 / denTermino2;

        // Resultado final
        double y = termino1 + termino2;
        System.out.println("\nEl resultado de y es: " + y);
        
        scanner.close();
    }
}