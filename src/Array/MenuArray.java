package Array;



import java.util.Scanner;

public class MenuArray {
    public MenuArray(){

    }
    /*Realizamos un menu para meter los metodos anterioriores*/
   public void MenuArray(){
         OpcionesArray opcionesArray = new OpcionesArray();
        boolean salirhasmap = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("\t\tPrograma Atlas");
        while (!salirhasmap) {
            System.out.println("\u001B[m1- Añadir un atlas                   2-Mostrar el contenido del atlas");
            System.out.println("3- Buscar una entrada en el atlas    4- Modificar el atlas actual");
            System.out.println("5- Ordenar por paises                6- Mostar el contenido del atlas con un iteratos");
            System.out.println("7- Eliminar la entrada del atlas     8- Eliminar por completo el atlas");
            System.out.println("9- Salir");
            System.out.print("Opciones: \u001B[0m");


            int opcion = 0;

            try {
                opcion = Integer.parseInt(sc.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("\u001B[31mError: Debe ingresar un número entero.");
            }
            switch (opcion) {
                case 1:
                    opcionesArray.AñadirEnElAtlas("","");
                    break;
                case 2:
                    opcionesArray.MostrarAtlas();
                    break;
                case 3:
                    opcionesArray.BuscarEntradaAtlas();
                    break;
                case 4:
                    opcionesArray.ModificarAtlas();
                    break;
                case 5:
                    opcionesArray.OrdenarAtlas();
                    break;
                case 6:
                    opcionesArray.MostrarContenidoConIterator();
                    break;
                case 7:
                    opcionesArray.BorrarEntradaAtlas();
                    break;
                case 8:
                    opcionesArray.BorrarAtlasEntero();
                    break;
                case 9:

                    salirhasmap = true;
                    break;
                default:
                    System.out.println("\u001B[31mIntroduce un numero del 1-9");

            }
        }
    }
}
