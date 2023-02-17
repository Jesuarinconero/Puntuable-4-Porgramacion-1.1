import Array.MenuArray;
import Hasmap.MenuHasmap;
import java.util.Scanner;

public class MenuPrincipal {
    public static void main(String[] args) {
        boolean salir = false;
        Scanner sc = new Scanner(System.in);
        MenuHasmap MenuHasmap = new MenuHasmap();
        MenuArray MenuArray = new MenuArray();
        while (!salir) {
            System.out.println("\u001B[35mPrograma Lista\u001B[0m");
            System.out.println("\u001B[32m1- Hasmap ");
            System.out.println("2- Array");
            System.out.println("3- Salir \u001B[0m");

            System.out.print("\u001B[36mOpciones: ");
            int opcion = 0;

            try {
                opcion = Integer.parseInt(sc.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("\u001B[31mError: Debe ingresar un número entero.");
            }
            switch (opcion){
                case 1:
                    MenuHasmap.menuHasmap();
                    break;
                case 2:
                    MenuArray.MenuArray();
                    break;
                case 3:
                    salir =true;
                    System.out.println("El programa ha finalizado");
                    break;
            }
        }
    }
}
