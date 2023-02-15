package Array;


import java.util.ArrayList;
import java.util.Scanner;

public class OpcionesArray {
    String capital;
    String pais;
    private ArrayList<String> atlas;
    Scanner sc =new Scanner(System.in);
    public OpcionesArray() {
        atlas = new ArrayList<>();
    }
    public String getIntroducirPais(){
        System.out.println("Introducir Pais");
        return pais = sc.nextLine();
    }
    public String getIntroducirCapital(){
        System.out.println("Introducir Capital:");
        return capital = sc.nextLine();
    }




    public void AñadirEnElAtlas(String pais, String capital){
            getIntroducirCapital();
            getIntroducirPais();
            PaisCapital paisCapital = new PaisCapital(pais,capital);
    }
}
