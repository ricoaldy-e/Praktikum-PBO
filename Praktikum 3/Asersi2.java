// Nama     : Rico Aldy Kusuma
// NIM      : 24060123120041
// File     : Asersi2.java
// Deskripsi: Program untuk demo asersi, yang akan menolak input jari-jari lingkaran yang bernilai nol

// class lingkaran
class Lingkaran {
    private double jariJari;
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }
    public double hitungKeliling() {
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

// class Asersi 2
public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;

        // Kesalahan 1: Asersi tidak aktif secara default
        // Jika program dijalankan tanpa '-enableassertions', asersi ini akan diabaikan,
        // sehingga program tetap akan membuat objek Lingkaran dengan jari-jari 0.
        assert(jariJari>0):"Jari-jari tidak boleh nol!!!";

        // Kesalahan 2: Objek Lingkaran tetap dibuat meskipun jariJari = 0.
        // Jika assert tidak diaktifkan dengan '-enableassertions', program tetap berjalan
        // dan membuat lingkaran dengan jari-jari 0.
        Lingkaran l = new Lingkaran(jariJari);

        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("Keliling lingkaran: " + kelilingLingkaran);
    }
}
