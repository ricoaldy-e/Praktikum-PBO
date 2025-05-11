/* Nama File    : burung.java */
/* Deskripsi    : Class burung merupakan subclass dari Anabul */
/* Pembuat      : Rico Aldy Kusuma / 24060123120041 */
/* Tanggal      : 27 April 2025 */

public class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void bersuara() {
        System.out.println(getNama() + " berbunyi: 'cuit'");
    }

    @Override
    public void bergerak() {
        System.out.println(getNama() + " bergerak dengan terbang");
    }
}