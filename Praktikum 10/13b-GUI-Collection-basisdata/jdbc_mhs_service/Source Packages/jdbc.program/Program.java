// Nama     : Rico Aldy Kusuma
// NIM      : 24060123120041
// Tanggal  : 23 Mei 2025
// File     : Program.java
// Deskripsi: Program utama untuk menguji operasi CRUD pada entitas Mahasiswa menggunakan MysqlMahasiswaService.

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.program;

import java.util.ArrayList;
import java.util.List;
import jdbc.model.Mahasiswa;
import jdbc.service.MysqlMahasiswaService;

/**
 *
 * @author ricoa
 */
public class Program {
    static MysqlMahasiswaService service = new MysqlMahasiswaService();
    
    public static void main(String[] args) {
        List<Mahasiswa> listmhs = new ArrayList<>();
        
        System.out.println("");
        
        System.out.println("===Insert");
        Mahasiswa addMahasiswa = new Mahasiswa(4, "Ujang Spakbor");
        service.add(addMahasiswa);
        System.out.println("berhasil insert" + addMahasiswa);
    }
}
