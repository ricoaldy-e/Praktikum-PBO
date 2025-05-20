// Nama       : Rico Aldy Kusuma
// NIM        : 24060123120041
// File       : PersonDAO.java
// Deskripsi  : interface untuk person access object

import java.sql.Connection;
import java.sql.DriverManager;

public interface  PersonDAO {
    public void savePerson(Person p) throws Exception;
}