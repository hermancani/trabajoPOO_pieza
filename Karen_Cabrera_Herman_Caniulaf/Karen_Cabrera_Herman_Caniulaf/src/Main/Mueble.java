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

        System.out.println("Mueble N° " + (contMueble + 1) + "[Coordenada Superior Izquierda]");
        String mueble = m.nextLine();
        String muebleArray[] = mueble.split(",");
        int fi = Integer.parseInt(muebleArray[0]);
        int co = Integer.parseInt(muebleArray[1]);

        for (int y = 0; y < this.y; y++) {
            for (int x = 0; x < this.x; x++) {
                if (y == fi && x == co) {
                    this.mueble[y][x] = " M";
                }
            }
        }
    }
}
