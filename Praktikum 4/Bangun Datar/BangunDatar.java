/* Nama File    : BangunDatar.java */
/* Deskripsi    : berisi atribut dan method dalam class BangunDatar */
/* Pembuat      : Rico Aldy Kusuma / 24060123120041 */
/* Tanggal      : 13 Maret 2025 */

public class BangunDatar {
    protected int jmlSisi;
    protected String warna;
    protected String border;
    protected static int counterBangunDatar = 0;

    public BangunDatar() {
        counterBangunDatar++;
    }

    public BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    public int getJmlSisi() {
        return jmlSisi;
    }

    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getBorder() {
        return border;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    public void printInfo() {
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }

    public static void printCounterBangunDatar() {
        System.out.println("Jumlah Objek Bangun Datar: " + counterBangunDatar);
    }

    // Pertanyaan 1: Coba lakukan overriding pada method printCounterBangunDatar(). Bagaimana hasilnya?
    // Jawaban: Karena printCounterBangunDatar() adalah method static, maka konsep overriding tidak berlaku pada method ini.
    // Method static tidak dapat dioverride karena method static bersifat class-level.

    // Pertanyaan 3: Tambahkan keyword final pada kelas BangunDatar. Bagaimana pengaruhnya terhadap kelas Persegi dan Lingkaran?
    // Jawaban: Jika pada superclass BangunDatar ditambahkan keyword final (menjadikan class tersebut tidak dapat diwariskan),
    // subclassnya (Persegi dan Lingkaran) jadi tidak dapat menggunakan atribut serta method yang ada pada superclass BangunDatar tersebut.

    // Pertanyaan 4: Hapus kembali keyword final pada kelas BangunDatar, lalu tambahkan keyword final pada method
    // printInfo() di dalam kelas BangunDatar. Bagaimana pengaruhnya dengan method printInfo() pada kelas Persegi dan Lingkaran?
    // Jawaban: Jika method printInfo() di dalam kelas BangunDatar diberi keyword final, maka method printInfo() pada kelas Persegi dan Lingkaran tidak dapat di-override.
    // Ini berarti method printInfo() pada setiap subclass tidak akan bisa menambahkan atribut uniknya seperti sisi (Persegi) dan jari (Lingkaran) dan subclass tersebut 
    // terpaksa menggunakan method printInfo() dari superclass secara apa adanya.
}
