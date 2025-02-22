/* Nama File    : MGaris.java */
/* Deskripsi    : berisi program utama untuk memanggil penggunaan fungsi class Garis */
/* Pembuat      : Rico Aldy Kusuma / 24060123120041 */
/* Tanggal      : 20 Ferbuari 2025 */

public class MGaris {
    public static void main(String[] args) {
        Garis garisAwal = new Garis();
        System.out.println("Garis awal adalah:");
        garisAwal.printGaris();
        System.out.println();

        // Menggunakan konstruktor dengan parameter
        Titik titik1 = new Titik(1, 2);
        Titik titik2 = new Titik(4, 6);
        Garis garis1 = new Garis(titik1, titik2);
        System.out.println("Garis1: ");
        garis1.printGaris();
        
        // Menggunakan selektor dan mutator
        Titik titik3 = new Titik(3, 5);
        garis1.setTitikAwal(titik3);
        System.out.println("Garis1 setelah mengubah titik awal T1 menjadi T3:");
        garis1.printGaris();
        System.out.println();
        
        // Mengetahui jumlah objek garis, panjang garis, dan gradien garis
        System.out.println("Jumlah Objek Garis = " + Garis.getCounterGaris());
        System.out.println("Panjang Garis1: " + garis1.getPanjang());
        System.out.println("Gradien Garis1: " + garis1.getGradien());

        // Mendapatkan dan mencetak titik tengah dari Garis1
        Titik titikTengah = garis1.getTitikTengah();
        System.out.println("Titik tengah dari Garis1: (" + titikTengah.getAbsis() + ", " + titikTengah.getOrdinat() + ")");
        
        // Mengecek apakah garis1 sejajar dengan garisAwal
        System.out.println("Apakah Garis1 sejajar dengan Garis awal? " + garis1.isSejajar(garisAwal));

        // Mengecek apakah garis1 tegak lurus dengan garisAwal
        System.out.println("Apakah Garis1 tegak lurus dengan Garis awal? " + garis1.isTegakLurus(garisAwal));

        // Mengetahui persamaan garis dalam bentuk string
        System.out.println("Persamaan Garis1: " + garis1.getPersamaanGaris());
    }
}
