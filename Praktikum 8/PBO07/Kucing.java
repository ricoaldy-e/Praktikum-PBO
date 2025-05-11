/* Nama File    : Kucing.java */
/* Deskripsi    : Class Kucing merupakan subclass dari Anabul */
/* Pembuat      : Rico Aldy Kusuma / 24060123120041 */
/* Tanggal      : 27 April 2025 */

public class Kucing extends Anabul {
    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void bersuara() {
        System.out.println(getNama() + " berbunyi: 'meong'");
    }

    @Override
    public void bergerak() {
        System.out.println(getNama() + " bergerak dengan melata\n");
    }
}