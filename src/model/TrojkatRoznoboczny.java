package model;

public class TrojkatRoznoboczny extends Figure {
    String name;
    int bok1;
    int bok2;
    int bok3;
    int obwod;
    double pole;

    public void pole () {
        double p = (bok1+bok2+bok3)/2;
        double pole = Math.abs(p*(p-bok1)*(p-bok2)*(p-bok3));
        this.pole = pole;
    }
    public TrojkatRoznoboczny(int bok1, int bok2, int bok3) {
        this.bok1 = bok1;
        this.bok2 = bok2;
        this.bok3 = bok3;
        this.obwod = bok1+bok2+bok3;
    }

    public TrojkatRoznoboczny() {
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

    public double getPole() {
        return pole;
    }

    public void setPole(double pole) {
        this.pole = pole;
    }
}
