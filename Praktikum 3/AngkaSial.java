/**
 * File      : AngkaSial.java
 * Deskripsi : Program penggunaan exception buatan sendiri
 *             Pengenalan klausa 'throw' dan 'throws'
 */
public class AngkaSial {

    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException(); // BARIS 12: Tidak dieksekusi jika angka == 13, karena program langsung melempar exception.
        }
        System.out.println(angka + " bukan angka sial"); // BARIS 12: Tidak akan dieksekusi jika angka == 13 karena terjadi exception sebelumnya.
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10); // Dieksekusi: "10 bukan angka sial" dicetak.
            as.cobaAngka(13); // Terjadi exception, program langsung lompat ke blok catch.
            as.cobaAngka(12); // BARIS 21: Tidak dieksekusi karena setelah exception, program langsung ke catch.
        } catch (AngkaSialException ase) {
            // Setelah exception terjadi, program langsung masuk ke sini.
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}
