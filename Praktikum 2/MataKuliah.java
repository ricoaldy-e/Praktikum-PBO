/* Nama File    : MataKuliah.java */
/* Deskripsi    : berisi atribut dan method dalam class MataKuliah */
/* Pembuat      : Rico Aldy Kusuma / 24060123120041 */
/* Tanggal      : 27 Ferbuari 2025 */

public class MataKuliah {
    // Atribut
    private String idMatkul;
    private String nama;
    private int sks;

    // Method

    // Konstruktor tanpa parameter
    public MataKuliah() {
        this.idMatkul = "";
        this.nama = "";
        this.sks = 0;
    }

    // Konstruktor dengan parameter
    public MataKuliah(String idMatkul, String nama, int sks) {
        this.idMatkul = idMatkul;
        this.nama = nama;
        this.sks = sks;
    }

    // Selector dan Getter
    public String getidMatkul() {
        return idMatkul;
    }

    public String getNama() {
        return nama;
    }

    public int getSKS() {
        return sks;
    }

    public void setidMatkul(String idMatkul) {
        this.idMatkul = idMatkul;
    } 

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setSKS(int sks) {
        this.sks = sks;
    }
}
