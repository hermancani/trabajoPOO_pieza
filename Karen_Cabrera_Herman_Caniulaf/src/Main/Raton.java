package Main;

import java.util.Scanner;

public class Raton {

    private int x;
    private int y;
    private String[][] raton;

    public Raton(int x, int y) {
        this.x = x + 1;  
        this.y = y + 1;
        this.raton = new String[this.y][this.x];
    }

    public String[][] getRaton() {
        return raton;
    }

    public void setRaton(String[][] Raton) {
        this.raton = raton;
    }

    public void ingreseRaton() {
        Scanner r = new Scanner(System.in);
        int contRaton = 0;
        int raton;
        int areaTablero = x * y;
        int proRaton = areaTablero * 25 / 100;

        System.out.println("Solo se puede ingresar [" + proRaton + "] raton como maximo");
        System.out.print("N° de raton: ");
        raton = Integer.parseInt(r.nextLine());
        if (raton > proRaton) {
            System.out.println("LIMITE SUPERADO");
        } else if (raton < 0) {
            System.out.println("Solo se admiten valores Positivos entre 0-20");
        }


        while (raton > contRaton) {
            if(raton < contRaton){
                break;
            }
            System.out.println("-------------------------");
            System.out.println("RATON N° " + (contRaton + 1));
            System.out.println("-------------------------");
            System.out.print("ingrese Filas y Columna separada por un espacio: ");
            String fc = r.nextLine();

            String fcArray[] = fc.split(",");
            int fi = Integer.parseInt(fcArray[0]);
            int co = Integer.parseInt(fcArray[1]);

            int fil = fi + 1;
            int col = co + 1;
            for (int y = 0; y < this.y; y++) {
                for (int x = 0; x < this.x; x++) {
                    System.out.print(this.raton[y][x] = "-");
                }
            }
            System.out.println();

            for (int y = 0; y < this.y; y++) {
                for (int x = 0; x < this.x; x++) {
                    if (y == 0 && x == 0) {
                        this.raton[y][x] = "f/c";
                    } else { 
                        this.raton[y][x] = " -";
                    }
                    if (y == 0 && x > 0) {
                        this.raton[y][x] = String.valueOf("0" + (x - 1));
                    }

                    if (x == 0 && y > 0) {
                        this.raton[y][x] = String.valueOf("0" + (y - 1));
                    }
                }
            }
            for (int y = 0; y < this.y; y++) {
                for (int x = 0; x < this.x; x++) {
                    if (y == fil && x == col) {
                        this.raton[y][x] = " R";
                    }
                }
            }
            for (int y = 0; y < this.y; y++) {
                for (int x = 0; x < this.x; x++) {
                    System.out.print(this.raton[y][x] + " ");
                }
                System.out.println();
            }
            for (int y = 0; y < this.y; y++) {
                for (int x = 0; x < this.x; x++) {
                    System.out.print(this.raton[y][x] = "-");
                }
            }
            System.out.println();
            contRaton++;
        }

    }
}
