/* Nama File    : Dosen.java */
/* Deskripsi    : berisi atribut dan method dalam class Dosen */
/* Pembuat      : Rico Aldy Kusuma / 24060123120041 */
/* Tanggal      : 27 Ferbuari 2025 */

public class Dosen {
    // Atribut
    private String nip;
    private String nama;
    private String prodi;

    // Method

    // Koonstruktor tanpa parameter
    public Dosen() {
        this.nip = "";
        this.nama = "";
        this.prodi = "";
    }

    // Konstruktor dengan parameter 
    public Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this. prodi = prodi;
    }

    // Getter dan Setter
    public String getNip() {
        return nip;
    }

    public String getNama() {
        return nama;
    }

    public String getProdi() {
        return prodi;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public void printDetail() {
        System.out.println(nama + ", dengan NIP: " + nip + ", Prodi: " + prodi);
    }
}
