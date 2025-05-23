// Nama     : Rico Aldy Kusuma
// NIM      : 24060123120041
// Tanggal  : 23 Mei 2025
// File     : MysqlMahasiswaService.java
// Deskripsi: Kelas service untuk menjalankan operasi CRUD (Create, Read, Update, Delete)
//            terhadap data mahasiswa di database MySQL menggunakan JDBC.

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.service;

import jdbc.utilities.MysqlUtility;
import jdbc.model.Mahasiswa;
import jdbc.utilities.MysqlUtility;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ricoa
 */
public class MysqlMahasiswaService {
    Connection koneksi = null;
    
    public MysqlMahasiswaService(){
        koneksi = MysqlUtility.getConnection();
    }
    
    public Mahasiswa makeMhsObject(ResultSet rs) throws SQLException {
        Mahasiswa mhs = new Mahasiswa();
        mhs.setId(rs.getInt("id"));
        mhs.setNama(rs.getString("name"));
        return mhs;
    }

    public void add(Mahasiswa mhs) {
        try {
            String sql = "INSERT INTO mahasiswa(nama) VALUES (?)";
            PreparedStatement stmt = koneksi.prepareStatement(sql);
            stmt.setString(1, mhs.getNama());
            stmt.executeUpdate();
            System.out.println("Berhasil insert: " + mhs);
        } catch (SQLException e) {
            System.out.println("Gagal tambah data: " + e.getMessage());
        }
    }

    public void update(Mahasiswa mhs) {
        try {
            String sql = "UPDATE mahasiswa SET nama = ? WHERE id = ?";
            PreparedStatement stmt = koneksi.prepareStatement(sql);
            stmt.setString(1, mhs.getNama());
            stmt.setInt(2, mhs.getId());
            stmt.executeUpdate();
            System.out.println("Berhasil update: " + mhs);
        } catch (SQLException e) {
            System.out.println("Gagal update: " + e.getMessage());
        }
    }

    public void delete(int id) {
        try {
            String sql = "DELETE FROM mahasiswa WHERE id=?";
            PreparedStatement ps = koneksi.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error delete data: " + e.getMessage());
        }
    }

    // Ambil mahasiswa berdasarkan ID
    public Mahasiswa getById(int id) {
        Mahasiswa mhs = null;
        try {
            String sql = "SELECT * FROM mahasiswa WHERE id=?";
            PreparedStatement ps = koneksi.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                mhs = makeMhsObject(rs);
            }
        } catch (SQLException e) {
            System.out.println("Error getById: " + e.getMessage());
        }
        return mhs;
    }

    public List<Mahasiswa> getAll() {
        List<Mahasiswa> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM mahasiswa";
            PreparedStatement stmt = koneksi.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Mahasiswa m = new Mahasiswa();
                m.setId(rs.getInt("id"));
                m.setNama(rs.getString("nama"));
                list.add(m);
            }
        } catch (SQLException e) {
            System.out.println("Gagal ambil data: " + e.getMessage());
        }
        return list;
    }
}
