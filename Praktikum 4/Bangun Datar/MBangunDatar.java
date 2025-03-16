/* Nama File    : MBangunDatar.java */
/* Deskripsi    : berisi program utama untuk memanggil penggunaan fungsi class BangunDatar, Lingkaran, dan Persegi */
/* Pembuat      : Rico Aldy Kusuma / 24060123120041 */
/* Tanggal      : 13 Maret 2025 */

public class MBangunDatar {
    public static void main(String[] args) {
        // Membuat objek Persegi dengan konstruktor tanpa parameter
        Persegi persegi1 = new Persegi();
        persegi1.setSisi(6);
        persegi1.setWarna("Hijau");
        persegi1.setBorder("Kuning");

        System.out.println("Persegi 1:");
        persegi1.printInfo();
        System.out.println("Luas: " + persegi1.getLuas());
        System.out.println("Keliling: " + persegi1.getKeliling());
        System.out.println("Diagonal: " + persegi1.getDiagonal());
        System.out.println();

        // Membuat objek Persegi dengan konstruktor berparameter
        Persegi persegi2 = new Persegi(7, "Ungu", "Coklat");

        System.out.println("Persegi 2:");
        persegi2.printInfo();
        System.out.println("Luas: " + persegi2.getLuas());
        System.out.println("Keliling: " + persegi2.getKeliling());
        System.out.println("Diagonal: " + persegi2.getDiagonal());
        System.out.println();

        // Membuat objek Lingkaran dengan konstruktor tanpa parameter
        Lingkaran lingkaran1 = new Lingkaran();
        lingkaran1.setJari(5);
        lingkaran1.setWarna("Biru");
        lingkaran1.setBorder("Putih");

        System.out.println("Lingkaran 1:");
        lingkaran1.printInfo();
        System.out.println("Luas: " + lingkaran1.getLuas());
        System.out.println("Keliling: " + lingkaran1.getKeliling());
        System.out.println();

        // Membuat objek Lingkaran dengan konstruktor berparameter
        Lingkaran lingkaran2 = new Lingkaran(20, "Merah", "Hitam");

        System.out.println("Lingkaran 2:");
        lingkaran2.printInfo();
        System.out.println("Luas: " + lingkaran2.getLuas());
        System.out.println("Keliling: " + lingkaran2.getKeliling());
        System.out.println();

        // Menampilkan jumlah objek BangunDatar yang telah dibuat
        BangunDatar.printCounterBangunDatar();
    }
}
