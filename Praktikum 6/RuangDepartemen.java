/* Nama File    : RuangDepartemen.java */
/* Deskripsi    : Class RuangDepartemen merupakan subclass dari Ruang yang merepresentasikan ruang departemen */
/* Pembuat      : Rico Aldy Kusuma / 24060123120041 */
/* Tanggal      : 27 Maret 2025 */

class RuangDepartemen extends Ruang {
    private int meja, kursi, lemari;
    private String namaDepartemen, ketuaDepartemen;
    public static int totalRuangDepartemen = 0;
    
    public RuangDepartemen(String kode, double panjang, double lebar, double tinggi, int kapasitas, int meja, int kursi, int lemari, String namaDepartemen, String ketuaDepartemen, double tarifKebersihan) {
        super(kode, panjang, lebar, tinggi, kapasitas, tarifKebersihan);
        this.meja = meja;
        this.kursi = kursi;
        this.lemari = lemari;
        this.namaDepartemen = namaDepartemen;
        this.ketuaDepartemen = ketuaDepartemen;
        totalRuangDepartemen++;
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Nama Departemen     : " + namaDepartemen);
        System.out.println("Ketua Departemen    : " + ketuaDepartemen);
        System.out.println("Jumlah Meja         : " + meja);
        System.out.println("Jumlah Kursi        : " + kursi);
        System.out.println("Jumlah Lemari       : " + lemari);
    }
}
