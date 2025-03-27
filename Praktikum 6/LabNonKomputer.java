/* Nama File    : LabNonKomputer.java */
/* Deskripsi    : Class LabNonKomputer merupakan subclass dari Laboratorium yang merepresentasikan laboratorium non-komputer */
/* Pembuat      : Rico Aldy Kusuma / 24060123120041 */
/* Tanggal      : 27 Maret 2025 */

import java.util.List;

class LabNonKomputer extends Laboratorium {
    private List<String> mataKuliah;
    public static int totalLabNonKomputer = 0;

    public LabNonKomputer(String kode, double panjang, double lebar, double tinggi, int kapasitas, String namaLab, double hargaSewa, List<String> mataKuliah, double tarifKebersihan) {
        super(kode, panjang, lebar, tinggi, kapasitas, namaLab, hargaSewa, tarifKebersihan);
        this.mataKuliah = mataKuliah;
        totalLabNonKomputer++;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Mata Kuliah         : " + String.join(", ", mataKuliah));
    }
}
