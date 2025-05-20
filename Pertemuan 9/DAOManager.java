/**
 * Nama      : Rico Aldy Kusuma
 * NIM       : 24060123120041
 * File      : DAOManager.java
 * Deskripsi : Pengelola DAO dalam program
 */

public class DAOManager{
    private PersonDAO personDAO;

    public void setPersonDAO(PersonDAO person){
        personDAO = person;
    }

    public PersonDAO getPersonDAO(){
        return personDAO;
    }
}
