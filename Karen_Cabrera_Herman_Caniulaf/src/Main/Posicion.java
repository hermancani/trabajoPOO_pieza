package Main;

public class Posicion {

    private int x;
    private int y;
    private String tablero[][];

    /*
    aqui se xreo el constructor
     */
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

    /**
     * aca se crea la tabla o plano del largo y ancho
     */
    public void crearTabla() {
        
        for (int y = 0; y < this.y; y++) {
            for (int x = 0; x < this.x; x++) {
                System.out.print(this.tablero[y][x] = "-");
            }
        }
        System.out.println();

        for (int y = 0; y < this.y; y++) {
            for (int x = 0; x < this.x; x++) {
                if (y == 0 && x == 0) {//este sirve para colocar el f/c en la esquina superior
                    this.tablero[y][x] = "f/c";
                } else {//este es para completar adentro de las areas en blanco 
                    this.tablero[y][x] = " -";
                }
                if (y == 0 && x > 0) {//esta es para la creaciond e las columnas
                    this.tablero[y][x] = String.valueOf("0" + (x - 1));
                }

                if (x == 0 && y > 0) {//esta es para la creacion de las filas
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
