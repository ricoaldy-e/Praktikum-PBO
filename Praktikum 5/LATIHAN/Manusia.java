/* Nama File    : Manusia.java */
/* Deskripsi    : Class dasar Manusia berisi atribut dan method yang akan diwariskan ke class lain */
/* Pembuat      : Rico Aldy Kusuma / 24060123120041 */
/* Tanggal      : 24 Maret 2025 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Manusia {
    protected String nama;
    protected LocalDate tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;

    public Manusia(String nama, String tgl_mulai_kerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tgl_mulai_kerja = LocalDate.parse(tgl_mulai_kerja);
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    public static int getCounterMns() {
        return counterMns;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public LocalDate getTgl_mulai_kerja() {
        return tgl_mulai_kerja;
    }

    public void setTgl_mulai_kerja(String tgl_mulai_kerja) {
        this.tgl_mulai_kerja = LocalDate.parse(tgl_mulai_kerja);
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public double getPendapatan() {
        return pendapatan;
    }

    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }

    public abstract int hitungMasaKerja();

    public void cetakInfo() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        System.out.println("Nama                    : " + nama);
        System.out.println("Tanggal Mulai Kerja     : " + tgl_mulai_kerja.format(format));
        System.out.println("Alamat                  : " + alamat);
        System.out.println("Pendapatan              : " + pendapatan);
    }
}
