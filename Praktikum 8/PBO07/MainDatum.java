/* Nama File    : MainDatum.java */
/* Deskripsi    : Program utama untuk menyimulasikan penggunaan kelas generik Datum */
/* Pembuat      : Rico Aldy Kusuma / 24060123120041 */
/* Tanggal      : 11 Mei 2025 */

public class MainDatum {
    public static void main(String[] args) {
        Datum<Anabul> dKucing = new Datum<>(new Kucing("Denis"));
        Datum<Anabul> dAnjing = new Datum<>(new Anjing("Yongki"));
        Datum<Anabul> dBurung = new Datum<>(new Burung("Matew"));

        System.out.println("\nSimulasi dari objek Datum:");
        dKucing.getIsi().bersuara();
        dKucing.getIsi().bergerak();

        dAnjing.getIsi().bersuara();
        dAnjing.getIsi().bergerak();

        dBurung.getIsi().bersuara();
        dBurung.getIsi().bergerak();
    }
}