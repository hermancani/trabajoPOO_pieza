package Main;

import java.util.Scanner;

public class Gato {

    private int x;
    private int y;
    private String[][] gato;

    public Gato(int x, int y) {
        this.x = x + 1;
        this.y = y + 1;
        this.gato = new String[this.y][this.x];
    }

    public String[][] getGato() {
        return gato;
    }

    public void setGato(String[][] Gato) {
        this.gato = gato;
    }

    public void ingrearGato() {
        Scanner n = new Scanner(System.in);
        int contGato = 0;
        int gatos;
        int areaTablero = x * y;
        int proGatos = areaTablero * 10 / 100;

        System.out.println("Solo se puede ingresar [" + proGatos + "] gatos como maximo");
        System.out.print("N° de gatos: ");
        gatos = Integer.parseInt(n.nextLine());
        if (gatos > proGatos) {
            System.out.println("LIMITE SUPERADO");
        } else if (gatos < 0) {
            System.out.println("Solo se admiten valores Positivos entre 0-20");
        }

        while (gatos > contGato) {
            if(gatos < contGato){
                break;
            }
            
            System.out.println("-------------------------");
            System.out.println("GATO N° " + (contGato + 1));
            System.out.println("-------------------------");
            System.out.print("ingrese Filas y Columna: ");
            String fl = n.nextLine();

            String flArray[] = fl.split(",");
            int fila = Integer.parseInt(flArray[0]);
            int columna = Integer.parseInt(flArray[1]);
            int fil = fila + 1;
            int colum = columna + 1;
            
            
            for (int y = 0; y < this.y; y++) {
                for (int x = 0; x < this.x; x++) {
                    System.out.print(this.gato[y][x] = "-");
                }
            }
            System.out.println();

            for (int y = 0; y < this.y; y++) {
                for (int x = 0; x < this.x; x++) {
                    if (y == 0 && x == 0) {
                        this.gato[y][x] = "f/c";
                    } else { 
                        this.gato[y][x] = " -";
                    }
                    if (y == 0 && x > 0) {
                        this.gato[y][x] = String.valueOf("0" + (x - 1));
                    }

                    if (x == 0 && y > 0) {
                        this.gato[y][x] = String.valueOf("0" + (y - 1));
                    }
                }
            }
            for (int y = 0; y < this.y; y++) {
                for (int x = 0; x < this.x; x++) {
                    if (y == fil && x == colum) {
                        this.gato[y][x] = " G";
                    }
                }
            }
            for (int y = 0; y < this.y; y++) {
                for (int x = 0; x < this.x; x++) {
                    System.out.print(this.gato[y][x] + " ");
                }
                System.out.println();
            }
            for (int y = 0; y < this.y; y++) {
                for (int x = 0; x < this.x; x++) {
                    System.out.print(this.gato[y][x] = "-");
                }
            }
            System.out.println();
            contGato++;
        }
        
    }
}
