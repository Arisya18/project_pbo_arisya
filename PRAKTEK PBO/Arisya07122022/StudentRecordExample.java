/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arisya07122022;

/**
 *
 * @author ASUS
 */
public class StudentRecordExample {
    public static void main( String[] args ){
    StudentRecord afrilRecord = new StudentRecord();

    //Memberi nama siswa
    afrilRecord.setName("Afril");

    //Menampilkan nama siswa
    System.out.println(afrilRecord.getName() );

    //Menampilkan jumlah siswa
    System.out.println("Count= "+StudentRecord.getStudentCount());
    }

    class CobaOverride extends StudentRecord {
    @Override
    public String getName(){
    System.out.println("afril juga student loooh....");
    return name;}
    }
}
