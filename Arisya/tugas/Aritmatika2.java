/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arisya.tugas;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Aritmatika2 {
     public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int awal, akhir,bil;
        System.out.println("PROGRAM MENENTUKAN BILANGAN HANJIL & GENAP");
        System.out.print("Mulai dari : ");
        awal=input.nextInt();
        System.out.print("Sampai : ");
        akhir=input.nextInt();
        System.out.println("----------------------------------------------");
        
        for (int i=awal; i<=akhir; i++){
        bil=akhir-awal;
            for (int j=1;j<=i;j++){
                if (bil%2==0){
                     System.out.println("Bilangan "+bil+" adalah bilangan genap");
                }else {
             System.out.println("Bilangan "+bil+" adalah bilangan ganjil");
            }
            }
               
        }   
        
    
  }
  
}
