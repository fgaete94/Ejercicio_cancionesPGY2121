/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioEventos;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author pipeg
 * @version 20-09-23
 */
public class Main {
    
    public static void main(String[] args) {
        int codigo,precio,cantidadPersonas,opcion;
        String ubicacion,fechaini,fechater;
        char tipoevent,entretencion; //A.- cumpleaños B.-matrimonio C.- cena d.-fiesta
        boolean flag;
        
        Evento eve = new Evento();
        ListaEvento lista1 = new ListaEvento();//cumpleaños
        ListaEvento lista2 = new ListaEvento();//mtrimonio
        ListaEvento lista3 = new ListaEvento();//cena
        ListaEvento lista4 = new ListaEvento();//fiesta
        
        
        Scanner leer = new Scanner(System.in);
        do {            
            System.out.println("1.- Agregar Evento");
            System.out.println("2.-Ver Ventas por tipo Evento");
            System.out.println("3.- Ver Eventos mas solicitados");
            System.out.println("4.- Salir");
            opcion=leer.nextInt();
            
            switch (opcion) {
                case 1:
                    codigo= eve.CodigoEvento();
                    System.out.println("evento n°: "+codigo);
                    eve.setCodigo(codigo);
                    
                    System.out.println("Ingrese ubicacion: ");
                    ubicacion = leer.next().toUpperCase();
                    eve.setUbicacion(ubicacion);
                    
                    System.out.println("Ingrese total de personas: ");
                    cantidadPersonas = leer.nextInt();
                    eve.setCantidadPersonas(cantidadPersonas);
                    
                    System.out.println("ingrese valor entrada evento: ");
                    precio=leer.nextInt();
                    eve.setPrecio(precio);  
                    
                    Date fechaI = null;
                    Date fechaT=null;
                    
                    do { 
                                            
                    SimpleDateFormat formato = new SimpleDateFormat("DD/MM/YYYY_hh:mm");
                    System.out.println("Ingrese fecha y hora de inicio:  (dd/mm/aaaa_hh:mm)");
                    fechaini= leer.next();
                    
                        try {
                            fechaI = formato.parse(fechaini);
                            flag= true;
                        } catch (Exception e) {
                            flag=false;
                        }
                        
                    } while (flag=false);
                        eve.setFechaIni(fechaI);
                    do {                        
                        SimpleDateFormat formato = new SimpleDateFormat("DD/MM/YYYY_hh:mm");
                        System.out.println("Ingrese fecha y hora de termino:  (dd/mm/aaaa_hh:mm)");
                        fechater= leer.next();
                        
                        try {
                            fechaT = formato.parse(fechater);
                            flag=true;
                        } catch (Exception e) {
                            flag=false;
                        }
                    } while (flag=false);
                        eve.setFechaTer(fechaT);
                        
                     System.out.println("Incluye entretencion: S/N");
                     entretencion =leer.next().toUpperCase().charAt(0);
                     eve.setEntretencion(entretencion);
                     
                     System.out.println("Ingrese tipo evento:  (A.- Cumpleaños B.-Matrimonio C.- Cena d.-Fiesta)");
                     tipoevent = leer.next().toUpperCase().charAt(0);
                    
                        if (tipoevent=='A') {
                            lista1.agregarLista(eve);
                        if (tipoevent == 'B'){
                            lista2.agregarLista(eve);
                        if (tipoevent == 'C'){
                            lista3.agregarLista(eve);
                        if (tipoevent == 'D'){
                            lista4.agregarLista(eve);
                        }
                        }
                        }
                    }else{
                            System.out.println("no se agrego a ningun lista");
                        }
                    
                    
                    break;
            }
        } while (opcion!=4);
    }
    
    
}
