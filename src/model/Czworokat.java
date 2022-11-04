package model;

import java.io.InterruptedIOException;

public class Czworokat extends Figure {
    String name;
    int bok1;
    int bok2;
    int bok3;
    int bok4;
    int obwod;

    public Czworokat(int bok1, int bok2, int bok3, int bok4) {
        this.bok1 = bok1;
        this.bok2 = bok2;
        this.bok3 = bok3;
        this.bok4 = bok4;
        this.obwod = bok1+bok2+bok3+bok4;
    }

    public Czworokat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getObwod() {
        return obwod;
    }

    public void setObwod(int obwod) {
        this.obwod = obwod;
    }
}
