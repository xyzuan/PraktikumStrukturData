package Modul3.Praktikum.Kegiatan1;

import java.util.Scanner;

public class Kegiatan1 {

    static Scanner in = new Scanner(System.in);

    static public String reverse(String str){
        Tumpuk stack = new Tumpuk(99);

        char[] ch = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            stack.push(ch[i]);
        }

        int k = 0;

        while (!stack.isEmpty()){
            ch[k++] = stack.pop();
        }

        return String.copyValueOf(ch);
    }

    public static void main(String[] args) {
        System.out.print("Masukkan input: ");
        System.out.println("Reversed : " + reverse(in.nextLine()));
    }

}
