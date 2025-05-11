/* Nama File    : Koleksi.java */
/* Deskripsi    : Kelas generik dinamis untuk menyimpan kumpulan elemen */
/* Pembuat      : Rico Aldy Kusuma / 24060123120041 */
/* Tanggal      : 11 Mei 2025 */

import java.util.ArrayList;

public class Koleksi<T> {
    private int nbelm;
    private ArrayList<T> wadah;

    public Koleksi() {
        wadah = new ArrayList<>();
        nbelm = 0;
    }

    public T getIsi(int i) {
        return wadah.get(i);
    }

    public void setIsi(int i, T elemen) {
        wadah.set(i, elemen);
    }

    public int getSize() {
        return nbelm;
    }

    public void setSize(int size) {
        this.nbelm = size;
    }

    public void add(T elemen) {
        wadah.add(elemen);
        nbelm++;
    }

    public void delete(int index) {
        if (index >= 0 && index < nbelm) {
            wadah.remove(index);
            nbelm--;
        }
    }

    public void showAll() {
        for (T elemen : wadah) {
            System.out.println(elemen);
        }
    }
}
