package org.campus02.schiffe;

public class BattleShipMap
{
    int[][] map;
    public BattleShipMap(int[][] map)
    {
        this.map = map;
        print();
    }

    public void print()
    {
        for (int i = 0; i < map.length; i++)
        {
            for (int j = 0; j < map[i].length; j++)
            {
                if(map[i][j]>0)
                {
                    //System.out.print(String.format("   %2d", map[i][j]));
                    System.out.printf("+%d   ", map[i][j]);
                }
                else
                {
                    System.out.printf("%2d   ", map[i][j]);
                }
            }
            System.out.println();
        }
    }

    public int totalBattleShipStrength(char player)
    {
        int sum = 0;
        for (int i = 0; i < map.length; i++)
        {
            for (int j = 0; j < map[i].length; j++)
            {
                if((player == 'A') && (map[i][j] > 0))
                {
                    sum += map[i][j];
                }
                else if ((player == 'B') && (map[i][j] < 0))
                {
                    sum += (map[i][j] * -1);
                }
            }
        }
        return sum;
    }

    public int totalCountBattleShips()
    {
        int count = 0;
        for (int i = 0; i < map.length; i++)
        {
            for (int j = 0; j < map[i].length; j++)
            {
                if(map[i][j] != 0)
                {
                    count++;
                }
            }
        }
        return count;
    }

    public int[] countOfShipsPerLine()
    {
        int[] countPerLine = new int[map.length];
        for (int i = 0; i < map.length; i++)
        {
            for (int j = 0; j < map[i].length; j++)
            {
                if(map[i][j] != 0)
                {
                   countPerLine[i]++;
                }
            }
        }
        return countPerLine;
    }

    public double averageShipStrengthPlayerA()
    {
        int count = 0;
        for (int i = 0; i < map.length; i++)
        {
            for (int j = 0; j < map[i].length; j++)
            {
                if(map[i][j] > 0)
                {
                    count++;
                }
            }
        }
        return (double) totalBattleShipStrength('A') / count;
    }
}
