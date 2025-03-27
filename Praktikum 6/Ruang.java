/* Nama File    : Ruang.java */
/* Deskripsi    : Class Ruang merupakan superclass yang merepresentasikan ruangan dengan atribut umum */
/* Pembuat      : Rico Aldy Kusuma / 24060123120041 */
/* Tanggal      : 27 Maret 2025 */

public class Ruang {
    protected String kode;
    protected double panjang, lebar, tinggi;
    protected int kapasitas;
    protected double tarifKebersihan;

    public static int totalRuangan = 0;

    public Ruang(String kode, double panjang, double lebar, double tinggi, int kapasitas, double tarifKebersihan) {
        this.kode = kode;
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        this.kapasitas = kapasitas;
        this.tarifKebersihan = tarifKebersihan;
        totalRuangan++; 
    }

    public double hitungBiayaKebersihan() {
        return panjang * lebar * tarifKebersihan;
    }

    public void tampilkanInfo() {
        System.out.println("Kode Ruang          : " + kode);
        System.out.println("Dimensi (P x L x T) : " + panjang + " x " + lebar + " x " + tinggi);
        System.out.println("Kapasitas           : " + kapasitas);
        System.out.println("Biaya Kebersihan    : Rp " + hitungBiayaKebersihan());
    }
}
