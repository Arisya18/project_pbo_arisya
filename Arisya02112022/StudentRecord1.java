/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arisya02112022;

/**
 *
 * @author ASUS
 */
public class StudentRecord1 {
    public static void main(String[] args) {
         StudentRecord student3 = new StudentRecord ("Idlal Syuja' Nizhamul","Padang",20);
         student3.setAge(20);
         student3.print("");
         StudentRecord student4 = new  StudentRecord();
         student4.print("");
         System.out.println("Jumlah siswa =" + student3.getStudentCount());
    }
   
}
