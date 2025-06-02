/**
 * Nama     : Rico Aldy Kusuma
 * NIM      : 24060123120041
 * Tanggal  : 2 Juni 2025
 * File     : LambdaMapMahasiswa.java
 * Deskripsi: Menampilkan key dan value dari Map (NIM dan nama mahasiswa)
 *            menggunakan ekspresi lambda (tanpa blok dan dengan blok statement).
 */

import java.util.HashMap;
import java.util.Map;

public class LambdaMapMahasiswa {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060123120000", "Denis Prabowo");
        mahasiswaMap.put("24060123120001", "Alocaptio Sardi");
        mahasiswaMap.put("24060123120002", "Sariono Matew");
        mahasiswaMap.put("24060123120003", "Muhammad Sumbul");

        // Lambda tanpa blok statement
        System.out.println("== Tanpa blok statement ==");
        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " + nim + " | Nama: " + nama));

        // Lambda dengan blok statement
        System.out.println("\n== Dengan blok statement ==");
        mahasiswaMap.forEach((nim, nama) -> {
            System.out.println("NIM: " + nim + " | Nama: " + nama);
        });
    }
}