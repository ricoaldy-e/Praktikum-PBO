/* Nama File    : ContohMetodeGenerik.java */
/* Deskripsi    : Kelas berisi metode generik untuk mengendalikan objek Datum */
/* Pembuat      : Rico Aldy Kusuma / 24060123120041 */
/* Tanggal      : 11 Mei 2025 */

public class ContohMetodeGenerik {
    public static <T extends Anabul> void tampilkanAnabul(Datum<T> datum) {
        datum.getIsi().bersuara();
        datum.getIsi().bergerak();
    }
}