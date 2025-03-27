/* Nama File    : RuangDosen.java */
/* Deskripsi    : Class RuangDosen merupakan subclass dari Ruang yang merepresentasikan ruang dosen */
/* Pembuat      : Rico Aldy Kusuma / 24060123120041 */
/* Tanggal      : 27 Maret 2025 */

class RuangDosen extends Ruang {
    private String namaDosen;
    private int meja, kursi;
    public static int totalRuangDosen = 0;
    
    public RuangDosen(String kode, double panjang, double lebar, double tinggi, int kapasitas, String namaDosen, int meja, int kursi, double tarifKebersihan) {
        super(kode, panjang, lebar, tinggi, kapasitas, tarifKebersihan);
        this.namaDosen = namaDosen;
        this.meja = meja;
        this.kursi = kursi;
        totalRuangDosen++;
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Nama Dosen          : " + namaDosen);
        System.out.println("Jumlah Meja         : " + meja);
        System.out.println("Jumlah Kursi        : " + kursi);
    }
}
