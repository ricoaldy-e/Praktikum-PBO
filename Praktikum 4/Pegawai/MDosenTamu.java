// Nama File : MDosenTamu.java
// Deskripsi : Kelas Main DosenTamu yang merupakan turunan dari kelas Pegawai
// Pembuat   : Rico Aldy Kusuma
// NIM       : 24060123120041
// Tanggal   : 16 Maret 2025

import java.time.LocalDate;

public class MDosenTamu {
    public static void main(String[] args) {
        
        DosenTamu dosenTamu = new DosenTamu("24061", "Shinkai", 
                        LocalDate.of(1988, 3, 15), 
                        LocalDate.of(2020, 2, 1), 
                        "Dosen Tamu",
                        10000000, "222", LocalDate.of(2025, 12, 31), "Fakultas Sains dan Matematika");

        dosenTamu.printInfo();
    }
}
