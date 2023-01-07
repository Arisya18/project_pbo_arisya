/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arisya19102022;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class Latihan1_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int grade;
        
        System.out.print("Masukkan Nilai Anda : ");
        grade = in.nextInt();
        
        if (grade >= 90){
            System.out.println("Excellent!");
        }
        else if ((grade < 90) && (grade >= 80)){
            System.out.println("Good Job!");
        }
        else if ((grade < 80) && (grade >= 60)){
            System.out.println("Study harder!");
        }
        else{
            System.out.println("Sorry, you failed!");
        }
    }
}
