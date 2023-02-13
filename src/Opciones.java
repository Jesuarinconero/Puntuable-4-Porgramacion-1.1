import java.util.HashMap;
import java.util.Scanner;

public class Opciones {
    private HashMap<String, String> atlas;
    Scanner sc =new Scanner(System.in);
    public Opciones() {
        atlas = new HashMap<>();

    }
    public void IntroducirPais(){
        System.out.println("Introduce el país");
        String pais = sc.nextLine();
        System.out.println("Introduce capital");
        String capital = sc.nextLine();
        atlas.put(pais,capital);
        System.out.println("Nueva entrada Incorporada ");

    }
    public void MostrarContenidoAtlas(){

        atlas.forEach( (Pais, Capital) -> System.out.println("Pais: " +Pais+" Capital: "+Capital));
        System.out.println("Hay "+ atlas.size()+" elementos en el atlas");

    }
    public void  BuscarEntrada(){
        System.out.print("Introduce el pais: ");
        String Pais =sc.nextLine();
        if (atlas.containsKey(Pais)){
            System.out.println("Capital " +atlas.get(Pais));
        } else {
            System.out.println("No existe ningun pais introducido ");
        }
    }
    public void OrdenarPais(){

    }

}
