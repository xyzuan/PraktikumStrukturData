package Modul2.Praktikum.Kegiatan2;

public class Main {
    public static void main(String[] args) {
        LinkNode myLink = new LinkNode();

        myLink.add(0);
        myLink.add(7);
        myLink.add(1);
        myLink.add(4);
        myLink.add(6);
        myLink.add(2);
        myLink.add(3);

        System.out.print("\nBefore : ");
        myLink.showData(myLink.head);

        System.out.print("\nAfter : ");
        myLink.sortData(myLink.head);
        myLink.showData(myLink.head);

    }
}
