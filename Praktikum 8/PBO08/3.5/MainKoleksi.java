/* Nama File    : MainKoleksi.java */
/* Deskripsi    : Program utama untuk pengujian Koleksi dengan karakter */
/* Pembuat      : Rico Aldy Kusuma / 24060123120041 */
/* Tanggal      : 11 Mei 2025 */

public class MainKoleksi {
    public static void main(String[] args) {
        Koleksi<Character> koleksi = new Koleksi<>();

        for (char c = 'A'; c < 'A' + 10; c++) {
            koleksi.add(c);
        }
        koleksi.showAll();
        System.out.println("Elemen ke-10: " + koleksi.getIsi(9));

        koleksi.setIsi(0, 'R');
        koleksi.delete(1);
        System.out.println("\nKoleksi karakter setelah diedit dan dihapus:");
        koleksi.showAll();
    }
}
