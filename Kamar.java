//Gagas Cahya Kamajengan
//3F Informatika
//2310631170018

//UTS PRAKTIKUM PBO

//1. Class, Object, Variable dan Method 

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel;

/**
 *
 * @author USER
 */
public class Kamar {
    private String Tipekamar;
    private double harga;
    private boolean ketersediaan;

    public Kamar(String Tipekamar, double harga, boolean ketersediaaan) {
        this.Tipekamar = Tipekamar;
        this.harga = harga;
        this.ketersediaan = ketersediaan;
    }

    public boolean Ada() {
        return ketersediaan;
    }

    public void bookingKamar() {
        if (ketersediaan) {
            ketersediaan = false;
            System.out.println("Room booked successfully!");
        } else {
            System.out.println("Room is not available.");
        }
    }

    public void BatalBooking() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
