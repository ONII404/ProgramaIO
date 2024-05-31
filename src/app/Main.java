package app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Menu para seleccionar que metodo usar {Compra, Produccion, Descuento, Redes}

        int opcion;

        do {
            System.out.println("Seleccione una opcion:");
            System.out.println("1. Compra");
            System.out.println("2. Produccion");
            System.out.println("3. Descuento");
            System.out.println("4. Redes");
            System.out.println("5. Salir");
            System.out.print("Opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Llamar al metodo para Compra
                    compra(scanner);
                    break;
                case 2:
                    // Llamar al metodo para Produccion
                    produccion(scanner);
                    break;
                case 3:
                    // Llamar al metodo para Descuento
                    descuentoFun(scanner);
                    break;
                case 4:
                    // Llamar al metodo para Redes
                    redes(scanner);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida, por favor intente de nuevo.");
            }
        } while (opcion != 5);
        scanner.close();
    }

    /**
     * Metodo para Compra
     * 
     */
    public static void compra(Scanner scanner) {
        System.out.println("Ejecutando metodo Compra...");

        int opcionCompra;
        do {
            System.out.println("\n¿Que tipo de demanda tiene?");
            System.out.println("1. Constante");
            System.out.println("2. Variable");
            System.out.println("3. Volver al menu principal");
            System.out.print("Opcion: ");
            opcionCompra = scanner.nextInt();

            double D, S, H, L, Q, Z, Sigma, t;
            int tD, tH;
            Compra compra;

            switch (opcionCompra) {
                case 1:
                    // Implementacion para demanda constante
                    System.out.println("\nDemanda constante seleccionada.");

                    System.out.print("Ingrese el valor de D: ");
                    D = scanner.nextDouble();
                    System.out.print("Si D es Diario ingrese 1, si es Anual ingese 2: ");
                    tD = scanner.nextInt();
                    System.out.print("Ingrese el valor de S: ");
                    S = scanner.nextDouble();
                    System.out.print("Ingrese el valor de H: ");
                    H = scanner.nextDouble();
                    System.out.print("Si H es Diario ingrese 1, si es Anual ingrese 2: ");
                    tH = scanner.nextInt();
                    System.out.print("Ingrese el valor de L: ");
                    L = scanner.nextDouble();

                    compra = new Compra(D, tD, S, H, tH, L);

                    break;
                case 2:
                    // Implementacion para demanda variable
                    System.out.println("\nDemanda variable seleccionada.");

                    System.out.print("Ingrese el valor de Q: ");
                    Q = scanner.nextDouble();
                    System.out.print("Ingrese el valor de L: ");
                    L = scanner.nextDouble();
                    System.out.print("Ingrese el valor de Z: ");
                    Z = scanner.nextDouble();
                    System.out.print("Ingrese el valor de Sigma: ");
                    Sigma = scanner.nextInt();
                    System.out.print("Ingrese el valor de t: ");
                    t = scanner.nextDouble();

                    compra = new Compra(Q, L, Z, Sigma, t);

                    break;
                case 3:
                    // Volver al menu principal
                    System.out.println("Volviendo al menu principal...");
                    break;
                default:
                    System.out.println("Opcion no valida, por favor intente de nuevo.");
            }
        } while (opcionCompra != 3);
    }

    public static void produccion(Scanner scanner) {
        System.out.println("\nEjecutando metodo Produccion...");
        // Implementacion del metodo Produccion

        System.out.println("Ingrese el valor de D:");
        double D = scanner.nextDouble();
        System.out.println("Si D es Diario ingrese 1, si es Anual ingrese 2:");
        int tD = scanner.nextInt();
        System.out.println("Ingrese el valor de S:");
        double S = scanner.nextDouble();
        System.out.println("Ingrese el valor de H:");
        double H = scanner.nextDouble();
        System.out.println("Si H es Diario ingrese 1, si es Anual ingrese 2:");
        int tH = scanner.nextInt();
        System.out.println("Ingrese el valor de a:");
        double a = scanner.nextDouble();

        Produccion produccion = new Produccion(D, tD, S, H, tH, a);
    }

    public static void descuentoFun(Scanner scanner) {
        System.out.println("Ejecutando metodo Descuento...");

        int opcionDescuento;
        do {
            System.out.println("\nSeleccione el tipo de descuento:");
            System.out.println("1. Con 1 limite y 2 costos");
            System.out.println("2. Con 2 limites y 2 costos");
            System.out.println("3. Volver al menu principal");
            System.out.print("Opcion: ");
            opcionDescuento = scanner.nextInt();

            double D, S, H, C1, C2;
            int q, q_2;
            Descuento desc;

            switch (opcionDescuento) {
                case 1:
                    // Implementacion para EOQ con 1 limite y 2 costos
                    System.out.println("\nCon 1 limite y 2 costos seleccionado.");

                    System.out.print("Ingrese el valor de D: ");
                    D = scanner.nextDouble();
                    System.out.print("Ingrese el valor de S: ");
                    S = scanner.nextDouble();
                    System.out.print("Ingrese el valor de H: ");
                    H = scanner.nextDouble();
                    System.out.print("Ingrese el valor de C1: ");
                    C1 = scanner.nextDouble();
                    System.out.print("Ingrese el valor de C2: ");
                    C2 = scanner.nextDouble();
                    System.out.print("Ingrese el valor de q: ");
                    q = scanner.nextInt();

                    desc = new Descuento(D, S, H, C1, C2, q);

                    desc.imprimirResultados();

                    break;
                case 2:
                    // Implementacion para EOQ con 2 limites y 2 costos
                    System.out.println("\nEOQ con 2 limites y 2 costos seleccionado.");

                    System.out.print("Ingrese el valor de D: ");
                    D = scanner.nextDouble();
                    System.out.print("Ingrese el valor de S: ");
                    S = scanner.nextDouble();
                    System.out.print("Ingrese el valor de H: ");
                    H = scanner.nextDouble();
                    System.out.print("Ingrese el valor de C1: ");
                    C1 = scanner.nextDouble();
                    System.out.print("Ingrese el valor de C2: ");
                    C2 = scanner.nextDouble();
                    System.out.print("Ingrese el valor de q: ");
                    q = scanner.nextInt();
                    System.out.print("Ingrese el valor de q_2: ");
                    q_2 = scanner.nextInt();

                    desc = new Descuento(D, S, H, C1, C2, q, q_2);
                    desc.imprimirResultados();

                    break;
                case 3:
                    // Volver al menu principal
                    System.out.println("Volviendo al menu principal...");
                    break;
                default:
                    System.out.println("Opcion no valida, por favor intente de nuevo.");
            }
        } while (opcionDescuento != 3);
    }

    public static void redes(Scanner scanner) {
        System.out.println("Ejecutando metodo Redes...");

        double lam, mu, C_W, C_S;
        int opcionRedes;
        do {
            System.out.println("\nSeleccione el tipo de red:");
            System.out.println("1. Un Servidor");
            System.out.println("2. Multiples Servidores");
            System.out.println("3. Fuente Finita");
            System.out.println("4. Volver al menu principal");
            System.out.print("Opcion: ");
            opcionRedes = scanner.nextInt();

            switch (opcionRedes) {
                case 1:
                    // Implementacion para Un Servidor
                    System.out.println("\nUn Servidor seleccionado.");

                    System.out.print("Ingrese la tasa de llegada (Lamda): ");
                    lam = scanner.nextDouble();
                    System.out.print("Ingrese la tasa de servicio (Mu): ");
                    mu = scanner.nextDouble();
                    System.out.print("Ingrese el costo por espera (C_W): ");
                    C_W = scanner.nextDouble();
                    System.out.print("Ingrese el costo del servidor (C_S): ");
                    C_S = scanner.nextDouble();

                    UnServidor unServidor = new UnServidor(lam, mu, C_W, C_S);

                    break;
                case 2:
                    // Implementacion para Multiples Servidores
                    System.out.println("\nMultiples Servidores seleccionados.");

                    System.out.print("Ingrese la tasa de llegada (Lamda): ");
                    lam = scanner.nextDouble();
                    System.out.print("Ingrese la tasa de servicio (Mu): ");
                    mu = scanner.nextDouble();
                    System.out.print("Ingrese el numero de servidores (s): ");
                    int s = scanner.nextInt();
                    System.out.print("Ingrese el costo por espera (C_W): ");
                    C_W = scanner.nextDouble();
                    System.out.print("Ingrese el costo del servidor (C_S): ");
                    C_S = scanner.nextDouble();

                    MultiServidor multiServidor = new MultiServidor(lam, mu, s, C_W, C_S);

                    break;
                case 3:
                    // Implementacion para Fuente Finita
                    System.out.println("\nFuente Finita seleccionada.");

                    System.out.print("Ingrese la tasa de llegada (λ): ");
                    lam = scanner.nextDouble();
                    System.out.print("Ingrese la tasa de servicio (μ): ");
                    mu = scanner.nextDouble();
                    System.out.print("Ingrese el numero de clientes potenciales (N): ");
                    int N = scanner.nextInt();
                    System.out.print("Ingrese el costo por espera (C_W): ");
                    C_W = scanner.nextDouble();
                    System.out.print("Ingrese el costo del servidor (C_S): ");
                    C_S = scanner.nextDouble();

                    FuenteFinita fuenteFinita = new FuenteFinita(lam, mu, N, C_W, C_S);

                    break;
                case 4:
                    // Volver al menu principal
                    System.out.println("Volviendo al menu principal...");
                    break;
                default:
                    System.out.println("Opcion no valida, por favor intente de nuevo.");
            }
        } while (opcionRedes != 4);
    }
}
