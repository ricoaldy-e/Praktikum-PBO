// Nama File : DosenTamu.java
// Deskripsi : Kelas yang merepresentasikan DosenTamu sebagai turunan dari kelas Pegawai
// Pembuat   : Rico Aldy Kusuma
// NIM       : 24060123120041
// Tanggal   : 16 Maret 2025

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DosenTamu extends Pegawai {
    private String NIDK;
    private LocalDate TglAkhirKontrak;
    private String Fakultas;

    public DosenTamu(String NIP, String Nama, LocalDate TanggalLahir, LocalDate TMT, String Jabatan, int GajiPokok, String NIDK, LocalDate TglAkhirKontrak, String Fakultas) {
        super(NIP, Nama, TanggalLahir, TMT, Jabatan, GajiPokok);
        this.NIDK = NIDK;
        this.TglAkhirKontrak = TglAkhirKontrak;
        this.Fakultas = Fakultas;
    }

    public String getNIDK() {
        return NIDK;
    }

    public LocalDate getTglAkhirKontrak() {
        return TglAkhirKontrak;
    }

    public String getFakultas() {
        return Fakultas;
    }

    @Override
    public int TotalTunjangan() {
        return (int) ((2.5 * getGajiPokok()) / 100);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("d MMMM yyyy", Locale.of("id", "ID"));
        int tunjangan = TotalTunjangan();
        System.out.println("NIDK         : " + NIDK);
        System.out.println("Fakultas     : " + Fakultas);
        System.out.println("TAK          : " + TglAkhirKontrak.format(format));
        System.out.println("Tunjangan    : 2.5% x Rp " + String.format("%,d", getGajiPokok()) + " = Rp " + String.format("%,d", tunjangan));
    }
}
