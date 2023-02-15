package Array;

import Hasmap.MenuHasmap;

import java.util.Scanner;

public class MenuArray {
    MenuArray(){

    }
    public static void main(String[] args) {
         OpcionesArray opcionesArray = new OpcionesArray();
        boolean salirhasmap = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("\t\tPrograma Atlas");
        while (!salirhasmap) {
            System.out.println("1- Añadir un atlas                   2-Mostrar el contenido del atlas");
            System.out.println("3- Buscar una entrada en el atlas    4- Modificar el atlas actual");
            System.out.println("5- Ordenar por paises                6- Mostar el contenido del atlas con un iteratos");
            System.out.println("7- Eliminar la entrada del atlas     8- Eliminar por completo el atlas");
            System.out.println("9- Salir");
            System.out.print("Opciones: ");


            int opcion = 0;

            try {
                opcion = Integer.parseInt(sc.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar un número entero.");
            }
            switch (opcion) {
                case 1:
                    opcionesArray.AñadirEnElAtlas("","");
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 9:
                    System.out.println("Hasta luego");
                    salirhasmap = true;
                    break;
                default:
                    System.out.println("Introduce un numero del 1-9");

            }
        }
    }
}
