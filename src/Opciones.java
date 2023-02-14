import java.util.*;

public class Opciones {
    private HashMap<String, String> atlas;
    Scanner sc = new Scanner(System.in);

    public Opciones() {
        atlas = new HashMap<>();

    }

    public void IntroducirPais() {
        System.out.println("Introduce el país");
        String pais = sc.nextLine();
        System.out.println("Introduce capital");
        String capital = sc.nextLine();
        atlas.put(pais, capital);
        System.out.println("Nueva entrada Incorporada ");

    }

    public void MostrarContenidoAtlas() {

        atlas.forEach((Pais, Capital) -> System.out.println("Pais: " + Pais + " Capital: " + Capital));
        System.out.println("Hay " + atlas.size() + " elementos en el atlas");

    }

    public void BuscarEntrada() {
        System.out.print("Introduce el pais: ");
        String Pais = sc.nextLine();
        if (atlas.containsKey(Pais)) {
            System.out.println("Capital " + atlas.get(Pais));
        } else {
            System.out.println("No existe ningun pais introducido ");
        }
    }
    public void ordenarPaises() {
        List<Map.Entry<String, String>> listaPaises = new ArrayList<>(atlas.entrySet());
        Collections.sort(listaPaises, new ComparadorAlfabetico());
        for (Map.Entry<String, String> pais : listaPaises) {
            System.out.println("País: " + pais.getKey() + ", Capital: " + pais.getValue());
        }
    }

    private class ComparadorAlfabetico implements Comparator<Map.Entry<String, String>> {
        public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
            return o1.getKey().compareTo(o2.getKey());
        }
    }


    public void Modificarentrada(){
        System.out.print("Introduce el país a modificar: ");
        String Pais = sc.nextLine();
        System.out.print("Teclea la nueva capital: ");
        String NuevaCapital = sc.nextLine();

        if (atlas.containsKey(Pais)) {
            atlas.put(Pais, NuevaCapital);
            System.out.println("Se ha modificado la capital de " + Pais + " a " + NuevaCapital);
        } else {
            System.out.println("No se ha encontrado el país " + Pais + " en el atlas");
        }
    }
    public  void MostrarContenidoConIteratos(){
        Iterator<Map.Entry<String, String>> atlasiterator = atlas.entrySet().iterator();
        while (atlasiterator.hasNext()) {
            Map.Entry<String, String> entry = atlasiterator.next();
            System.out.println("País: " + entry.getKey() + " Capital: " + entry.getValue());
        }
    }

}
