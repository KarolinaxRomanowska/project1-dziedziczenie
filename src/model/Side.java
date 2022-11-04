package model;

public class Side {
    private Integer bok1;
    private Integer bok2;
    private Integer bok3;
    private Integer bok4;
    private Integer bok5;
    private Integer bok6;

    public Side(Integer bok1, Integer bok2, Integer bok3) {
        this.bok1 = bok1;
        this.bok2 = bok2;
        this.bok3 = bok3;
    }

    public Side(Integer bok1, Integer bok2, Integer bok3, Integer bok4) {
        this(bok1,bok2,bok3);
        this.bok4 = bok4;
    }

    public Side(Integer bok1, Integer bok2, Integer bok3, Integer bok4, Integer bok5) {
        this(bok1,bok2,bok3,bok4);
        this.bok5 = bok5;
    }

    public Side(Integer bok1, Integer bok2, Integer bok3, Integer bok4, Integer bok5, Integer bok6) {
        this(bok1,bok2,bok3,bok4,bok5);
        this.bok6 = bok6;
    }

    public Integer getBok1() {
        return bok1;
    }

    public void setBok1(Integer bok1) {
        this.bok1 = bok1;
    }

    public Integer getBok2() {
        return bok2;
    }

    public void setBok2(Integer bok2) {
        this.bok2 = bok2;
    }

    public Integer getBok3() {
        return bok3;
    }

    public void setBok3(Integer bok3) {
        this.bok3 = bok3;
    }

    public Integer getBok4() {
        return bok4;
    }

    public void setBok4(Integer bok4) {
        this.bok4 = bok4;
    }

    public Integer getBok5() {
        return bok5;
    }

    public void setBok5(Integer bok5) {
        this.bok5 = bok5;
    }

    public Integer getBok6() {
        return bok6;
    }

    public void setBok6(Integer bok6) {
        this.bok6 = bok6;
    }
}
