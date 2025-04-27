/* Nama File    : Manager.java */
/* Deskripsi    : Class Manager merupakan subclass dari Pegawai */
/* Pembuat      : Rico Aldy Kusuma / 24060123120041 */
/* Tanggal      : 27 April 2025 */

public class Manager extends Pegawai {
    private int tunjangan = 700000;

    public Manager(String nama) {
        super(nama, 5000000);
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan : " + tunjangan);
    }
} 