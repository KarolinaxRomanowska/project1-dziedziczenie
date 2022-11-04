package gui;

import database.FigureDB;
import model.*;

public class Gui {

    public static void print (Figure[] figures){
        for( Figure figure : figures){
            StringBuilder sb = new StringBuilder();
            if (figure instanceof TrojkatRoznoboczny || figure instanceof TrojkatRownoboczny || figure instanceof TrojkatRownoramienny){
                //sb.append(figure.getName).append(" ").append();
            }else if (figure instanceof Czworokat || figure instanceof Kwadrat || figure instanceof Prostokat) {

            } else if (figure instanceof Pieciokat || figure instanceof PieciokatForemny) {

            }else if (figure instanceof Szesciokat || figure instanceof SzesciokatForemny){

            }

        System.out.println(sb);
        }
    }


    public static void whatFigure (int[][] tab) {
        //StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 5; i++) {
            if (tab[i][3] == 0) {
 //
                if (tab[i][1]==tab[i][2] && tab[i][1]==tab[i][3]){
                    //System.out.println("Trójkąt równoboczny");
                    TrojkatRownoboczny triangle = new TrojkatRownoboczny(tab[i][0],tab[i][0],tab[i][0]);
                   // figureDB.addFigure(figure);
                    triangle.setName("Trójkąt równoboczny");
                    triangle.pole();
                    System.out.println((triangle.getName())+" "+triangle.getBok1()+" "+(triangle.getBok2())+" "+(triangle.getBok3())+(" ")+triangle.getObwod()+(" ")+(triangle.getPole()));
                    //return triangle;
                    //break;
                }
                else if (tab[i][0]==tab[i][1] || tab[i][0]==tab[i][2] || tab[i][1]==tab[i][2]){
                    //System.out.println("Trójkąt równoramienny");
                    TrojkatRownoramienny triangle = new TrojkatRownoramienny();
                    triangle.setName("Trójkąt równoramienny");
                    triangle.pole();
                    break;
                    //return triangle;
                } else if (tab[i][0]!=tab[i][1] && tab[i][0]!=tab[i][2] && tab[i][1]!=tab[i][2]){
                    //System.out.println("Trójkąt różnoboczny");
                    TrojkatRoznoboczny triangle = new TrojkatRoznoboczny();
                    triangle.setName("Trójkąt różnoboczny");
                    triangle.pole();
                    break;
                    //return triangle;
                }
                }else if (tab[i][4] == 0) {
                if (tab[i][0] == tab[i][1] && tab[i][0] == tab[i][2] && tab[i][0] == tab[i][3]) {
                    String figure = "Square";
                    //System.out.println("Kwadrat");
                    Kwadrat kwadrat = new Kwadrat(tab[i][0],tab[i][1],tab[i][2],tab[i][3]);
                    kwadrat.setName("Kwadrat");
                    break;
                } else {
                    String figure = "Rectangle";
                    if (tab[i][0] != tab[i][1] && tab[i][0] != tab[i][2] && tab[i][0] != tab[i][3] && tab[i][1] != tab[i][2] && tab[i][2] != tab[i][3]) {
                        //System.out.println("Czworokąt nieforemny");
                        Czworokat czworokat = new Czworokat(tab[i][0],tab[i][1],tab[i][2],tab[i][3]);
                        czworokat.setName("Czworokąt");
                        break;
                    } else{
                        //System.out.println("Prostokąt");
                        Prostokat prostokat = new Prostokat(tab[i][0],tab[i][1],tab[i][2],tab[i][3]);
                        prostokat.setName("Prostokąt");
                        break;
                    }
                }
            } else if (tab[i][5] == 0) {
                String figure = "Pentagon";
                if (tab[i][0]==tab[i][1] && tab[i][0]==tab[i][2] && tab[i][0]==tab[i][3] && tab[i][0]==tab[i][4]){
                    PieciokatForemny pieciokatForemny = new PieciokatForemny(tab[i][0],tab[i][1],tab[i][2],tab[i][3],tab[i][4]);
                    pieciokatForemny.setName("Pięciokąt foremny");
                    break;
                } else {
                    Pieciokat pieciokat = new Pieciokat(tab[i][0],tab[i][1],tab[i][2],tab[i][3],tab[i][4]);
                    pieciokat.setName("Pięciokąt");
                    break;
                }
            } else {
                String figure = "Hexagon";
                if (tab[i][0]==tab[i][1] && tab[i][0]==tab[i][2] && tab[i][0]==tab[i][3] && tab[i][0]==tab[i][4] && tab[i][0]==tab[i][5]){
                    SzesciokatForemny szesciokatForemny = new SzesciokatForemny(tab[i][0],tab[i][1],tab[i][2],tab[i][3],tab[i][4],tab[i][5]);
                    szesciokatForemny.setName("Sześciokąt foremny");
                    break;
                }else{
                    Szesciokat szesciokat = new Szesciokat(tab[i][0],tab[i][1],tab[i][2],tab[i][3],tab[i][4],tab[i][5]);
                    szesciokat.setName("Sześciokąt");
                    break;
                }
            }

        }
    }
}

