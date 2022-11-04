package model;

public class Szesciokat extends Figure {
    String name;
    int bok1;
    int bok2;
    int bok3;
    int bok4;
    int bok5;
    int bok6;

    int obwod;

    public Szesciokat(int bok1, int bok2, int bok3, int bok4, int bok5, int bok6) {
        this.bok1 = bok1;
        this.bok2 = bok2;
        this.bok3 = bok3;
        this.bok4 = bok4;
        this.bok5 = bok5;
        this.bok6 = bok6;
    }

    public Szesciokat() {
    }

    public int getBok1() {
        return bok1;
    }

    public void setBok1(int bok1) {
        this.bok1 = bok1;
    }

    public int getBok2() {
        return bok2;
    }

    public void setBok2(int bok2) {
        this.bok2 = bok2;
    }

    public int getBok3() {
        return bok3;
    }

    public void setBok3(int bok3) {
        this.bok3 = bok3;
    }

    public int getBok4() {
        return bok4;
    }

    public void setBok4(int bok4) {
        this.bok4 = bok4;
    }

    public int getBok5() {
        return bok5;
    }

    public void setBok5(int bok5) {
        this.bok5 = bok5;
    }

    public int getBok6() {
        return bok6;
    }

    public void setBok6(int bok6) {
        this.bok6 = bok6;
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
