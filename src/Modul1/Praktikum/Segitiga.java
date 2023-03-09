package Modul1.Praktikum;

public class Segitiga<A,T>{

    private A alas;
    private T tinggi;

    public Segitiga(A alas, T tinggi){
        setAlas(alas);
        setTinggi(tinggi);
    }

    public A getAlas() {
        return alas;
    }

    public void setAlas(A alas) {
        this.alas = alas;
    }

    public T getTinggi() {
        return tinggi;
    }

    public void setTinggi(T tinggi) {
        this.tinggi = tinggi;
    }

    public int getResultAsInt(){
        return 1 * (int)getAlas() * (int)getTinggi() / 2;
    }

    public double getResultAsDouble(){
        return 0.5 * (double)getAlas() * (double)getTinggi();
    }
}


