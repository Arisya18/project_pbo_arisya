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
public class Aritmatika {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int bil, awal, akhir;
        
         System.out.println("PROGRAM JAVA MENAMPILKAN DERET BILANGAN PRIMA");
         System.out.print("Mulai dari : ");
         awal=input.nextInt();
         System.out.print("Sampai : ");
         akhir=input.nextInt();
         System.out.println("----------------------------------------------");
        for (int i=awal; i<=akhir; i++){
            bil=0;
            for (int j=1;j<=i;j++){
                if (i%j==0){
                    bil=bil+1;
                }
            }
            if (bil==2){
                System.out.print(i+" ");
            }             
        }    
   }
}
