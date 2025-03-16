// Nama File : MDosenTetap.java
// Deskripsi : Kelas Main DosenTetap yang merupakan turunan dari kelas Pegawai
// Pembuat   : Rico Aldy Kusuma
// NIM       : 24060123120041
// Tanggal   : 16 Maret 2025

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class MDosenTetap {
    public static void main(String[] args) {
        
        DosenTetap dosenTetap = new DosenTetap("24060", "Makoto", 
                        LocalDate.of(1990, 5, 5), 
                        LocalDate.of(2015, 1, 1), 
                        "Dosen Tetap",
                        100000000, "111", "Fakultas Sains dan Matematika");

        DateTimeFormatter format = DateTimeFormatter.ofPattern("d MMMM yyyy", Locale.of("id", "ID"));
        LocalDate bup = dosenTetap.hitungBUP();
        int masaKerjaTahun = Period.between(dosenTetap.getTMT(), LocalDate.now()).getYears();
        int masaKerjaBulan = Period.between(dosenTetap.getTMT(), LocalDate.now()).getMonths() % 12;
        int tunjangan = dosenTetap.TotalTunjangan();

        System.out.println("NIP          : " + dosenTetap.getNIP());
        System.out.println("NIDN         : " + dosenTetap.getNIDN());
        System.out.println("Nama         : " + dosenTetap.getNama());
        System.out.println("Tanggal Lahir: " + dosenTetap.getFormatTTG());
        System.out.println("TMT          : " + dosenTetap.getTMTFormatted());
        System.out.println("Jabatan      : " + dosenTetap.getJabatan());
        System.out.println("Fakultas     : " + dosenTetap.getFakultas());
        System.out.println("Masa Kerja   : " + masaKerjaTahun + " tahun " + masaKerjaBulan + " bulan");
        System.out.println("BUP          : " + bup.format(format));
        System.out.println("Gaji Pokok   : Rp " + String.format("%,d", dosenTetap.getGajiPokok()));
        System.out.println("Tunjangan    : 2% x " + masaKerjaTahun + " x Rp " + String.format("%,d", dosenTetap.getGajiPokok()) + " = Rp " + String.format("%,d", tunjangan));
    }
}
