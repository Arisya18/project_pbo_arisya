/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArisyaUTS16112022;

/**
 *
 * @author ASUS
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Penjualan_2101091001 {
    public static void main( String[] args ){
         
         Penjualan penjualan1 = new Penjualan();
         
          //student1.setName("Denis");

         penjualan1.setFaktur("01DG567");
         penjualan1.setPelanggan("Denis");
         penjualan1.setKode("2101092013");
         penjualan1.setHarga(10000);
         penjualan1.setJumlah(3);
         
         //System.out.println("Nama        :"+student1.getName());
         System.out.println("No Faktur = "+penjualan1.getFaktur());
         System.out.println("Nama Pelanggan = "+penjualan1.getPelanggan());
         System.out.println("Kode Penjualan = "+penjualan1.getKode());
         System.out.println("Harga = "+penjualan1.getHarga());
         System.out.println("Jumlah Barang = "+penjualan1.getJumlah());
         System.out.println("Total Harga = "+penjualan1.getTotal());
         System.out.println("Diskon = "+penjualan1.getDiskon());
         System.out.println("Total Bayar = "+penjualan1.getBayar());
         
         
         
         
         
         
         
     }
}
