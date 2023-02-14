import java.util.Scanner;

public class MenuPrincipal {
    public static void main(String[] args) {
        boolean salir = false;
        Scanner sc = new Scanner(System.in);
        MenuHasmap MenuHasmap = new MenuHasmap();
        while (!salir) {
            System.out.println("1 Hasmap ");
            System.out.println(" 2 Array");
            System.out.println("3- Salir");

            System.out.print("Opciones: ");
            int opcion = 0;

            try {
                opcion = Integer.parseInt(sc.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar un número entero.");
            }
            switch (opcion){
                case 1:
                    MenuHasmap.menuHasmap();
                    break;
                case 2:
                    System.out.println("Array");
                    break;
                case 3:
                    salir =true;
                    System.out.println("salir");
                    break;
            }
        }
    }
}

