/* Nama File    : Garis.java */
/* Deskripsi    : berisi atribut dan method dalam class Garis */
/* Pembuat      : Rico Aldy Kusuma / 24060123120041 */
/* Tanggal      : 20 Ferbuari 2025 */

public class Garis {
    /* ATRIBUT */
    Titik titikAwal;
    Titik titikAkhir;
    static int counterGaris = 0;

    /* METHOD */
    /* Konstruktor tanpa parameter yang menginisialisasi titik awal dengan (0,0) dan titik akhir dengan (1,1) */
    Garis() {
        this.titikAwal = new Titik(0, 0);
        this.titikAkhir = new Titik(1, 1);
        counterGaris++;
    }

    /* Konstruktor dengan parameter untuk membuat garis dengan titik awal dan akhir */
    Garis(Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }

    // Selector mengembalikan titik awal
    Titik getTitikAwal() {
        return titikAwal;
    }

    // Selector mengembalikan titik akhir
    Titik getTitikAkhir() {
        return titikAkhir;
    }

    // Selector mengembalikan nilai banyaknya garis
    static int getCounterGaris() {
        return counterGaris;
    }

    // Mengeset titik awal untuk garis dengan nilai baru
    void setTitikAwal(Titik titikAwal) {
        this.titikAwal = titikAwal;
    }

    // Mengeset titik akhir untuk garis dengan nilai baru
    void setTitikAkhir(Titik titikAkhir) {
        this.titikAkhir = titikAkhir;
    }

    // Menghitung panjang garis tanpa memanggil fungsi getJarak
    double getPanjang() {
        return Math.sqrt(
            (titikAkhir.getAbsis() - titikAwal.getAbsis()) * (titikAkhir.getAbsis() - titikAwal.getAbsis()) + (titikAkhir.getOrdinat() - titikAwal.getOrdinat()) * (titikAkhir.getOrdinat() - titikAwal.getOrdinat())
        );
    }

    // Menghitung gradien garis
    double getGradien() {
        return (
            (titikAkhir.getOrdinat() - titikAwal.getOrdinat()) / (titikAkhir.getAbsis() - titikAwal.getAbsis())
        );
    }

    // Mendapatkan titik tengah dari sebuah garis
    Titik getTitikTengah() {
        return new Titik(
            ((titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2), ((titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2)
        );
    }

    // Mengecek apakah garis ini sejajar dengan garis lainnya
    boolean isSejajar(Garis garisLain) {
        return this.getGradien() == garisLain.getGradien();
    }

    // Mengecek apakah garis ini tegak lurus dengan garis lainnya
    boolean isTegakLurus(Garis garislain) {
        return this.getGradien() * garislain.getGradien() == -1;
    }

    // Mencetak koordinat titik awal dan akhir garis
    void printGaris() {
        System.out.println("Garis dari Titik (" + titikAwal.getAbsis() + ", " + titikAwal.getOrdinat() + ") ke Titik (" + titikAkhir.getAbsis() + ", " + titikAkhir.getOrdinat() + ")");
    }

    // Mendapatkan persamaan garis dalam bentuk string
    String getPersamaanGaris() {
        double m = getGradien();
        double c = titikAwal.getOrdinat() - m * titikAwal.getAbsis();
        return "y = " + m + "x + " + c;
    }
    
} // end class Garis
