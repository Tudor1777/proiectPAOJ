package main.classes;

public class Angajat extends  Utilizator{
    private String departament;
    private int salariu;
    public Angajat(String nume, String prenume, String CNP, String email, String departament, int salariu) {
        super(nume, prenume, CNP, email);
        this.departament = departament;
        this.salariu = salariu;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public int getSalariu() {
        return salariu;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }
}
