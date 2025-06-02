/**
 * Nama     : Rico Aldy Kusuma
 * NIM      : 24060123120041
 * Tanggal  : 2 Juni 2025
 * File     : DiskonLambda.java
 * Deskripsi: Ekspresi lambda dasar, digunakan untuk menghitung diskon.
 */

interface IDiskon{
    public double hitungDiskon(int harga);
}

public class DiskonLambda {
    public static void main(String[] args) {
        //tanpa lambda
        IDiskon diskonMerdeka = new IDiskon(){
            public double hitungDiskon(int harga){
                return harga - (harga * 0.3);
            }
        };

        //dengan lambda
        IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4);

        //dengan lambda dengan blok statement
        IDiskon diskonBiasa = (harga) -> {
            return harga - (harga * 0.1);
        };

        System.out.println("Diskon Merdeka: "+diskonMerdeka.hitungDiskon(450000));
        System.out.println("Diskon Lebaran: "+diskonLebaran.hitungDiskon(450000));
        System.out.println("Diskon Biasa: "+diskonBiasa.hitungDiskon(450000));
    }
}

// b. Compile dan jalankan kode tersebut ! 
//    Dapatkah anda membedakan antara bagaimana diskonLebaran dan diskonBiasa diimplementasikan ?
        // Jawaban:
        // Ya, perbedaannya terletak pada bentuk penulisan lambda-nya. 
        // DiskonLebaran menggunakan lambda ekspresi satu baris tanpa blok kode dan tanpa return secara eksplisit, 
        // karena hanya terdiri dari satu pernyataan. 
        // Sedangkan diskonBiasa menggunakan lambda dengan blok statement, 
        // yang ditulis dengan tanda kurung kurawal dan kata kunci return. 
        // Keduanya sama-sama menghasilkan nilai, tetapi cara penulisannya berbeda tergantung kompleksitas logika.
