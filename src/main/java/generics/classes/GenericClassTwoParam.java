package generics.classes;

public class GenericClassTwoParam<S,U> {

    private S anahtar; // String, Double

    private U deger; //Integer, Double

    public GenericClassTwoParam(S anahtar, U deger) {
        this.anahtar = anahtar;
        this.deger = deger;
    }

    //getter-setter


    public S getAnahtar() {
        return anahtar;
    }

    public void setAnahtar(S anahtar) {
        this.anahtar = anahtar;
    }

    public U getDeger() {
        return deger;
    }

    public void setDeger(U deger) {
        this.deger = deger;
    }
}
