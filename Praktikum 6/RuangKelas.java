/* Nama File    : RuangKelas.java */
/* Deskripsi    : Class RuangKelas merupakan subclass dari Ruang yang merepresentasikan ruang kelas */
/* Pembuat      : Rico Aldy Kusuma / 24060123120041 */
/* Tanggal      : 27 Maret 2025 */

class RuangKelas extends Ruang {
    private int kursiTersedia, kursiRusak;
    public static int totalRuangKelas = 0;
    
    public RuangKelas(String kode, double panjang, double lebar, double tinggi, int kapasitas, int kursiTersedia, int kursiRusak, double tarifKebersihan) {
        super(kode, panjang, lebar, tinggi, kapasitas, tarifKebersihan);
        this.kursiTersedia = kursiTersedia;
        this.kursiRusak = kursiRusak;
        totalRuangKelas++;
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Kursi Tersedia      : " + kursiTersedia);
        System.out.println("Kursi Rusak         : " + kursiRusak);
    }
}
