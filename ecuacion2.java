import java.util.Scanner;

public class ecuacion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== MENÚ DE OPCIONES ===");
        System.out.println("1. Calcular Ecuación 1");
        System.out.println("2. Calcular Ecuación 2");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("\n--- CÁLCULO DE LA ECUACIÓN 1 ---");
                System.out.print("Ingrese el valor de x: ");
                double x1 = scanner.nextDouble();
                System.out.print("Ingrese el valor de z: ");
                double z1 = scanner.nextDouble();

                // Numerador Ecuación 1
                double numEcuacion1 = (3 * x1) / (1.0 + ((3 * x1) / (3 * Math.pow(z1, 2) + 2)));

                // Denominador Ecuación 1
                double denEcuacion1 = 1.0 / ((1.0 / (1.0 + z1)) + 3 * Math.pow(x1, 2) + 2 * z1 + 3);

                double y1 = numEcuacion1 / denEcuacion1;
                System.out.println("\nEl resultado de y para la Ecuación 1 es: " + y1);
                break;

            case 2:
                System.out.println("\n--- CÁLCULO DE LA ECUACIÓN 2 ---");
                System.out.print("Ingrese el valor de x: ");
                double x2 = scanner.nextDouble();
                System.out.print("Ingrese el valor de z: ");
                double z2 = scanner.nextDouble();

                // Término 1
                double termino1 = (Math.pow(x2, 2) + 3 * z2 + 2) / (2.0 + (1.0 / (1.0 + 2 * z2)));

                // Término 2 (Fracción compleja)
                double numTermino2 = 2.0 / (1.0 + 3 * Math.pow(x2, 3) + 3 * z2 + 2.0);
                double denomFraccionInterna = 2 * z2 + (3.0 / (1.0 + (5.0 / z2)));
                double denTermino2 = 1.0 / ((1.0 / (1.0 + 3 * x2)) + ((3 * x2 + 1) / denomFraccionInterna));

                double termino2 = numTermino2 / denTermino2;

                // Resultado final
                double y2 = termino1 + termino2;
                System.out.println("\nEl resultado de y para la Ecuación 2 es: " + y2);
                break;

            case 3:
                System.out.println("\nSaliendo del programa...");
                break;

            default:
                System.out.println("\nOpción no válida. Intente de nuevo.");
                break;
        }

        scanner.close();
    }
}