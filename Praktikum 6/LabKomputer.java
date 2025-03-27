/* Nama File    : LabKomputer.java */
/* Deskripsi    : Class LabKomputer merupakan subclass dari Laboratorium yang merepresentasikan laboratorium komputer */
/* Pembuat      : Rico Aldy Kusuma / 24060123120041 */
/* Tanggal      : 27 Maret 2025 */

class LabKomputer extends Laboratorium {
    private int jumlahKomputer;
    public static int totalLabKomputer = 0;

    public LabKomputer(String kode, double panjang, double lebar, double tinggi, int kapasitas, String namaLab, double hargaSewa, int jumlahKomputer, double tarifKebersihan) {
        super(kode, panjang, lebar, tinggi, kapasitas, namaLab, hargaSewa, tarifKebersihan);
        this.jumlahKomputer = jumlahKomputer;
        totalLabKomputer++;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Komputer     : " + jumlahKomputer);
    }
}
