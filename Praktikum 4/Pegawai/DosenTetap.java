// Nama File : DosenTetap.java
// Deskripsi : Kelas yang merepresentasikan DosenTetap sebagai turunan dari kelas Pegawai
// Pembuat   : Rico Aldy Kusuma
// NIM       : 24060123120041
// Tanggal   : 16 Maret 2025

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DosenTetap extends Pegawai {
    private String NIDN;
    private String Fakultas;

    public DosenTetap(String NIP, String Nama, LocalDate TanggalLahir, LocalDate TMT, String Jabatan, int GajiPokok, String NIDN, String Fakultas) {
        super(NIP, Nama, TanggalLahir, TMT, Jabatan, GajiPokok);
        this.NIDN = NIDN;
        this.Fakultas = Fakultas;
    }

    public String getNIDN() {
        return NIDN;
    }

    public String getFakultas() {
        return Fakultas;
    }

    @Override
    public int TotalTunjangan() {
        return (2 * Period.between(getTMT(), LocalDate.now()).getYears() * getGajiPokok()) / 100;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("d MMMM yyyy", Locale.of("id", "ID"));
        LocalDate bup = hitungBUP();
        int masaKerjaTahun = Period.between(getTMT(), LocalDate.now()).getYears();
        int masaKerjaBulan = Period.between(getTMT(), LocalDate.now()).getMonths() % 12;
        int tunjangan = TotalTunjangan();
        System.out.println("NIDN         : " + NIDN);
        System.out.println("Fakultas     : " + Fakultas);
        System.out.println("Masa Kerja   : " + masaKerjaTahun + " tahun " + masaKerjaBulan + " bulan");
        System.out.println("BUP          : " + bup.format(format));
        System.out.println("Tunjangan    : 2% x " + masaKerjaTahun + " x Rp " + String.format("%,d", getGajiPokok()) + " = Rp " + String.format("%,d", tunjangan));
    }
}
