package model;

public class Yonetici {
    private int id;
    private String name;
    private String surname;
    private String passw;

    public Yonetici(int id, String name, String surname, String passw) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.passw = passw;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassw() {
        return passw;
    }

    public void setPassw(String passw) {
        this.passw = passw;
    }
}