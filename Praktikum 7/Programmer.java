/* Nama File    : Programmer.java */
/* Deskripsi    : Class Programmer merupakan subclass dari Pegawai */
/* Pembuat      : Rico Aldy Kusuma / 24060123120041 */
/* Tanggal      : 27 April 2025 */

public class Programmer extends Pegawai {
    private int bonus = 450000;
    
    public Programmer() {
        super();
    }

    public Programmer(String nama) {
        super(nama, 5000000);
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus : " + bonus);
    }
}