package Main;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        boolean hayError;

        System.out.println("----------------------------------");
        System.out.println("Bienvenido al creador de planos");
        System.out.println("----------------------------------");
        System.out.println("Regla: todo lo que sea coordenada");
        System.out.println("Se debe ingresar separado por una");
        System.out.println("coma, EJ: 1,4");
        System.out.println("----------------------------------");
        System.out.print("ingrese ancho y alto de la pieza: ");
        String pieza = m.nextLine();

        String piezaArray[] = pieza.split(",");
        int x = Integer.parseInt(piezaArray[0]);
        int y = Integer.parseInt(piezaArray[1]);
        
        if(y>20 || x>20){
            hayError=true;
        }else{
            hayError=false;
        }
        if(y<=0 || y>20 || x<=0 || x>20){
            System.out.println("Solo se admiten valores Positivos entre 0-20");
        }
        Posicion posicion = new Posicion(x, y);
        posicion.crearTabla();

        Gato gato = new Gato(x, y);
        gato.ingrearGato();
        
        
        Raton raton = new Raton(x, y);
        raton.ingreseRaton();
        
//        Mueble mueble = new Mueble(x,y);
//        mueble.ingresarMueble();
        
    }
}
