/* Nama File    : MLingkaran.java */
/* Deskripsi    : berisi program utama untuk memanggil penggunaan fungsi class Lingkaran */
/* Pembuat      : Rico Aldy Kusuma / 24060123120041 */
/* Tanggal      : 13 Maret 2025 */

public class MLingkaran {
    public static void main(String[] args) {
        // Membuat objek Lingkaran dengan konstruktor tanpa parameter
        Lingkaran lingkaran1 = new Lingkaran();
        lingkaran1.setJari(3);
        lingkaran1.setWarna("Biru");
        lingkaran1.setBorder("Putih");
        
        System.out.println("Lingkaran 1:");
        lingkaran1.printInfo();
        System.out.println("Luas: " + lingkaran1.getLuas());
        System.out.println("Keliling: " + lingkaran1.getKeliling());
        System.out.println();

        // Membuat objek Lingkaran dengan konstruktor berparameter
        Lingkaran lingkaran2 = new Lingkaran(16, "Merah", "Hitam");
        
        System.out.println("Lingkaran 2:");
        lingkaran2.printInfo();
        System.out.println("Luas: " + lingkaran2.getLuas());
        System.out.println("Keliling: " + lingkaran2.getKeliling());
        System.out.println();
    }
}
