package Array;

public class PaisCapital {
    String pais;
    String capital;
    public PaisCapital(String pais, String capital) {
        this.pais=pais;
        this.capital =capital;
    }

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
