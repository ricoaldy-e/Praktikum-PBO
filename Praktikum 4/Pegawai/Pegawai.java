// Nama File : Pegawai.java
// Deskripsi : Kelas yang merepresentasikan pegawai dengan atribut dasar yang dimiliki oleh setiap pegawai
// Pembuat   : Rico Aldy Kusuma
// NIM       : 24060123120041
// Tanggal   : 16 Maret 2025

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public abstract class Pegawai {
    private String NIP;
    private String Nama;
    private LocalDate TanggalLahir;
    private LocalDate TMT;
    private String Jabatan;
    private int GajiPokok;

    // Format untuk tanggal seperti format "5 Mei 1990"
    private static final DateTimeFormatter format = 
        DateTimeFormatter.ofPattern("d MMMM yyyy", Locale.of("id", "ID"));

    // Konstruktor
    public Pegawai(String NIP, String Nama, LocalDate TanggalLahir, LocalDate TMT, String Jabatan, int GajiPokok) {
        this.NIP = NIP;
        this.Nama = Nama;
        this.TanggalLahir = TanggalLahir;
        this.TMT = TMT;
        this.Jabatan = Jabatan;
        this.GajiPokok = GajiPokok;
    }

    public int hitungUsia() {
        return Period.between(this.TanggalLahir, LocalDate.now()).getYears();
    }

    // Getter
    public String getNIP() {
        return this.NIP;
    }

    public String getNama() {
        return this.Nama;
    }

    public LocalDate getTanggalLahir() {
        return this.TanggalLahir;
    }

    public String getFormatTTG() {
        return this.TanggalLahir.format(format);
    }

    public LocalDate getTMT() { 
        return this.TMT;
    }

    public String getTMTFormatted() {
        return this.TMT.format(format);
    }

    public int getGajiPokok() {
        return this.GajiPokok;
    }

    public String getJabatan() {
        return this.Jabatan;
    }

    // Setter
    public void setJabatan(String Jabatan){
        this.Jabatan = Jabatan;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void setTanggalLahir(String TanggalLahir) {
        this.TanggalLahir = LocalDate.parse(TanggalLahir, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    public void setTMT(String TMT) { 
        this.TMT = LocalDate.parse(TMT, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    public void setGajiPokok(int GajiPokok) {
        this.GajiPokok = GajiPokok;
    }

    public String hitungMasaKerja() {
        Period selisih = Period.between(getTMT(), LocalDate.now());
        int Tahun = selisih.getYears();
        int Bulan = selisih.getMonths();
        return Tahun + " tahun " + Bulan + " bulan";
    }

    public LocalDate hitungBUP() {
        return getTanggalLahir().plusYears(65).withDayOfMonth(1).plusMonths(1);
    }

    public String BUP(){
        LocalDate tanggalBUP = hitungBUP();
        String Bulan = tanggalBUP.getMonth().getDisplayName(TextStyle.FULL, Locale.of("id", "ID"));
        return tanggalBUP.getDayOfMonth() + " " + Bulan + " " + tanggalBUP.getYear();
    }

    public abstract int TotalTunjangan();

    public void printInfo() {
        System.out.println("NIP          : " + NIP);
        System.out.println("Nama         : " + Nama);
        System.out.println("Tanggal Lahir: " + getFormatTTG());
        System.out.println("TMT          : " + getTMTFormatted());
        System.out.println("Jabatan      : " + Jabatan);
        System.out.println("Gaji Pokok   : Rp " + String.format("%,d", GajiPokok));
        System.out.println("Usia         : " + hitungUsia() + " tahun");
        System.out.println("Masa Kerja   : " + hitungMasaKerja());
    }
}
