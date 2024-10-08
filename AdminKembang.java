//Gagas Cahya Kamajengan
//3F Informatika
//2310631170018

//UTS PRAKTIKUM PBO

//Pengembangan terhadap Admin :

/** Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template */
package Pengembangan;

import Hotel.Kamar;
import User.Pelanggan;

/**
 *
 * @author USER
 */
public abstract class Admin extends Pelanggan {
    public Admin(String nama) {
        super(nama);
    }

    // Admin dapat mengelola ketersediaan kamar
    public void kelolaketersediaanKamar(Kamar kamar, boolean buatjadiAda) {
        if (buatjadiAda) {
            kamar.BatalBooking();
            System.out.println("Kamarnya sudah tersedia saat ini.");
        } else {
            kamar.bookingKamar();
            System.out.println("Yaah kamarnya masih belum tersedia :0.");
        }
    }
}
