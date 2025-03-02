/* Nama File    : MMahasiswa.java */
/* Deskripsi    : berisi program utama untuk memanggil penggunaan fungsi class Mahasiswa */
/* Pembuat      : Rico Aldy Kusuma / 24060123120041 */
/* Tanggal      : 27 Ferbuari 2025 */

import java.util.ArrayList;

public class MMahasiswa {
    public static void main(String[] args) {
        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
        MataKuliah MBD = new MataKuliah("MBD", "Manajeman Basis Data", 3);
        ArrayList<MataKuliah> listMatkul = new ArrayList<>();
        Dosen D1 = new Dosen("123", "Windah", "Informatika");
        Kendaraan K1 = new Kendaraan("AA123QY", "Motor");
        Mahasiswa M1 = new Mahasiswa("077", "Dappa", "Informatika", listMatkul, D1, K1);

        M1.AddMatkul(PBO);
        M1.AddMatkul(MBD);
        
        System.out.println("=== Detail Mahasiswa ===");
        M1.printDetailMhs();
        System.out.println("Jumlah Mata Kuliah: " + M1.getJumlahMatkul());
        System.out.println("Jumlah SKS Mata Kuliah: " + M1.getJumlahSKS());
    }
}
