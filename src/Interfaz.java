import java.util.Scanner;

public class Interfaz {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("¿Qué nivel quieres usar? (1, 2, 3, 4): ");
            String nivel = scanner.nextLine().trim();
            if (nivel.equalsIgnoreCase("salir")){
                System.out.println("Saliendo del programa");
                break;
            }
            switch (nivel) {
                case "1":
                    System.out.println("Introduce un número (o 'salir' para terminar):");
                    String entrada = scanner.nextLine().trim();
                    while(!entrada.equalsIgnoreCase("salir") && Integer.parseInt(entrada)) {
                        Lanzador.proceso(entrada);
                        System.out.println("Introduce otro número (o 'salir' para terminar):");
                        entrada = scanner.nextLine().trim();
                        }
                    System.out.println("factor: " + scanner + "Opc");
                    break;

                case "2":

                default:
                    System.out.println("factor: " + scanner + "Opc");
            }
        }
    }

}
