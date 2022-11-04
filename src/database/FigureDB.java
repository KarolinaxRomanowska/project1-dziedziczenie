package database;

import model.Figure;

public class FigureDB {
    public Figure[] figures = new Figure [5];

    public FigureDB(){

    }

    public void addFigure(Figure figure, int i){
        this.figures[i] = figure;
    }

    public Figure[] getFigures() {
        return figures;
    }
}
