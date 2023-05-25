package Modul4.Praktikum.model;

public class Mahasiswa {
    private String namaAsisten;
    private String email;

    public Mahasiswa(String namaAsisten, String email){
        this.setNamaAsisten(namaAsisten);
        this.setEmail(email);
    }
    public String getNamaAsisten() {
        return namaAsisten;
    }

    public void setNamaAsisten(String namaAsisten) {
        this.namaAsisten = namaAsisten;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
