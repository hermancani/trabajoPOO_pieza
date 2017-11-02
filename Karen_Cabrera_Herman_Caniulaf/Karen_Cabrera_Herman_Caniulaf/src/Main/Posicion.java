package Main;

public class Posicion {

    private int x;
    private int y;
    private String tablero[][];

    public Posicion(int x, int y) {
        this.x = x + 1;
        this.y = y + 1;
        this.tablero = new String[this.y][this.x];
    }

    public String[][] getTablero() {
        return tablero;

    }

    public void setTablero(String[][] tablero) {
        this.tablero = tablero;
    }

    public void crearTabla() {
        for (int y = 0; y < this.y; y++) {
            for (int x = 0; x < this.x; x++) {
                System.out.print(this.tablero[y][x] = "-");
            }
        }
        System.out.println();

        for (int y = 0; y < this.y; y++) {
            for (int x = 0; x < this.x; x++) {
                if (y == 0 && x == 0) {
                    this.tablero[y][x] = "f/c";
                } else {
                    this.tablero[y][x] = " -";
                }
                if (y == 0 && x > 0) {
                    this.tablero[y][x] = String.valueOf("0" + (x - 1));
                }

                if (x == 0 && y > 0) {
                    this.tablero[y][x] = String.valueOf("0" + (y - 1));
                }
            }
        }

        for (int y = 0; y < this.y; y++) {
            for (int x = 0; x < this.x; x++) {
                System.out.print(this.tablero[y][x] + " ");
            }
            System.out.println();
        }
        for (int y = 0; y < this.y; y++) {
            for (int x = 0; x < this.x; x++) {
                System.out.print(this.tablero[y][x] = "-");
            }
        }
        System.out.println();

        int areaTablero = x * y;
        int porGatos = areaTablero * 10 / 100;
        int porRatones = areaTablero * 25 / 100;
    }
}
