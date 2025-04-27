/* Nama File    : MainAnabul.java */
/* Deskripsi    : Class MainAnabul merupakan class utama untuk pemanggilan class lain */
/* Pembuat      : Rico Aldy Kusuma / 24060123120041 */
/* Tanggal      : 27 April 2025 */

public class MainAnabul {
    public static void main(String[] args) {
        Anabul kucing = new Kucing("Denis");
        Anabul anjing = new Anjing("Yongki");
        Anabul burung = new Burung("Matew");

        System.out.println("\nSimulasi Kucing: ");
        kucing.bersuara();
        kucing.bergerak();

        System.out.println("Simulasi Anjing: ");
        anjing.bersuara();
        anjing.bergerak();

        System.out.println("Simulasi Burung: ");
        burung.bersuara();
        burung.bergerak();
    }
}
