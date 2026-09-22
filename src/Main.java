import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Qué nivel quieres usar? (1, 2, 3, 4)");
        while(true){
            System.out.println("¿Qué nivel quieres usar? (1, 2, 3, 4)");
            String nivel = scanner.nextLine().trim();
            if (nivel.equalsIgnoreCase("salir")){
                System.out.println("Saliendo del programa...");
                break;
            }

            switch (nivel) {
                case "1":
                    System.out.println("Introduce un número (o 'salir' para terminar):");
                    String entrada = scanner.nextLine();
                    proceso(entrada);
                    break;
                default:
                    System.out.println("factor: " + scanner + "Opc");
                }
            }
        }

    }

    public static void proceso(String numero) {
        try {
            ProcessBuilder pb = new ProcessBuilder("factor", numero);
            Process process = pb.start();

            try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
                String linea;
                while ((linea = reader.readLine()) != null) {
                    System.out.println(linea);
                }
            }
            int exitCode = process.waitFor();
            System.out.println("Código de salida: " + exitCode);

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}