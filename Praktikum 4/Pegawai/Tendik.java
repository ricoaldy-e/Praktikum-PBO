// Nama File : Tendik.java
// Deskripsi : Kelas yang merepresentasikan Tendik(Tenaga Kependidikan) sebagai turunan dari kelas Pegawai
// Pembuat   : Rico Aldy Kusuma
// NIM       : 24060123120041
// Tanggal   : 16 Maret 2025

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Tendik extends Pegawai {
    private String Bidang;

    public Tendik(String NIP, String Nama, LocalDate TanggalLahir, LocalDate TMT, String Jabatan, int GajiPokok, String Bidang) {
        super(NIP, Nama, TanggalLahir, TMT, Jabatan, GajiPokok);
        this.Bidang = Bidang;
    }

    public String getBidang() {
        return Bidang;
    }

    @Override
    public int TotalTunjangan() {
        return (getGajiPokok() * Period.between(getTMT(), LocalDate.now()).getYears()) / 100;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("d MMMM yyyy", Locale.of("id", "ID"));
        LocalDate bup = getTanggalLahir().plusYears(55).withDayOfMonth(1).plusMonths(1);
        int tunjangan = TotalTunjangan();
        System.out.println("Bidang       : " + Bidang);
        System.out.println("BUP          : " + bup.format(format));
        System.out.println("Tunjangan    : 1% x " + Period.between(getTMT(), LocalDate.now()).getYears() + " x Rp " + String.format("%,d", getGajiPokok()) + " = Rp " + String.format("%,d", tunjangan));
    }
}
