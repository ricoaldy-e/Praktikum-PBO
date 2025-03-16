// Nama File : MTendik.java
// Deskripsi : Kelas Main Tendik yang merupakan turunan dari kelas Pegawai
// Pembuat   : Rico Aldy Kusuma
// NIM       : 24060123120041
// Tanggal   : 16 Maret 2025

import java.time.LocalDate;

public class MTendik {
    public static void main(String[] args) {
        
        Tendik tendik = new Tendik("001", "Udin", 
                        LocalDate.of(1988, 8, 20), 
                        LocalDate.of(2000, 5, 1), 
                        "Tendik",
                        6000000, "Akademik");

        tendik.printInfo();
    }
}
