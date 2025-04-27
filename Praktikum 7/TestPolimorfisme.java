/* Nama File    : TestPolimorfisme.java */
/* Deskripsi    : Class TestPolimorfisme merupakan class utama untuk pemanggilan class lain */
/* Pembuat      : Rico Aldy Kusuma / 24060123120041 */
/* Tanggal      : 27 April 2025 */

import java.util.ArrayList;

public class TestPolimorfisme {
    public static void main(String[] args) {

        Pegawai pegawai1 = new Programmer("Mira");
        Pegawai pegawai2 = new Manager("Joko");
        Pegawai pegawai3 = new Manager("Argo");

        ArrayList<Pegawai> emps = new ArrayList<>();
        emps.add(pegawai1);
        emps.add(pegawai2);
        emps.add(pegawai3);

        for (Pegawai emp : emps) {
            emp.tampilData();
        }
    }

    // 2. Jelaskan manfaat polimorfisme pada kasus ini.
    // Jawab :  Polimorfisme memungkinkan objek dari kelas berbeda seperti Programmer dan Manager diperlakukan sebagai objek dari kelas Pegawai.
    //          Dengan begitu, semua objek dapat disimpan dalam satu ArrayList<Pegawai>, dan cukup menggunakan satu perulangan untuk memanggil method tampilData(),
    //          tanpa perlu tahu tipe spesifiknya. Hal ini membuat kode lebih sederhana, fleksibel, dan memudahkan penambahan jenis pegawai baru tanpa harus banyak 
    //          mengubah kode di program utama.


    // 3. Apabila pada main program perlu menambahkan pegawai4 dan pegawai5! Apa permasalahan yang muncul jika diterapkan tanpa polimorfisme (inclusion)?
    // Jawab :  Jika tanpa polimorfisme, setiap tipe pegawai harus disimpan dalam variabel atau array yang berbeda. Saat ingin menampilkan data, 
    //          program harus melakukan pengecekan tipe objek menggunakan if-else, yang membuat kode menjadi panjang, sulit dibaca, dan rentan kesalahan.
    //          Selain itu, jika ada penambahan jenis pegawai baru, program utama harus diubah banyak bagian, sehingga tidak efisien dan menyulitkan pemeliharaan program.
}
