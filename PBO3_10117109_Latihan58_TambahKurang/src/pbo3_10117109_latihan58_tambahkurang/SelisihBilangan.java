/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117109_latihan58_tambahkurang;

/**
 * Nama  : Stefanus Saputra
 * NIM   : 10117109
 * Kelas : IF 3
 * Deskripsi Program : program ini berisi program untuk menampilkan hasil 
* penjumlahan dan hasil selisih dengan inputan yg sudah ditentukan dengan konsep
* inheritance
 */
public class SelisihBilangan extends Bilangan {
    
    public void tampilHasilSelisih() {
        int z = getX() - getY();
        System.out.println("Hasil selisih " + getX() + " - " + getY() + " = " + z);
    }
}
