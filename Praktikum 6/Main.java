/* Nama File    : Main.java */
/* Deskripsi    : Class Main merupakan class utama yang digunakan untuk menguji implementasi berbagai jenis ruangan */
/* Pembuat      : Rico Aldy Kusuma / 24060123120041 */
/* Tanggal      : 27 Maret 2025 */

import java.util.List;

public class Main {
    public static void main(String[] args) {
        RuangKelas kelas1 = new RuangKelas("RK101", 10, 8, 3, 40, 40, 10, 2000);
        LabKomputer labKom1 = new LabKomputer("LB201", 12, 10, 4, 30, "Lab Komputer 1", 50000, 20, 2000);
        LabNonKomputer labNonKom1 = new LabNonKomputer("LB301", 15, 12, 4, 25, "Lab Biologi", 70000, List.of("Genetika, Reproduksi"), 2000);
        RuangDepartemen ruangDept1 = new RuangDepartemen("RD401", 8, 6, 3, 10, 10, 20, 4, "Informatika", "Dr. Siti", 3000);
        RuangDosen ruangDosen1 = new RuangDosen("RD501", 6, 5, 3, 1, "Dr. Budi", 1, 2, 3000);

        kelas1.tampilkanInfo();
        System.out.println();
        labKom1.tampilkanInfo();
        System.out.println();
        labNonKom1.tampilkanInfo();
        System.out.println();
        ruangDept1.tampilkanInfo();
        System.out.println();
        ruangDosen1.tampilkanInfo();

        System.out.println("\n===== Statistik Ruangan =====");
        System.out.println("Total Ruang Kelas         : " + RuangKelas.totalRuangKelas);
        System.out.println("Total Lab Komputer        : " + LabKomputer.totalLabKomputer);
        System.out.println("Total Lab Non-Komputer    : " + LabNonKomputer.totalLabNonKomputer);
        System.out.println("Total Ruang Departemen    : " + RuangDepartemen.totalRuangDepartemen);
        System.out.println("Total Ruang Dosen         : " + RuangDosen.totalRuangDosen);
        System.out.println("Total Semua Ruangan       : " + Ruang.totalRuangan);
    }
}
