import java.util.Map;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Opciones opciones = new Opciones();
        boolean salir = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("\t\tPrograma Atlas");
        while (!salir){
            System.out.println("1 Añadir un atlas\t 2-Mostrar el contenido del atlas");
            System.out.println("3 Buscar una entrada en el atlas\t 4- Modificar el atlas actual");
            System.out.println("5 Ordenar por paises\t 6- Mostar el contenido del atlas con un iteratos");
            System.out.println("7 Eliminar la entrada del atlas\t 8- Eliminar por completo el atlas");
            System.out.println("9 Salir");
            System.out.print("Opciones: ");


            int opcion =0;

            try {
                 opcion = Integer.parseInt(sc.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar un número entero.");
            }
            switch (opcion){
                case 1:
                    opciones.IntroducirPais();
                    break;
                case 2:
                    opciones.MostrarContenidoAtlas();
                    break;
                case 3:
                    opciones.BuscarEntrada();
                    break;
                case 4:
                    opciones.Modificarentrada();
                    break;
                case 5:
                    opciones.ordenarPaises();
                    break;
                case 6:
                    opciones.MostrarContenidoConIteratos();
                    break;
                case 7:
                    System.out.println(7);
                    break;
                case 8:
                    System.out.println(8);
                    break;
                case 9:
                    System.out.println("Hasta luego");
                    salir = true;
                    break;
                default:
                    System.out.println("Introduce un numero del 1-9");


            }
        }
    }
}