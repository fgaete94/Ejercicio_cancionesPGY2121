/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioEventos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 *
 * @author pipeg
 * @version 20-09-23
 */
public class ListaEvento {
    
    private ArrayList <Evento> listaEvento;

    public ListaEvento() {
        listaEvento = new ArrayList<>();
        
    }
    
    //agregar a la lista
    
    public boolean agregarLista(Evento event){
        return listaEvento.add(event);
    }
    
    //total vendido evento
    
    public void ventaEvento(){
        int venta=0, tot=0;
        for (Evento evento : listaEvento) {
            venta= evento.getCantidadPersonas()*evento.getPrecio();
            tot=tot+venta;
        System.out.println("El total vendido en este  tipo de evento es de: $"+tot);
            
        }
    }
    
    //Tamaño de la lista
    
    public int tamañoLista(){
       return listaEvento.size();
    }
    
    //ordenar
    
    public void ordenar(){
        listaEvento.sort((evento1, evento2) -> evento1.getFechaIni().compareTo(evento2.getFechaIni()));
    }

    @Override
    public String toString() {
        return "ListaEvento{" + listaEvento + '}';
    }
            

    
}
