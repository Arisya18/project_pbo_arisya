/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arisya.dao;
import Arisya.model.Peminjaman;
import java.util.List;
import Arisya.dao.AnggotaDao;
import Arisya.dao.buku.BukuDao;
/**
 *
 * @author ASUS
 */
public interface PeminjamanDao {
    Peminjaman save (Peminjaman peminjaman);
    Peminjaman update (int index,Peminjaman peminjaman);
    Peminjaman delete (int index);
    Peminjaman getPeminjaman (int index);
    List <Peminjaman> getAllPeminjaman ();
}