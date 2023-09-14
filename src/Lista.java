
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
    private ArrayList <Cancion> listaCanciones;

    public Lista() {
        listaCanciones = new ArrayList<>();
  
    }
    
    //agregar a la lista
    public boolean agregaraLista (Cancion can){
        return listaCanciones.add(can);
    }
   
    // mostrar listas
    
    public void listarCanciones(){
        for (Cancion cancion : listaCanciones) {
            cancion.infoCancion();
            System.out.println("*******\n");
            
        }
    }

    
    
}
