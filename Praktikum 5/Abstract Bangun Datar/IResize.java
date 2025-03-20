/* Nama File    : IResize.java */
/* Deskripsi    : berisi deklarasi method untuk mengubah ukuran objek */
/* Pembuat      : Rico Aldy Kusuma / 24060123120041 */
/* Tanggal      : 20 Maret 2025 */

public interface IResize {
    public void zoomIn();
    public void zoomOut();
    public void zoom(int percent);

    /* 
        Keuntungan saat method zoomIn(), zoomOut(), dan zoom() dikemas dalam interface IResize 
        dibanding dijadikan sebagai abstract method dalam class BangunDatar:
        1.  Fleksibilitas → Interface bisa diimplementasikan oleh berbagai class yang tidak harus berkaitan secara langsung 
            (misalnya, class Garis atau Bangun3D juga bisa menggunakan IResize tanpa harus menjadi subclass BangunDatar).
        2.  Tidak Memaksa Pewarisan → Jika zoomIn() dan zoomOut() dimasukkan ke dalam BangunDatar sebagai abstract method, 
            maka semua bangun datar harus memiliki kemampuan untuk di-zoom, padahal tidak semua bentuk memerlukannya. 
            Dengan interface, hanya class yang memang butuh fitur ini yang mengimplementasikannya.
        3.  Memisahkan Tanggung Jawab (Separation of Concerns) 
            BangunDatar hanya fokus pada perhitungan luas dan keliling, 
            sedangkan IResize menangani perubahan ukuran objek.
    */
}
