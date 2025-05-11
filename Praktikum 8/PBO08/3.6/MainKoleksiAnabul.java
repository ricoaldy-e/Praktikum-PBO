/* Nama File    : MainKoleksiAnabul.java */
/* Deskripsi    : Program utama untuk menjalankan simulasi koleksi anabul */
/* Pembuat      : Rico Aldy Kusuma / 24060123120041 */
/* Tanggal      : Minggu, 11 Mei 2025 */

public class MainKoleksiAnabul {
    public static void main(String[] args) {
        KoleksiAnabul<Anabul> koleksi = new KoleksiAnabul<>();

        koleksi.add(new Kucing("Rudi"));
        koleksi.add(new Kucing("Rusdi"));
        koleksi.add(new Burung("Ruli"));
        koleksi.add(new Kucing("Rudal"));
        koleksi.add(new Burung("Raul"));
        koleksi.add(new Burung("Rambat"));
        koleksi.add(new Kucing("Raksasa"));
        koleksi.add(new Burung("Rare"));
        koleksi.add(new Kucing("Reldi"));
        koleksi.add(new Anjing("Denis"));

        koleksi.showAll();
    }
}