/* Nama File    : Kendaraan.java */
/* Deskripsi    : berisi atribut dan method dalam class Kendaraan */
/* Pembuat      : Rico Aldy Kusuma / 24060123120041 */
/* Tanggal      : 27 Ferbuari 2025 */

public class Kendaraan {
    // Atribut
    private String noPlat;
    private String Jenis;
    
    // Method

    // Koonstruktor tanpa parameter
    public Kendaraan() {
        this.noPlat = "";
        this.Jenis = "";
    }
    
    // Konstruktor dengan parameter
    public Kendaraan(String noPlat, String Jenis) {
        this.noPlat = noPlat;
        this.Jenis = Jenis;
    }
    
    // Getter dan Setter
    public String getnoPlat() {
        return noPlat;
    }
    
    public String getJenis() {
        return Jenis;
    }
    
    public void setnoPlat(String noPlat) {
        this.noPlat = noPlat;
    }
    
    public void setJenis(String Jenis) {
        this.Jenis = Jenis;
    }

    public void printDetail() {
        System.out.println(Jenis + " dengan plat nomor " + noPlat);
    }
}
