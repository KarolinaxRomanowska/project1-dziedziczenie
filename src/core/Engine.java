package core;

import gui.Gui;
import model.Side;
import model.TrojkatRoznoboczny;

import java.util.Scanner;

public class Engine {
    public static void start(){

        final Scanner scanner = new Scanner(System.in);
        int[][] tab = new int[5][6];

        for ( int i=0; i<5;++i) {
            System.out.println("Podaj długości boków oddzielone spacjami: ");
            var readLine = scanner.nextLine();
            var scannerLine = new Scanner(readLine);

            for(int j=0; j<6 && scannerLine.hasNext(); ++j){
                int z = scannerLine.nextInt();
                tab[i][j]=z;
            }
            //System.out.println(tab[0][0]+","+tab[0][1]+","+tab[0][2]+","+tab[0][3]+","+tab[0][4]+","+tab[0][5]);

        }
        Gui.whatFigure(tab);
        System.out.println();

    }

}
