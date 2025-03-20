/* Nama File    : MBangunDatar.java */
/* Deskripsi    : berisi program utama untuk memanggil penggunaan fungsi class BangunDatar, Lingkaran, dan Persegi */
/* Pembuat      : Rico Aldy Kusuma / 24060123120041 */
/* Tanggal      : 20 Maret 2025 */

public class MBangunDatar {
    public static void main(String[] args) {

        // BangunDatar B1 = new BangunDatar(); // ERROR karena abstract
        BangunDatar P1 = new Persegi(5, "Merah", "Hitam");
        Persegi P2 = new Persegi(5, "Biru", "Putih");
        Lingkaran L1 = new Lingkaran(7, "Kuning", "Hijau");

        System.out.println("Luas Persegi 1                  : " + P1.getLuas());
        System.out.println("Keliling Persegi 1              : " + P1.getKeliling());

        System.out.println("Luas Persegi 2                  : " + P2.getLuas());
        System.out.println("Keliling Persegi 2              : " + P2.getKeliling());

        System.out.println("Luas Lingkaran 1                : " + L1.getLuas());
        System.out.println("Keliling Lingkaran 1            : " + L1.getKeliling());

        BangunDatar.printCounterBangunDatar();

        System.out.println("Apakah Luas P1 dan P2 sama?       " + P1.isEqualLuas(P2));
        System.out.println("Apakah Keliling P1 dan P2 sama?   " + P1.isEqualKeliling(P2));

        System.out.println("Apakah Luas P1 dan L1 sama?       " + P1.isEqualLuas(L1));
        System.out.println("Apakah Keliling P1 dan L1 sama?   " + P1.isEqualKeliling(L1));

        /* 
            Pembuatan objek BangunDatar B1 = new BangunDatar(); akan menyebabkan error 
            karena BangunDatar adalah abstract class dan tidak bisa dibuat objeknya langsung.
            Namun, kode seperti BangunDatar P1 = new Persegi(5); dan BangunDatar L1 = new Lingkaran(7); 
            tidak bermasalah karena meskipun menggunakan reference BangunDatar, objek yang dibuat 
            berasal dari subclass (Persegi dan Lingkaran).
            Semua method seperti getLuas(), getKeliling(), dan printInfo() dapat dipanggil tanpa error, 
            karena Java akan menjalankan method sesuai dengan objeknya berkat konsep polimorfisme dan override.
        */

        /*
            Apakah method isEqualLuas() dan isEqualKeliling() bisa membandingkan objek bangun datar yang berbeda?
            Bisa, karena method ini hanya membandingkan nilai return dari getLuas() dan getKeliling(),
            tanpa peduli apakah itu Persegi atau Lingkaran.
        */

        System.out.println();
        P2.zoomIn();
        System.out.println("Persegi setelah di zoomIn       : ");
        System.out.println("Luas P2 setelah di zoomIn       : " + P2.getLuas());
        System.out.println("Keliling P2 setelah di zoomIn   : " + P2.getKeliling());

        System.out.println();
        L1.zoomOut();
        System.out.println("Lingkaran setelah di zoomOut    : ");
        System.out.println("Luas L1 setelah di zoomOut      : " + L1.getLuas());
        System.out.println("Keliling L1 setelah di zoomOut  : " + L1.getKeliling());

        System.out.println();
        P2.zoom(90);
        System.out.println("Persegi setelah di zoom 90%     : ");
        System.out.println("Luas P2 setelah di zoom 90%     : " + P2.getLuas());
        System.out.println("Keliling P2 setelah di zoom 90% : " + P2.getKeliling());

        /* 
            Eksperimen pemanggilan method yang telah dibuat dari IResize 
            Saat method zoomIn(), zoomOut(), dan zoom() dipanggil dari objek Persegi dan Lingkaran,
            hasilnya menunjukkan bahwa ukuran (sisi atau jari-jari) berubah sesuai dengan operasi yang dilakukan.
            Hasilnya:
                - zoomIn() meningkatkan ukuran objek sebesar 10%.
                - zoomOut() mengurangi ukuran objek sebesar 10%.
                - zoom(int percent) mengubah ukuran objek sesuai dengan persentase yang diberikan.
            Implementasi IResize dalam class Persegi dan Lingkaran berhasil.
        */

        /* 
            Perbedaan antara pewarisan class dan implementasi interface:
                -   Class Persegi dan Lingkaran hanya bisa mewarisi satu superclass (BangunDatar), 
                    tetapi bisa mengimplementasikan banyak interface.
                -   IResize dapat digunakan oleh class yang tidak memiliki hubungan langsung dengan BangunDatar, 
                    misalnya class Garis atau Bangun3D juga bisa menggunakannya tanpa harus menjadi bagian dari hierarki BangunDatar.
            Hasil eksperimen membuktikan bahwa method zoomIn(), zoomOut(), dan zoom() bisa dipanggil tanpa error, 
            menunjukkan bahwa interface IResize telah berhasil diterapkan dalam Persegi dan Lingkaran.
        */
    }
}
