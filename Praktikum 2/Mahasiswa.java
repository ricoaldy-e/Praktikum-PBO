/* Nama File    : Mahasiswa.java */
/* Deskripsi    : berisi atribut dan method dalam class Mahasiswa */
/* Pembuat      : Rico Aldy Kusuma / 24060123120041 */
/* Tanggal      : 27 Ferbuari 2025 */

import java.util.ArrayList;

public class Mahasiswa {
    // Atribut
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    // Method

    // Konstruktor tanpa parameter
    public Mahasiswa() {
        this.nim = "";
        this.nama = "";
        this.prodi = "";
        this.listMatkul = new ArrayList<>(); // Inisialisasi ArrayList kosong
    }

    // Konstruktor dengan parameter
    public Mahasiswa(String nim, String nama, String prodi, ArrayList<MataKuliah> listMatkul, Dosen dosenWali, Kendaraan kendaraan) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatkul = listMatkul;
        this.dosenWali = dosenWali;
        this.kendaraan = kendaraan;
    }

    // Getter dan Setter
  
    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getProdi() {
        return prodi;
    }

    public Dosen getDosenWali() {
        return dosenWali;
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    public void AddMatkul(MataKuliah newMatkul) {
        listMatkul.add(newMatkul);
    }

    public int getJumlahSKS() {
        int totalSKS = 0;
        for (MataKuliah matkul : listMatkul) {
            totalSKS += matkul.getSKS();
        }
        return totalSKS;
    }

    public int getJumlahMatkul() {
        return listMatkul.size();
    }

    public void printMhs() {
        System.out.println("Nim: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }

    public void printDetailMhs() {
        System.out.println("Nim: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        System.out.print("Kendaraan: ");
        kendaraan.printDetail();
        System.out.print("Dosen Wali: ");
        dosenWali.printDetail();
        System.out.println("Mata Kuliah yang diambil:");
        for (MataKuliah matkul : listMatkul) {
            System.out.println(" - " + matkul.getNama());
        }
    }
}
