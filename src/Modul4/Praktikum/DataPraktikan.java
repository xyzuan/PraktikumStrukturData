package Modul4.Praktikum;

import Modul4.Praktikum.model.Mahasiswa;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class DataPraktikan {
    private final HashMap<String, Mahasiswa> tabelData = new HashMap<>();
    private final Scanner input = new Scanner(System.in);
    public void dashboardMenu() {
        System.out.println("==========================");
        System.out.println("Program Data Praktikan");
        System.out.println("==========================");
        System.out.println("1. Tambah Data");
        System.out.println("2. Tampilkan Data");
        System.out.println("3. List NIM Praktikan");
        System.out.println("4. List Nama Asisten");
        System.out.println("5. Total Email");
        System.out.println("6. Hapus Data");
        System.out.println("7. Edit Data");
        System.out.println("0. logout");
        System.out.print("Pilih menu: ");
        int pilihan = input.nextInt();
        input.nextLine();

        switch (pilihan) {
            case 1 -> {
                System.out.println("==========================");
                System.out.println("Tambah Data Praktikan");
                System.out.println("=====================");
                String nim;
                String namaAsisten;
                String email;

                while (true) {
                    System.out.print("Masukkan NIM (dimulai dengan IF): ");
                    nim = input.nextLine();
                    if (!nim.startsWith("IF")) {
                        System.out.println("NIM harus dimulai dengan IF. Silakan coba lagi.");
                    } else if (tabelData.containsKey(nim)) {
                        System.out.println("NIM sudah terdaftar. Silakan coba lagi.");
                    } else {
                        break;
                    }
                }

                while (true) {
                    System.out.print("Masukkan Nama Asisten: ");
                    namaAsisten = input.nextLine();
                    if (namaAsisten.isEmpty()) {
                        System.out.println("Nama tidak boleh kosong. Silakan coba lagi.");
                    } else {
                        break;
                    }
                }

                while (true) {
                    System.out.print("Masukkan Email (opsional, harus menggunakan @umm.ac.id): ");
                    email = input.nextLine();
                    if (!email.isEmpty() && !email.endsWith("@umm.ac.id")) {
                        System.out.println("Email harus menggunakan @umm.ac.id. Silakan coba lagi.");
                    } else {
                        break;
                    }
                }

                if (tambahData(nim, namaAsisten, email)){
                    System.out.println("Data berhasil ditambahkan.");
                    System.out.println("==========================");
                } else {
                    System.out.println("Data gagal ditambahkan.");
                    System.out.println("==========================");
                }

            }
            case 2 -> tampil();
            case 3 -> listNimPraktikan();
            case 4 -> listNamaAsisten();
            case 5 -> {
                System.out.println("==========================");
                System.out.println("Total Email Praktikan");
                System.out.println("==========================");
                System.out.println("Jumlah Email Praktikan yang menggunakan Email: " + totalEmail());
                System.out.println("==========================");
            }
            case 6 -> hapusData();
            case 7 -> editData();
            case 0 -> {
                System.out.println("Logout berhasil.");
                System.exit(0);
            }
            default -> System.out.println("Pilihan tidak valid. Silakan coba lagi.");
        }
        System.out.print("Tekan enter untuk kembali ke dashboard...");
        input.nextLine();
        dashboardMenu();
    }


    private boolean tambahData(String nimPraktikan, String namaAsisten, String email) {
        tabelData.put(nimPraktikan, new Mahasiswa(namaAsisten, email));
        return true;
    }

    private void tampil() {
        System.out.println("=====================================================");
        System.out.println("|                  Data Praktikan                    |");
        System.out.println("=====================================================");
        System.out.println("|      NIM     |    Nama Asisten   |      Email      |");
        System.out.println("=====================================================");

        for (String nim : tabelData.keySet()) {
            Mahasiswa dataPraktikan = tabelData.get(nim);
            System.out.printf("| %-13s| %-18s| %-17s|\n", nim, dataPraktikan.getNamaAsisten(), dataPraktikan.getEmail());
        }
        System.out.println("=====================================================");
    }


    private void listNimPraktikan() {
        System.out.println("==========================");
        System.out.println("List NIM Praktikan");
        System.out.println("==========================");
        for (String nim : tabelData.keySet()) {
            System.out.println(nim);
            System.out.println("==========================");
        }
    }

    private void listNamaAsisten() {
        System.out.println("==========================");
        System.out.println("Daftar Nama Asisten");
        System.out.println("==========================");

        Set<String> keys = tabelData.keySet();
        for (String key : keys) {
            Mahasiswa dataMahasiswa = tabelData.get(key);
            String nama = dataMahasiswa.getNamaAsisten();
            System.out.println(nama);
            System.out.println("==========================");
        }
    }

    private int totalEmail() {
        int total = 0;
        Set<String> keys = tabelData.keySet();
        for (String key : keys) {
            Mahasiswa dataMahasiswa = tabelData.get(key);
            String email = dataMahasiswa.getEmail();
            if (email.endsWith("@umm.ac.id")) {
                total++;
            }
        }
        return total;
    }

    private void hapusData() {
        System.out.println("==========================");
        System.out.println("Hapus Data Praktikan");
        System.out.println("==========================");
        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();
        if (tabelData.containsKey(nim)) {
            tabelData.remove(nim);
            System.out.println("Data berhasil dihapus.");
            System.out.println("==========================");
        } else {
            System.out.println("Data dengan NIM " + nim + " tidak ditemukan.");
            System.out.println("==========================");
        }
    }

    private void editData() {
        System.out.println("Edit Data Praktikan");
        System.out.println("===================");
        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();
        if (tabelData.containsKey(nim)) {
            Mahasiswa dataMahasiswa = tabelData.get(nim);
            String namaAsistenBaru, emailBaru;

            while (true) {
                System.out.print("Masukkan Nama Asisten Baru (" + dataMahasiswa.getNamaAsisten() + "): ");
                namaAsistenBaru = input.nextLine();
                if (namaAsistenBaru.isEmpty()) {
                    System.out.println("Nama tidak boleh kosong. Silakan coba lagi.");
                } else {
                    break;
                }
            }

            while (true) {
                System.out.print("Masukkan Email Baru (" + dataMahasiswa.getEmail() + "): ");
                emailBaru = input.nextLine();
                if (!emailBaru.isEmpty() && !emailBaru.endsWith("@umm.ac.id")) {
                    System.out.println("Email harus menggunakan domain @umm.ac.id, silakan coba lagi.");
                } else {
                    break;
                }
            }
            tabelData.put(nim, new Mahasiswa(namaAsistenBaru, emailBaru));
            System.out.println("Data berhasil diubah.");
            System.out.println("==========================");
        } else {
            System.out.println("Data dengan NIM " + nim + " tidak ditemukan.");
            System.out.println("==========================");
        }
    }
}
