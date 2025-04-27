/* Nama File    : Pegawai.java */
/* Deskripsi    : Class Pegawai adalah superclasss yang berisi atribut dan method umum */
/* Pembuat      : Rico Aldy Kusuma / 24060123120041 */
/* Tanggal      : 27 April 2025 */

public class Pegawai {
    private String nama;
    private int gajiPokok = 5000000;

    public Pegawai() {
        this.nama = "";
    }

    public Pegawai(String nama, int gajiPokok) {
        this.nama = nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }
    
    public void tampilData() {
        System.out.println("Nama: " + nama + ", Gaji Pokok: " + gajiPokok);
    }
}
