/* Nama File    : BangunDatar.java */
/* Deskripsi    : berisi atribut dan method dalam class BangunDatar */
/* Pembuat      : Rico Aldy Kusuma / 24060123120041 */
/* Tanggal      : 20 Maret 2025 */

public abstract class BangunDatar {
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
        System.out.println("Jumlah Objek Bangun Datar       : " + counterBangunDatar);
    }

    public abstract double getLuas();
    public abstract double getKeliling();

    public boolean isEqualLuas(BangunDatar X){
        return this.getLuas() == X.getLuas();
    }

    public boolean isEqualKeliling(BangunDatar X){
        return this.getKeliling() == X.getKeliling();
    }

    /*
        Jika BangunDatar tidak dijadikan sebagai abstract class, dapatkah kita membuat isEqualLuas() & isEqualKeliling()?
        Bisa, tetapi kita harus memberikan implementasi default untuk getLuas() dan getKeliling(), 
        misalnya dengan return 0. Namun, ini tidak ideal karena BangunDatar adalah konsep umum, dan 
        setiap bentuk seharusnya punya cara berbeda dalam menghitung luas & keliling.
    */

    /* 
        Kelebihan saat class BangunDatar dijadikan sebagai abstract class daripada non-abstract class:
        1. Memastikan setiap subclass (Persegi, Lingkaran) memiliki method getLuas() dan getKeliling(), 
        karena method ini harus di-override di subclass.
        2. Mencegah pembuatan objek BangunDatar langsung, sehingga tidak ada objek yang tidak memiliki 
        implementasi konkret dari getLuas() dan getKeliling().
        3. Menerapkan konsep pewarisan yang lebih baik, karena BangunDatar hanya sebagai blueprint 
        (kerangka) bagi bangun datar lainnya, bukan sebagai objek yang bisa berdiri sendiri.
        4. Memudahkan pengembangan kode, karena setiap subclass hanya perlu mengimplementasikan method 
        yang spesifik untuk bentuknya sendiri tanpa harus mendefinisikan ulang struktur dasar.
    */
}
