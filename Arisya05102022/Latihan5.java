/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arisya05102022;

/**
 *
 * @author ASUS
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;
public class Latihan5 {
        public static void main( String[] args ){
    String word1 = "";
    String word2 = "";
    word1 = JOptionPane.showInputDialog("Input word 1 ");
    word2 = JOptionPane.showInputDialog("Input word 2 ");
    String msg = word1 + " " + word2;
    JOptionPane.showMessageDialog(null, msg);

 }
}
