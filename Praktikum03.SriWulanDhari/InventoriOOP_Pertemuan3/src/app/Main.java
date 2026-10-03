/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.ArrayList;
import java.util.List;
import model.Barang;

public class Main {
    public static void main(String[] args) {
        Barang keyboard = new Barang("BRG-001", "Keyboard USD", 10);
        Barang mouse = new barang("BRG-002", "Mouse USB", 8);
        
        List<Barang> daftarBarang = new ArrayList<Barang>();
        daftarBarang.add(keyboard);
        daftarBarang.add(mouse);
        
        System.out.println("DATA AWAL");
        tampilkan(daftarBarang);
        
        keyboard.pinjam(3);
        keyboard.kembalikan(2);
        
        System.out.println("SETELAH TRANSAKSI CONTOH");
    }
    
}
