package model;

public class SzesciokatForemny extends Szesciokat {
    double pole;

    public void pole() {
        this.pole = (3 * (bok1*bok1) * Math.abs(3)) / 2;
    }

    public SzesciokatForemny(int bok1, int bok2, int bok3, int bok4, int bok5, int bok6) {
        super(bok1, bok2, bok3, bok4, bok5, bok6);
    }

    public SzesciokatForemny() {
        super();
    }

    public double getPole() {
        return pole;
    }

    public void setPole(double pole) {
        this.pole = pole;
    }
}
