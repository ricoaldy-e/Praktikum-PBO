// Nama     : Rico Aldy Kusuma
// NIM      : 24060123120041
// Tanggal  : 23 Mei 2025
// File     : MysqlUtility.java
// Deskripsi: Utility class untuk membuat dan mengelola koneksi JDBC ke database MySQL.
//            Digunakan oleh service seperti MysqlMahasiswaService untuk menjalankan query.

package jdbc.utilities;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class MysqlUtility {

    private static Connection koneksi;

    /**
     *
     * @return
     */
    public static Connection getConnection() {
        if (koneksi == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver"); 
                String url = "jdbc:mysql://localhost:3306/pbo";
                String user = "root";
                String password = "";
                koneksi = DriverManager.getConnection(url, user, password);
                if (koneksi != null) {
                    System.out.println("Koneksi berhasil");
                }
            } catch (ClassNotFoundException cne) {
                System.out.println("Gagal load driver : " + cne.getMessage());
            } catch (SQLException sqle) {
                System.out.println("Gagal Koneksi : " + sqle.getMessage());
            }
        }
        return koneksi;
    }
}
