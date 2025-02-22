/* Nama File    : MTitik.java */
/* Deskripsi    : berisi program utama untuk memanggil penggunaan fungsi class Titik */
/* Pembuat      : Rico Aldy Kusuma / 24060123120041 */
/* Tanggal      : 20 Ferbuari 2025 */

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik(); // Membuat objek titik T1 (0, 0)
        T1.setAbsis(3); // Mengubah absis T1 dengan nilai 3
        T1.setOrdinat(4); // Mengubah ordinat T1 dengan nilai 4
        System.out.println("Titik T1: ");
        T1.printTitik(); // Mencetak koordinat T1 ke layar
        T1.geser(3, 4); // Menggeser T1 sejauh (3, 4)
        System.out.println("Titik T1 setelah digeser: ");
        T1.printTitik(); // Mencetak koordinat ke layar
        System.out.println();

        Titik T2 = T1;
        System.out.println("Titik T2 yang mengacu ke T1: ");
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        System.out.println("Titik T1 setelah diubah koordinat absis: ");
        T2.printTitik();
        System.out.println();

        Titik T3 = new Titik(); // Membuat objek titik T3 (0, 0)
        Titik T4 = new Titik(3, 5); // membuat objek titik T4 (3, 5)
        System.out.println("Titik T3: ");
        T3.printTitik();
        System.out.println("Titik T4: ");
        T4.printTitik();
        System.out.println();

        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik()); // Jumlah objek titik hanya 3 karena T2 itu dia hanya mengacu ke T1 bukan sebuah titik asli.
        System.out.println();

        // Memanggil fungsi getKuadran, getJarakPusat, dan getJarak
        System.out.println("Titik T1: ");
        T1.printTitik();
        System.out.println("Kuadran T1: " + T1.getKuadran());
        System.out.println("Jarak T1 ke pusat: " + T1.getJarakPusat());
        System.out.println("Jarak antara T1 dan T4: " + T1.getJarak(T4));
        System.out.println();

        // Memanggil fungsi refleksiX dan refleksiY
        T1.refleksiX();
        System.out.println("Titik T1 setelah refleksi terhadap sumbu X: ");
        T1.printTitik();

        T1.refleksiY();
        System.out.println("Titik T1 setelah refleksi terhadap sumbu Y: ");
        T1.printTitik();

        // Memanggil fungsi getRefleksiX dan getRefleksiY
        Titik newT1X = T1.getRefleksiX();
        System.out.println("Titik T1 baru refleksi terhadap sumbu X: ");
        newT1X.printTitik();

        Titik newT1Y = T1.getRefleksiY();
        System.out.println("Titik T1 baru refleksi terhadap sumbu Y: ");
        newT1Y.printTitik();
    }
}
