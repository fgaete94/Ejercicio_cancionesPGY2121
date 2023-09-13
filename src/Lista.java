
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pipeg
 */
public class Lista {
    private ArrayList <Cancion> listaCanciones1;
    private ArrayList <Cancion> listaCanciones2;

    public Lista() {
        listaCanciones1 = new ArrayList<>();
        listaCanciones2 = new ArrayList <>();
    }
    
    //agregar a la lista
    public boolean agregaraLista1 (Cancion can){
        return listaCanciones1.add(can);
    }
    
    public boolean agregarLista2 (Cancion can){
        return listaCanciones2.add(can);
    }
    
    // mostrar listas
    
    public void lista1(){
        for (Cancion cancion : listaCanciones1) {
            cancion.infoCancion();
            System.out.println("*******\n");
            
        }
    }
    
    public void lista2(){
        for (Cancion cancion : listaCanciones2) {
            cancion.infoCancion();
            System.out.println("*******\n");
            
        }
    }
    
}
