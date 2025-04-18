package main.classes;

import java.time.LocalDate;


public abstract class Utilizator {
    protected String nume;
    protected String prenume;
    protected String email;
    protected String CNP;
    protected LocalDate dataNasterii;

    public Utilizator(String nume, String prenume, String CNP, String email) {
        this.nume = nume;
        this.prenume = prenume;
        this.CNP = CNP;
        this.email = email;
        this.dataNasterii = dataNasterii_din_CNP(CNP);
    }
    private LocalDate dataNasterii_din_CNP(String CNP) {
        char s = CNP.charAt(0);
        int an = Integer.parseInt(CNP.substring(1, 3));
        int luna = Integer.parseInt(CNP.substring(3, 5));
        int zi = Integer.parseInt(CNP.substring(5, 7));

        int secol;
        if (s == '1' || s == '2') secol = 1900;
        else if (s == '3' || s == '4') secol = 1800;
        else if (s == '5' || s == '6') secol = 2000;
        else throw new IllegalArgumentException("CNP invalid");

        return LocalDate.of(secol + an, luna, zi);
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCNP() {
        return CNP;
    }

    public void setCNP(String CNP) {
        this.CNP = CNP;
        this.dataNasterii = dataNasterii_din_CNP(CNP);
    }

    public LocalDate getDataNasterii() {
        return dataNasterii;
    }

    public void setDataNasterii(LocalDate dataNasterii) {
        this.dataNasterii = dataNasterii;
    }
}
