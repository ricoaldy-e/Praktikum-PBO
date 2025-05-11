/* Nama File    : Anjing.java */
/* Deskripsi    : Class Anjing merupakan subclass dari Anabul */
/* Pembuat      : Rico Aldy Kusuma / 24060123120041 */
/* Tanggal      : 27 April 2025 */

public class Anjing extends Anabul {
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void bersuara() {
        System.out.println(getNama() + " berbunyi: 'guk-guk'");
    }

    @Override
    public void bergerak() {
        System.out.println(getNama() + " bergerak dengan melata");
    }
}