package Main;

import java.util.Scanner;

public class Mueble {

    private int x;
    private int y;
    private String mueble[][];

    public Mueble(int x, int y) {
        this.x = x + 1;
        this.y = y + 1;
        this.mueble = new String[this.y][this.x];
    }

    public String[][] getMueble() {
        return mueble;
    }

    public void setMueble(String[][] mueble) {
        this.mueble = mueble;
    }

    public void ingresarMueble() {
        Scanner m = new Scanner(System.in);
        int contMueble = 0;
        System.out.println("N° de muebles");
        int mueble=Integer.parseInt(m.nextLine());
        
        while (mueble > contMueble) {
            if (mueble < contMueble) {
                break;
            }
            System.out.println("Mueble N° " + (contMueble + 1));
            
            String muebl = m.nextLine();
            String muebleArray[] = muebl.split(",");
            int fi = Integer.parseInt(muebleArray[0]);
            int co = Integer.parseInt(muebleArray[1]);
            
            int fil = fi + 1;
            int col = co + 1;
            for (int y = 0; y < this.y; y++) {
                for (int x = 0; x < this.x; x++) {
                    System.out.print(this.mueble[y][x] = "-");
                }
            }
            System.out.println();

            for (int y = 0; y < this.y; y++) {
                for (int x = 0; x < this.x; x++) {
                    if (y == 0 && x == 0) {
                        this.mueble[y][x] = "f/c";
                    } else { 
                        this.mueble[y][x] = " -";
                    }
                    if (y == 0 && x > 0) {
                        this.mueble[y][x] = String.valueOf("0" + (x - 1));
                    }

                    if (x == 0 && y > 0) {
                        this.mueble[y][x] = String.valueOf("0" + (y - 1));
                    }
                }
            }
            for (int y = 0; y < this.y; y++) {
                for (int x = 0; x < this.x; x++) {
                    if (y == fil && x == col) {
                        this.mueble[y][x] = " M";
                    }
                }
            }
            for (int y = 0; y < this.y; y++) {
                for (int x = 0; x < this.x; x++) {
                    System.out.print(this.mueble[y][x] + " ");
                }
                System.out.println();
            }
            for (int y = 0; y < this.y; y++) {
                for (int x = 0; x < this.x; x++) {
                    System.out.print(this.mueble[y][x] = "-");
                }
            }
            System.out.println();
            
            
            contMueble++;
        }
    }

}
