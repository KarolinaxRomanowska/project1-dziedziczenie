package model;

public class PieciokatForemny extends Pieciokat {
    double pole;

    public void pole() {
        this.pole = (bok1*bok1)/4 * Math.abs(25+(10*Math.abs(5)));
    }

    public PieciokatForemny(int bok1, int bok2, int bok3, int bok4, int bok5) {
        super(bok1, bok2, bok3, bok4, bok5);
    }

    public PieciokatForemny() {
        super();
    }

    public double getPole() {
        return pole;
    }

    public void setPole(double pole) {
        this.pole = pole;
    }
}
