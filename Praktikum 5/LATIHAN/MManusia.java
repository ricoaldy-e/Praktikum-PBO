/* Nama File    : MManusia.java */
/* Deskripsi    : Class MManusia merupakan class yang digunakan untuk menguji class yang telah dibuat */
/* Pembuat      : Rico Aldy Kusuma / 24060123120041 */
/* Tanggal      : 24 Maret 2025 */

public class MManusia {
    public static void main(String[] args) {
        PNS p1 = new PNS("Satriyo", "2006-04-01", "Jl. Seroja", 15000000, "198302032006041002");
        Pengusaha pe1 = new Pengusaha("Adhy", "2000-01-01", "Jl.Air", 55000000, "000-556-773-212-000-5");
        Petani pt1 = new Petani("Nugraha", "1977-09-01", "Jl. Bunga 9 Tembalang", 5000000, "wonogiri");
        PNS p2 = new PNS("Panji", "2010-04-01", "Jl. Panorama 111 Tembalang", 10000000, "198004212010041002");
        
        System.out.println("Jumlah Manusia          = " + Manusia.getCounterMns());
        System.out.println("Jumlah PNS              = " + PNS.getCounterPNS());
        System.out.println("Jumlah Pengusaha        = " + Pengusaha.getCounterPengusaha());
        System.out.println("Jumlah Petani           = " + Petani.getCounterPetani());
        
        System.out.println("Pajak PNS p1            = " + p1.hitungPajak());
        System.out.println("Pajak Pengusaha pe1     = " + pe1.hitungPajak());
        System.out.println("Pajak Petani pt1        = " + pt1.hitungPajak());
        
        System.out.println("Masa Kerja p1           = " + p1.hitungMasaKerja());
        System.out.println("Masa Kerja pe1          = " + pe1.hitungMasaKerja());
        System.out.println("Masa Kerja pt1          = " + pt1.hitungMasaKerja());
        System.out.println("Masa Kerja p2           = " + p2.hitungMasaKerja());
        
        p1.cetakInfo();
        pe1.cetakInfo();
        pt1.cetakInfo();
        p2.cetakInfo();
    }
}
