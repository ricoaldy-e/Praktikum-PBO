/* Nama File    : BangunDatarGenericTest.java */
/* Deskripsi    : Main class untuk generic bangun datar */
/* Pembuat      : Rico Aldy Kusuma / 24060123120041 */
/* Tanggal      : 11 Mei 2025 */

public class BangunDatarGenericTest {
    public static void main(String[] args) {

        // Persegi
        Persegi p = new Persegi(5);
        BangunDatarGeneric<Persegi> bdg1 = new BangunDatarGeneric<Persegi>();
        bdg1.set(p);
        System.out.println("Luas Persegi: " + bdg1.hitungLuas());
        System.out.println("Keliling Persegi: " + bdg1.hitungKeliling());
        System.out.println("Tipe generic: " + bdg1.get().getClass().getName());

        // Persegi Panjang
        PersegiPanjang pp = new PersegiPanjang(5, 3);
        BangunDatarGeneric<PersegiPanjang> bdg2 = new BangunDatarGeneric<PersegiPanjang>();
        bdg2.set(pp);
        System.out.println("\nLuas Persegi Panjang: " + bdg2.hitungLuas());
        System.out.println("Keliling Persegi Panjang: " + bdg2.hitungKeliling());
        System.out.println("Tipe generic: " + bdg2.get().getClass().getName());

        // Segitiga
        Segitiga s = new Segitiga(4, 3, 5);
        BangunDatarGeneric<Segitiga> bdg3 = new BangunDatarGeneric<Segitiga>();
        bdg3.set(s);
        System.out.println("\nLuas Segitiga: " + bdg3.hitungLuas());
        System.out.println("Keliling Segitiga: " + bdg3.hitungKeliling());
        System.out.println("Tipe generic: " + bdg3.get().getClass().getName());
    }
}