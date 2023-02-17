package Array;


import java.util.*;

public class OpcionesArray {
    String capital;
    String pais;
    private ArrayList<PaisCapital> atlas = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    OpcionesArray() {
    }

    public String getIntroducirPais() {
        System.out.print("\u001B[36mIntroducir Pais");
        return pais = sc.nextLine();
    }

    public String getIntroducirCapital() {
        System.out.print("\u001B[36mIntroducir Capital:");
        return capital = sc.nextLine();
    }


    public void AñadirEnElAtlas(String pais, String capital) {
        pais = getIntroducirPais();
        capital = getIntroducirCapital();

        atlas.add(new PaisCapital(pais, capital));
    }

    public void MostrarAtlas() {
        for (PaisCapital paisCapital : atlas) {
            System.out.println("\u001B[33mPaís: " + paisCapital.getPais() + ",\u001B[32m Capital: " + paisCapital.getCapital());
        }
        System.out.println("\u001B[35mHay "+atlas.size() + " \u001B[35melementos en el atlas");

    }

    public void BuscarEntradaAtlas() {
        try {
            System.out.print("\u001B[36mIntroduzca el país: ");
            String pais = sc.nextLine();
            boolean encontrado = false;
            for (PaisCapital paisCapital : atlas) {
                if (paisCapital.getPais().equals(pais)) {
                    System.out.println("\u001B[36mLa capital es: " + paisCapital.getCapital());
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                throw new RuntimeException("\u001B[31mEl país no se encuentra en el atlas.");
            }
        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
        }
    }


    public void ModificarAtlas() {
        try {
            System.out.print("\u001B[31mIntroduzca el país: ");
            String pais = sc.nextLine();
            PaisCapital paisCapitalModificado = null;
            for (PaisCapital paisCapital : atlas) {
                if (paisCapital.getPais().equals(pais)) {
                    paisCapitalModificado = paisCapital;
                    break;
                }
            }

            if (paisCapitalModificado == null) {
                throw new RuntimeException("\u001B[31mEl país no se encuentra en el atlas.");
            }

            System.out.print("\u001B[35mIntroduzca la nueva capital para " + pais + ": ");
            String nuevaCapital = sc.nextLine();
            paisCapitalModificado.setCapital(nuevaCapital);

            System.out.println("\u001B[35mLa capital para " + pais + " ha sido modificada en el atlas.");
        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void OrdenarAtlas(){
        Collections.sort(atlas, Comparator.comparing(PaisCapital::getPais));
        for (PaisCapital paisCapital : atlas) {
            System.out.println("\u001B[35mPaís: " + paisCapital.getPais() + ", Capital: " + paisCapital.getCapital());
        }
    }

    public void MostrarContenidoConIterator(){
        Iterator<PaisCapital> iterator = atlas.iterator();
        while (iterator.hasNext()) {
            PaisCapital paisCapital = iterator.next();
            System.out.println("\u001B[32mPaís: " + paisCapital.getPais() + ", \u001B[32mCapital: " + paisCapital.getCapital());
        }
        System.out.println("\u001B[36mHay "+atlas.size() + "\u001B[36m elementos en el atlas");
    }
    public void BorrarEntradaAtlas() {
        try {
            System.out.print("\u001B[31mIntroduzca el país que desea borrar: ");
            String pais = sc.nextLine();
            if (pais.isEmpty()) {
                throw new RuntimeException("\u001B[31mDebe introducir un nombre de país.");
            }
            boolean encontrado = false;
            for (PaisCapital paisCapital : atlas) {
                if (paisCapital.getPais().equals(pais)) {
                    atlas.remove(paisCapital);
                    System.out.println("\u001B[34mLa entrada para " + pais + " ha sido borrada del atlas.");
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                throw new RuntimeException("\u001B[31mEl país no se encuentra en el atlas.");
            }
        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public void BorrarAtlasEntero(){
        atlas.clear();
        System.out.println("\u001B[33mEliminado el Atlas por completo ");
    }

}
