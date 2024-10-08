//Gagas Cahya Kamajengan
//3F Informatika
//2310631170018

//UTS PRAKTIKUM PBO

//5. Input dan Branching

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

import Hotel.Kamar;
import Hotel.Reservasi;

/**
 *
 * @author USER
 */
public abstract class Pelanggan implements Reservasi{
    private String nama;

    public Pelanggan(String nama) {
        this.nama = nama;
    }

    public void inginReservasi() {
        System.out.println(nama + " sudah melakukan reservasi kamar.");
    }

    public void Reservasibatal() {
        System.out.println(nama + " sudah membatalkan reservasi kamar.");
    }

    public void cancelBooking() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void viewBookingDetails() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void bookingKamar(Kamar kamar2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
