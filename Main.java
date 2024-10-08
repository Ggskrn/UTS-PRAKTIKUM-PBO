//Gagas Cahya Kamajengan
//3F Informatika
//2310631170018

//UTS PRAKTIKUM PBO

// 4. Polymorphism


import Hotel.Kamar;
import Hotel.Reservasi;
import User.Pelanggan;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Main {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kamar kamar = new Kamar("Armani", 165.0, true);

        System.out.println("SELAMAT DATANG DI WEBSITE THE KAYON JUNGLE HOTEL & RESORT");
        
        System.out.println("Cek ketersediaan (Iya/Tidak):");
        String response = scanner.nextLine();

        if (response.equals("yes") && kamar.Ada()) {
            kamar.bookingKamar();
        } else {
            System.out.println("Kamar tidak tersedia/Invalid.");
        }
    }
}
