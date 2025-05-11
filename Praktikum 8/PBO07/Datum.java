/* Nama File    : Datum.java */
/* Deskripsi    : Kelas generik Datum untuk menyimpan objek bertipe T */
/* Pembuat      : Rico Aldy Kusuma / 24060123120041 */
/* Tanggal      : 11 Mei 2025 */

public class Datum<T> {
    private T isi;

    public Datum(T isi) {
        this.isi = isi;
    }

    public T getIsi() {
        return isi;
    }

    public void setIsi(T isi) {
        this.isi = isi;
    }
}