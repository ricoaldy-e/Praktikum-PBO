/* Nama File    : Lingkaran.java */
/* Deskripsi    : berisi atribut dan method dalam class Lingkaran */
/* Pembuat      : Rico Aldy Kusuma / 24060123120041 */
/* Tanggal      : 13 Maret 2025 */

public class Lingkaran extends BangunDatar {
    private double jari;

    public Lingkaran() {
        super();
    }

    public Lingkaran(double jari, String warna, String border) {
        super(0, warna, border);
        this.jari = jari;
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    public double getLuas() {
        return Math.PI * jari * jari;
    }

    public double getKeliling() {
        return 2 * Math.PI * jari;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari-jari: " + jari);
    }
}
