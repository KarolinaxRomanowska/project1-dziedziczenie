package model;

public class Kwadrat extends Prostokat {

    @Override
    public void pole() {
            this.pole = bok1*bok2;
    }

    public Kwadrat(int bok1, int bok2, int bok3, int bok4) {
        super(bok1, bok2, bok3, bok4);
    }

    public Kwadrat() {
        super();
    }
}
