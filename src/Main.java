
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pipeg
 */
public class Main {
    public static void main(String[] args) {
        
        Cancion cancion1 = new Cancion();
        Cancion cancion2 = new Cancion("nena", "Marama", 250, false, 'N');
        Cancion cancion3 = new Cancion("narcicista excelencia", "pxdx", 300, true, 'S');
        Cancion cancion4 = new Cancion("Gasolina", "Daddy Yankey", 230, false, 'N');
        Cancion cancion5 = new Cancion("por ella", "guffi", 245, true, 'S');
        Cancion cancion6 = new Cancion("salio el sol", "don omar", 180, false, 'N');
        
        Lista lista= new Lista();
        
        cancion1.setArtista("Coldplay");
        cancion1.setTitulo("Yellow");
        cancion1.setDuracion(310);
        cancion1.setDescargada('S');
        cancion1.setFavorita(true);
        
        
        
        lista.agregaraLista1(cancion1);
        lista.agregaraLista1(cancion3);
        lista.agregarLista2(cancion4);
        lista.agregarLista2(cancion2);
        lista.agregaraLista1(cancion5);
        lista.agregarLista2(cancion6);
        
        Scanner leer = new Scanner (System.in);
        int opcion;
        
        do {            
            System.out.println("Listas de Canciones");
            System.out.println("1. Rock");
            System.out.println("2. Reggeton");
            System.out.println("3. Salir");
            
            opcion= leer.nextInt();
            
            switch (opcion){
                case 1:
                    lista.lista1();
                    break;
                    
                case 2:
                    lista.lista2();
                    break;
                    
                case 3:
                    System.out.println("Haz Salido");
                    break;
                    
            }
        } while (opcion!=3);
        
        
        
        
    }
    
}
