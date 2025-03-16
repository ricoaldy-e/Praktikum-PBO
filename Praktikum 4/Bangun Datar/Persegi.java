/* Nama File    : Persegi.java */
/* Deskripsi    : berisi atribut dan method dalam class Persegi */
/* Pembuat      : Rico Aldy Kusuma / 24060123120041 */
/* Tanggal      : 13 Maret 2025 */

public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi() {
        setJmlSisi(4);
    }

    public Persegi(double sisi, String warna, String border) {
        this.jmlSisi = 4;
        this.warna = warna;
        this.border = border;
        this.sisi = sisi;
    }

    // Pertanyaan 2: Modifikasilah atribut class BangunDatar dengan access modifier protected.
    // Setelah modifikasi tersebut, apakah konstruktor berparameter pada kelas Persegi dapat direalisasikan seperti berikut? Mengapa?
    // public Persegi(double sisi, String warna, String border) {
    //     this.jmlSisi = 4;
    //     this.warna = warna;
    //     this.border = border;
    //     this.sisi = sisi;
    // }
    // Jawaban: Bisa, karena kalau access modifier pada semua atribut superclass BangunDatar diubah menjadi protected,
    // konstruktor berparameter pada subclass Persegi dapat menggunakannya karena Persegi.java merupakan subclassnya.

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getLuas() {
        return sisi * sisi;
    }

    public double getKeliling() {
        return 4 * sisi;
    }

    public double getDiagonal() {
        return sisi * Math.sqrt(2);
    }

    @Override
    public void printInfo() {
        super.printInfo(); // Menampilkan informasi dari kelas induk
        System.out.println("Sisi: " + sisi);
    }

    // Pertanyaan: Apakah konstruktor berparameter pada kelas Persegi dapat direalisasikan seperti berikut? Mengapa?
    // public Persegi(double sisi, String warna, String border){
    //     this.jmlSisi = 4;
    //     this.warna = warna;
    //     this.border = border;
    //     this.sisi = sisi;
    // }
    // Jawaban: Konstruktor berparameter pada kelas Persegi tidak dapat direalisasikan seperti itu
    // karena atribut jmlSisi, warna, border, dan sisi belum dideklarasikan dalam kelas Persegi atau belum diwarisi dari superclass (BangunDatar).
    // Alasan: 
    // 1. Tidak ada deklarasi atribut dalam kelas, Jika jmlSisi, warna, border, dan sisi tidak dideklarasikan dalam kelas Persegi,
    //    maka akan terjadi error karena atribut tersebut tidak dikenali.
    // 2. Atribut berasal dari superclass (BangunDatar), Karena atribut-atribut tersebut berada dalam BangunDatar dan memiliki akses modifier private,
    //    maka Persegi tidak dapat langsung mengaksesnya. Sebagai solusinya, sebaiknya menggunakan keyword super untuk
    //    menginisialisasi atribut yang diwarisi dari BangunDatar.
}
