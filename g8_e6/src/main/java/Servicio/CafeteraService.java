package Servicio;

import Entidad.Cafetera;
import java.util.Scanner;
import java.util.concurrent.RecursiveTask;

/**
 *
 * @author jpc
 */
public class CafeteraService {
    
    Scanner entrada = new Scanner(System.in);
    
    public void llenarCafetera(Cafetera caf){
        caf.setCantidadActual(caf.getCapacidadMaxima());
    }
    
    public void servirTaza(Cafetera caf){
        System.out.println("¿Tamaño del café?: ");
        System.out.println("1. Chico");
        System.out.println("2. Mediano");
        System.out.println("3. Grande");
        int op = entrada.nextInt();
        switch(op){
            case 1:
                if(caf.getCantidadActual()>120){
                    caf.setCantidadActual(caf.getCantidadActual()-120);
                    System.out.println("¡Disfrute su café!");
                    System.out.println("Quedan: "+caf.getCantidadActual()+" ml.");
                }else{
                    System.out.println("Ya no hay suficiente café :(");
                    System.out.println("Solo se sirvieron "+caf.getCantidadActual()+" ml.");
                }
                break;
            case 2:
                if(caf.getCantidadActual()>120){
                    caf.setCantidadActual(caf.getCantidadActual()-240);
                    System.out.println("¡Disfrute su café!");
                    System.out.println("Quedan: "+caf.getCantidadActual()+" ml.");
                }else{
                    System.out.println("Ya no hay suficiente café :(");
                    System.out.println("Solo se sirvieron "+caf.getCantidadActual()+" ml.");
                }
                break;
            case 3:
                if(caf.getCantidadActual()>120){
                    caf.setCantidadActual(caf.getCantidadActual()-400);
                    System.out.println("¡Disfrute su café!");
                    System.out.println("Quedan: "+caf.getCantidadActual()+" ml.");
                }else{
                    System.out.println("Ya no hay suficiente café :(");
                    System.out.println("Solo se sirvieron "+caf.getCantidadActual()+" ml.");
                }
                break;
            default:
                System.out.println("Selección incorrecta");
                break;
        }
    }
    
    public void vaciarCafetera(Cafetera caf){
        caf.setCantidadActual(0);
        System.out.println("Se vacio la cafetera");
        System.out.println("(VACIAR) Cantidad actual: "+caf.getCantidadActual());
    }
    
    public void agregarCafe(Cafetera caf){
        System.out.println("¿Cuanto café se va a agregar?: ");
        int add = entrada.nextInt();
        caf.setCantidadActual(add);
        System.out.println("(AGREGAR) Cantidad actual: "+caf.getCantidadActual());
    }
}
