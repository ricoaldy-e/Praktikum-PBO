/* Nama File    : MPersegi.java */
/* Deskripsi    : berisi program utama untuk memanggil penggunaan fungsi class Persegi */
/* Pembuat      : Rico Aldy Kusuma / 24060123120041 */
/* Tanggal      : 13 Maret 2025 */

public class MPersegi {
    public static void main(String[] args) {
        // Membuat objek Persegi dengan konstruktor tanpa parameter
        Persegi persegi1 = new Persegi();
        persegi1.setSisi(2);
        persegi1.setWarna("Hijau");
        persegi1.setBorder("Kuning");
        
        System.out.println("Persegi 1:");
        persegi1.printInfo();
        System.out.println("Luas: " + persegi1.getLuas());
        System.out.println("Keliling: " + persegi1.getKeliling());
        System.out.println("Diagonal: " + persegi1.getDiagonal());
        System.out.println();

        // Membuat objek Persegi dengan konstruktor berparameter
        Persegi persegi2 = new Persegi(4, "Ungu", "Coklat");

        System.out.println("Persegi 2:");
        persegi2.printInfo();
        System.out.println("Luas: " + persegi2.getLuas());
        System.out.println("Keliling: " + persegi2.getKeliling());
        System.out.println("Diagonal: " + persegi2.getDiagonal());
        System.out.println();
    }
}
