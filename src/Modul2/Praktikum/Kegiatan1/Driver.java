package Modul2.Praktikum.Kegiatan1;

import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        ArrayList<String> hewan = new ArrayList<>();

        hewan.add(0, "Angsa");
        hewan.add(1, "Bebek");
        hewan.add(2, "Cicak");
        hewan.add(3, "Domba");
        hewan.add(4, "Elang");
        hewan.add(4, "Gajah");

        System.out.println(hewan);

        hewan.add("Badak");
        hewan.add("Bebek");

        System.out.println(hewan);
        int jumlahBebek = 0;
        System.out.print("Posisi index Bebek : ");
        for (int i = 0; i < hewan.size(); i++){
            if (hewan.get(i).equals("Bebek")){
                System.out.print(i + ", ");
                jumlahBebek++;
            }
        }
        System.out.println("\nBebek = " + jumlahBebek);
        hewan.remove("Bebek");
        System.out.println("Index ke-0: " + hewan.get(0));
        System.out.println("Index ke-2: " + hewan.get(2));
        hewan.remove(0);
        System.out.println(hewan);
        hewan.set(0, "Ular");
        hewan.add(2, "Itik");
        System.out.println(hewan);
    }
}
