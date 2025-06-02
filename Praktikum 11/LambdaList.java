import java.util.ArrayList;

/**
 * Nama     : Rico Aldy Kusuma
 * NIM      : 24060123120041
 * Tanggal  : 2 Juni 2025
 * File     : LambdaList.java
 * Deskripsi: Implementasi lambda pada List, digunakan sebagai parameter
 *            pada method.
 */

public class LambdaList {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");

        //lambda digunakan sebagai parameter
        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}