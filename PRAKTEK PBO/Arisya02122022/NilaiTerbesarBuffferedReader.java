/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arisya02122022;

/**
 *
 * @author ASUS
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class NilaiTerbesarBuffferedReader {
    public static void main(String[]args)
    {
        BufferedReader masukan = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[11];
        int terbesar = 0;
        for(int i=1;i+1<=a.length;i++)
        {
            System.out.println("Masukkan angka "+i+" :");
            try
            {
                a[i] = Integer.parseInt(masukan.readLine());
            }
            catch( IOException e)
            {
                
            }
            if(terbesar>a[i])
            {
                if(terbesar>a[i])
                {
                terbesar=terbesar;
                }
            }
            else
            {
                if(a[i]>a[i-1])
                {
                terbesar=a[i];
                }
                else
                {
                terbesar=a[i-1];
                }
            }
        }
        String hasil="Terbesar adalah "+terbesar;
        System.out.println(hasil);            
    }
}
