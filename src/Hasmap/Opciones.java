package Hasmap;

import java.util.*;
import Hasmap.MenuHasmap;

public class Opciones {
    private HashMap<String, String> atlas;
    Scanner sc = new Scanner(System.in);

    public Opciones() {
        atlas = new HashMap<>();
        atlas.put("Portugal","Lisboa");

    }

    public void IntroducirPais() {
        System.out.println("\u001B[36mIntroduce el país");
        String pais = sc.nextLine();
        System.out.println("\u001B[36mIntroduce capital");
        String capital = sc.nextLine();
        atlas.put(pais, capital);
        System.out.println("\u001B[33mNueva entrada Incorporada ");

    }

    public void MostrarContenidoAtlas() {

        atlas.forEach((Pais, Capital) -> System.out.println("\u001B[35mPais: " + Pais + " Capital: " + Capital));
        System.out.println("\u001B[35mHay " + atlas.size() +"elementos en el atlas");

    }

    public void BuscarEntrada() {
        System.out.print("\u001B[34mIntroduce el pais: ");
        String Pais = sc.nextLine();
        if (atlas.containsKey(Pais)) {
            System.out.println("\u001B[34mCapital " + atlas.get(Pais));
        } else {
            System.out.println("\u001B[31mNo existe ningun pais introducido ");
        }
    }
    public void ordenarPaises() {
        List<Map.Entry<String, String>> listaPaises = new ArrayList<>(atlas.entrySet());
        Collections.sort(listaPaises, new ComparadorAlfabetico());
        for (Map.Entry<String, String> pais : listaPaises) {
            System.out.println("\u001B[36mPaís: " + pais.getKey() + ", Capital: " + pais.getValue());
        }
    }

    private class ComparadorAlfabetico implements Comparator<Map.Entry<String, String>> {
        public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
            return o1.getKey().compareTo(o2.getKey());
        }
    }


    public void Modificarentrada(){
        System.out.print("\u001B[35mIntroduce el país a modificar: ");
        String Pais = sc.nextLine();
        System.out.print("\u001B[35mTeclea la nueva capital: ");
        String NuevaCapital = sc.nextLine();

        if (atlas.containsKey(Pais)) {
            atlas.put(Pais, NuevaCapital);
            System.out.println("\u001B[35mSe ha modificado la capital de " + Pais + " a " + NuevaCapital);
        } else {
            System.out.println("\u001B[31mNo se ha encontrado el país " + Pais + " en el atlas");
        }
    }
    public  void MostrarContenidoConIteratos(){
        Iterator<Map.Entry<String, String>> atlasiterator = atlas.entrySet().iterator();
        while (atlasiterator.hasNext()) {
            Map.Entry<String, String> entry = atlasiterator.next();
            System.out.println("\u001B[36mPaís: " + entry.getKey() + " Capital: " + entry.getValue());
        }
        System.out.println("\u001B[35mHay " + atlas.size() +"elementos en el atlas");
    }

    public void  ElimininarUnaEntrada(){
        System.out.println("\u001B[31mIntroduce el pais que desea borrar");
        String Pais = sc.nextLine();
        if (atlas.containsKey(Pais)){
            atlas.remove(Pais);
        }else {
            System.out.println("\u001B[31mEl Pais no se encuentra en el atlas");
        }
    }
    public void EliminarAtlas(){
        atlas.clear();
        System.out.println("\u001B[33mEliminado el Atlas por completo");
    }

}
