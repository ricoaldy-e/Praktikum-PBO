/* Nama File    : KoleksiAnabul.java */
/* Deskripsi    : Kelas generik untuk menyimpan dan menampilkan koleksi anabul */
/* Pembuat      : Rico Aldy Kusuma / 24060123120041 */
/* Tanggal      : Minggu, 11 Mei 2025 */

import java.util.ArrayList;

public class KoleksiAnabul<T extends Anabul> {
    private ArrayList<T> wadah;

    public KoleksiAnabul() {
        wadah = new ArrayList<>();
    }

    public void add(T anabul) {
        wadah.add(anabul);
    }

    public void showAll() {
        int i = 1;
        for (T a : wadah) {
            System.out.println("Anabul ke-" + i++);
            System.out.println("Nama : " + a.getNama());
            System.out.println("Jenis: " + a.getClass().getSimpleName());
            a.bersuara();
            a.bergerak();
            System.out.println();
        }
        System.out.println("Jumlah total anabul: " + wadah.size());
    }
}