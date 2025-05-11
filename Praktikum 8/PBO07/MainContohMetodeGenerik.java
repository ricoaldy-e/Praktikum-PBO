/* Nama File    : MainContohMetodeGenerik.java */
/* Deskripsi    : Program utama untuk menyimulasikan metode generik dari ContohMetodeGenerik */
/* Pembuat      : Rico Aldy Kusuma / 24060123120041 */
/* Tanggal      : 11 Mei 2025 */

public class MainContohMetodeGenerik {
    public static void main(String[] args) {
        Datum<Kucing> dKucing = new Datum<>(new Kucing("Denis"));
        Datum<Anjing> dAnjing = new Datum<>(new Anjing("Yongki"));
        Datum<Burung> dBurung = new Datum<>(new Burung("Matew"));

        System.out.println("\nSimulasi metode generik pada kelas ContohMetodeGenerik:");

        ContohMetodeGenerik.tampilkanAnabul(dKucing);
        ContohMetodeGenerik.tampilkanAnabul(dAnjing);
        ContohMetodeGenerik.tampilkanAnabul(dBurung);
    }
}