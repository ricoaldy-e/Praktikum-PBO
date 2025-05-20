// Nama      : Rico Aldy Kusuma
// NIM       : 24060123120041
// File      : Person.java
// Deskripsi : Person database model

public class Person {
    private int id;
    private String name;

    public Person(String n) {
        name = n;
    }

    public Person(int i, String n) {
        id = i;
        name = n;
    }

    public int getid() {
        return id;
    }

    public String getName() {
        return name;
    }
}