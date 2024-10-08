//Gagas Cahya Kamajengan
//3F Informatika
//2310631170018

//UTS PRAKTIKUM PBO

//3. Packages, Encapsulation dan Inheritance

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel;

import User.Pelanggan;

/**
 *
 * @author USER
 */
public abstract class Admin extends Pelanggan {
    public Admin(String nama) {
        super(nama);
    }

    public void kelolaKamar() {
        System.out.println("Sedang mengelola kamar...");
    }

    @Override
    public void inginreservasi() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void Reservasibatal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
