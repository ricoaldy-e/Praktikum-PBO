/* Nama File    : Titik.java */
/* Deskripsi    : berisi atribut dan method dalam class Titik */
/* Pembuat      : Rico Aldy Kusuma / 24060123120041 */
/* Tanggal      : 20 Ferbuari 2025 */

public class Titik {
    /* ATRIBUT */
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /* METHOD */
    /* Konstruktor untuk membuat titik (0, 0) */
    Titik() {
        this(0,0);
    }

    /* Konstruktor untuk membuat titik dengan koordinat tertentu */ 
    Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    // Mengembalikan nilai counterTitik
    static int getCounterTitik() {
        return counterTitik;
    }

    // mengembalikan nilai absis
    double getAbsis() {
        return absis;
    }

    // mengembalikan nilai ordinat
    double getOrdinat() {
        return ordinat;
    }

    // mengeset absis untuk titik dengan nilai baru x
    void setAbsis(double x) {
        absis = x;
    }

    // mengeset ordinat untuk titik dengan nilai baru y
    void setOrdinat (double y) {
        ordinat = y;
    }

    // menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser (double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    // Menentukan kuadran dari titik
    int getKuadran() {
        if (absis > 0 && ordinat > 0) {
            return 1; // Kuadran I
        } else if (absis < 0 && ordinat > 0) {
            return 2; // Kuadran II
        } else if (absis < 0 && ordinat < 0) {
            return 3; // Kuadran III
        } else if (absis > 0 && ordinat < 0) {
            return 4; // Kuadran IV
        } else if (absis == 0 && ordinat != 0) {
            return 5; // Garis Y
        } else if (ordinat == 0 && absis != 0) {
            return 6; // Garis X
        } else {
            return 0; // Titik Pusat
        }
    }

    // Menghitung jarak dari titik ke pusat (0, 0)
    int getJarakPusat() {
        return (int) Math.sqrt(absis * absis + ordinat * ordinat);
    }

    // Mengembalikan jarak ke titik T
    double getJarak(Titik T){
        return Math.sqrt(
            (T.absis - this.absis) * (T.absis - this.absis) + (T.ordinat - this.ordinat) * (T.ordinat - this.ordinat)
        );
    }

    // Fungsi refleksi terhadap sumbu x
    void refleksiX() {
        ordinat = -ordinat;
    }

    // Fungsi refleksi terhadap sumbu y
    void refleksiY() {
        absis = -absis;
    }

    // Fungsi untuk mengembalikan koordinat refleksi terhadap sumbu x tanpa mengubah titik asli dengan membuat titik baru
    Titik getRefleksiX() {
        return new Titik(absis, -ordinat);
    }

    // Fungsi untuk mengembalikan koordinat refleksi terhadap sumbu y tanpa mengubah titik asli dengan membuat titik baru
    Titik getRefleksiY() {
        return new Titik(-absis, ordinat);
    }

    // mencetak koordinat titik
    void printTitik() {
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }
  
} // end class Titik
