//Gagas Cahya Kamajengan
//3F Informatika
//2310631170018

//UTS PRAKTIKUM PBO

//Pengembangan terhadap sistem reservasi :

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reservasi;

import Hotel.Admin;
import Hotel.Kamar;
import User.Pelanggan;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class SistemReservasi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inisialisasi kamar
        Kamar kamar1 = new Kamar("Armani", 165.0, true);
        Kamar kamar2 = new Kamar("Basic", 65.0, true);

        // Inisialisasi customer dan admin
        Pelanggan pelanggan = new Pelanggan("John Doe") {
            @Override
            public void inginreservasi() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void cancelReservasi() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
        Admin admin = new Admin("Putri Anjengan Tajimalela") {
            @Override
            public void cancelReservasi() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };

        while (true) {
            System.out.println("Sistem Reservasi Hotel");
            System.out.println("1. Pesan Kamar");
            System.out.println("2. Batalkan pesanan");
            System.out.println("3. Lihat rincian pesanan");
            System.out.println("4. Admin : Mengelola Ketersediaan Kamar");
            System.out.println("5. Exit");
            System.out.print("Pilih beberapa opsi : ");
            int pilih = scanner.nextInt();

            switch (pilih) {
                case 1 -> {
                    System.out.println("Pilih salah satu untuk dibaca (1 = Armani, 2 = Basic)");
                    int pilihKamar = scanner.nextInt();
                    switch (pilihKamar) {
                        case 1 -> pelanggan.bookingKamar(kamar1);
                        case 2 -> pelanggan.bookingKamar(kamar2);
                        default -> System.out.println("Pilihan kamar tidak valid.");
                    }
                }

                case 2 -> pelanggan.cancelBooking();
                case 3 -> pelanggan.viewBookingDetails();
                case 4 -> {
                    System.out.println("Admin: Kamar mana yang ingin Anda kelola? (1 untuk Armani, 2 untuk Basic)");
                    int pilihanAdminKamar = scanner.nextInt();
                    Kamar kamarUntukDikelola = (pilihanAdminKamar == 1) ? kamar1 : kamar2;
                    System.out.println("Apakah kamar tersedia? (yes/no)");
                    boolean ada = scanner.next().equalsIgnoreCase("yes");
                    admin.kelolaKetersediaanKamar(kamarUntukDikelola, ada);
                }
                case 5 -> {
                    System.out.println("Keluar dari sistem.");
                    return;
                }
                default -> System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
