/* Nama File    : Laboratorium.java */
/* Deskripsi    : Class Laboratorium merupakan subclass dari Ruang yang merepresentasikan laboratorium */
/* Pembuat      : Rico Aldy Kusuma / 24060123120041 */
/* Tanggal      : 27 Maret 2025 */

class Laboratorium extends Ruang {
    protected String namaLab;
    protected double hargaSewa;
    public static int totalLaboratorium = 0;

    public Laboratorium(String kode, double panjang, double lebar, double tinggi, int kapasitas, String namaLab, double hargaSewa, double tarifKebersihan) {
        super(kode, panjang, lebar, tinggi, kapasitas, tarifKebersihan);
        this.namaLab = namaLab;
        this.hargaSewa = hargaSewa;
        totalLaboratorium++;
    }

    public double hitungBiayaSewa() {
        return hargaSewa;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Nama Lab            : " + namaLab);
        System.out.println("Harga Sewa          : Rp " + hitungBiayaSewa());
    }
}
