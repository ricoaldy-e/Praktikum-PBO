// Nama     : Rico Aldy Kusuma
// NIM      : 24060123120041
/**
 * File      : AngkaSialException.java
 * Deskripsi : Eksepsi buatan sendiri, menolak angka 13!
 *
 */

public class AngkaSialException extends Exception{
    public AngkaSialException(){
        super("Jangan memasukkan angka 13 karena itu sebuah angka sial !!!");
    }
}
