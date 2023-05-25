package Modul4.Praktikum;

import java.util.HashMap;
import java.util.Scanner;

public class Gateway {

    DataPraktikan dataPraktikan = new DataPraktikan();
    private final HashMap<String, String> tabelSesiLogin = new HashMap<>();
    Scanner input = new Scanner(System.in);
    public void login() {
        System.out.print("Masukkan e-Mail: ");
        String tempEmail = input.next();
        System.out.print("Masukkan password: ");
        String tempPass = input.next();

        if (tabelSesiLogin.containsKey(tempEmail) && tabelSesiLogin.get(tempEmail).toString().equals(tempPass)) {
            dataPraktikan.dashboardMenu();
        } else {
            System.out.println("Akun tidak terdaftar");
        }
    }

    public void register() {
        System.out.print("Masukkan e-Mail: ");
        String tempEmail = input.next();
        System.out.print("Masukkan password: ");
        String tempPass = input.next();

        if (!tabelSesiLogin.containsKey(tempEmail)) {
            tabelSesiLogin.put(tempEmail, tempPass);
        } else {
            System.out.println("e-Mail telah terdaftar");
        }
        gatewayPage();
    }

    public void gatewayPage() {
        System.out.println("Sistem Login");
        System.out.println("1. Login");
        System.out.println("2. Daftar akun");
        System.out.print("Pilih menu: ");
        int pilihMenu = input.nextInt();
        switch (pilihMenu) {
            case 1:
                login();
                break;
            case 2:
                register();
                break;
        }
    }


    public static void main(String[] args) {
        Gateway gateway = new Gateway();
        gateway.tabelSesiLogin.put("admin", "admin");
        gateway.gatewayPage();
    }

}