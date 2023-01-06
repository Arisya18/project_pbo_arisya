/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arisya.dao;
import Arisya.model.Mahasiswa;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author ASUS
 */
public class MahasiswaDaoImpl implements MahasiswaDao{
    List<Mahasiswa> data = new ArrayList <>();
    
    @Override
    public Mahasiswa save(Mahasiswa mahasiswa){
        data.add(mahasiswa);
        return mahasiswa;
    }
    
    public  Mahasiswa update(int index,Mahasiswa mahasiswa){
        data.set(index ,mahasiswa);
        return mahasiswa;
    }
    
    public boolean delete(Mahasiswa mahasiswa){
        return data.remove(mahasiswa);
    }
    
    public Mahasiswa getMahasiswa(int index){
         return data.get(index);
    }
    
    public  List<Mahasiswa> getAllMahasiswa(){
        return data;
    }
}
