package model;

public class Prostokat extends Czworokat {
    int pole;

    public void pole(){
        if (bok1!=bok2){
            this.pole = bok1*bok2;
        } else{
            this.pole = bok1*bok3;
        }

    }

    public Prostokat(int bok1, int bok2, int bok3, int bok4) {
        super(bok1, bok2, bok3, bok4);
    }

    public Prostokat() {
        super();
    }

    public int getPole() {
        return pole;
    }

    public void setPole(int pole) {
        this.pole = pole;
    }
}
