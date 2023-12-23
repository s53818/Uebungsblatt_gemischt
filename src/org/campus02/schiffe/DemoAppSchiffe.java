package org.campus02.schiffe;

import java.util.Arrays;

public class DemoAppSchiffe
{
    public static void main(String[] args)
    {
        int[][] map = new int[8][10];

        map[0][3]=2;
        map[0][5]=1;
        map[0][6]=1;

        map[1][1]=3;
        map[1][2]=-1;
        map[1][3]=2;
        map[1][7]=2;

        map[2][1]=3;
        map[2][2]=-1;
        map[2][4]=4;
        map[2][5]=4;
        map[2][8]=2;
        map[2][9]=2;

        map[3][2]=2;

        map[4][0]=-1;
        map[4][2]=2;
        map[4][4]=-1;
        map[4][5]=2;
        map[4][6]=2;

        map[5][0]=-3;
        map[5][1]=1;
        map[5][4]=-3;
        map[5][6]=-1;
        map[5][9]=3;

        map[6][3]=-3;
        map[6][7]=-1;
        map[6][9]=3;

        map[7][2]=-2;
        map[7][4]=-2;
        map[7][6]=-2;

        BattleShipMap bsm = new BattleShipMap(map);
        System.out.println();
        System.out.println("Spieler A: "+bsm.totalBattleShipStrength('A'));
        System.out.println("Spieler B: "+bsm.totalBattleShipStrength('B'));
        System.out.println();
        System.out.println("Alle Schiffe: " + bsm.totalCountBattleShips());
        System.out.println();
        System.out.println("Schiffe pro Zeile: " + Arrays.toString(bsm.countOfShipsPerLine()));
        System.out.println();
        System.out.println("Durchschnittliche Schiffstärke von Player A: " + bsm.averageShipStrengthPlayerA());
    }
}
