/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioEventos;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author pipeg
 * @version 20-09-23
 */
public class Main {
    
    public static void main(String[] args) {
        int codigo,horaini,horater,precio,cantidadPersonas,opcion;
        String ubicacion,fecha;
        char tipoevent; //A.- cumpleaños B.-matrimonio C.- cena d.-fiesta
        boolean entretencion;
        
        Evento eve = new Evento();
        ListaEvento lista = new ListaEvento();
        
        Scanner leer = new Scanner(System.in);
        do {            
            System.out.println("1.- Agregar Evento");
            System.out.println("2.-Ver Ventas por tipo Evento");
            System.out.println("3.- Ver Eventos mas solicitados");
            System.out.println("4.- Salir");
            opcion=leer.nextInt();
            
            switch (opcion) {
                case 1:
                    
                    break;
            }
        } while (opcion!=4);
    }
    
    
}
