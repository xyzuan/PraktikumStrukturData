package Modul1.Praktikum;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("===HITUNG LUAS SEGITIGA===");
        System.out.println("\n Mau menampilkan hasil luas dalam bentuk? :");
        System.out.println("1. Hasil to Integer\n2. Hasil to Double");
        System.out.print("Masukkan pilihan 1 / 2 : ");
        int pilihMenu = input.nextInt();
        System.out.println("Masukkan Nilai Alas Dan Tinggi Secara Berurutan: ");
        switch (pilihMenu){
            case 1:
                Segitiga<Integer, Integer> luasTipeInt = new Segitiga<>(input.nextInt(), input.nextInt());
                System.out.println("Luas Modul1.Praktikum.Segitiga Dalam Integer : " + luasTipeInt.getResultAsInt());
                break;
            case 2:
                Segitiga<Double, Double> luasTipeDouble = new Segitiga<>(input.nextDouble(), input.nextDouble());
                System.out.println("Luas Modul1.Praktikum.Segitiga Dalam Double : " + luasTipeDouble.getResultAsDouble());
                break;
        }
    }
}
