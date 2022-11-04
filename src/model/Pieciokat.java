package model;

public class Pieciokat extends Figure {
    String name;
    int bok1;
    int bok2;
    int bok3;
    int bok4;
    int bok5;
    int obwod;

    public Pieciokat(int bok1, int bok2, int bok3, int bok4, int bok5) {
        this.bok1 = bok1;
        this.bok2 = bok2;
        this.bok3 = bok3;
        this.bok4 = bok4;
        this.bok5 = bok5;
    }

    public Pieciokat() {
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
