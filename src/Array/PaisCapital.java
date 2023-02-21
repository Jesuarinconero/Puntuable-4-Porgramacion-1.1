package Array;

public class PaisCapital {
    /*Variable*/
    String pais;
    String capital;
    /*Contructor*/
    public PaisCapital(String pais, String capital) {
        this.pais=pais;
        this.capital =capital;
    }
    /*Metodos para obtener paises capital y cambiar la capital*/

    public String getPais() {
        return pais;
    }
    public  String getCapital(){
        return capital;
    }
    public String setCapital(String nuevaCapital){
       return this.capital=nuevaCapital;
    }

}
