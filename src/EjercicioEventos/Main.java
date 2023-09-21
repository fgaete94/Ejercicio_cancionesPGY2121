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
        char tipoevent,entretencion,opevent; //A.- cumpleaños B.-matrimonio C.- cena d.-fiesta
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
            System.out.println("4.- Ordenar eventos por fecha");
            System.out.println("5.- Salir");
            opcion=leer.nextInt();
            
            switch (opcion) {
                case 1:
                    Date fechaI = null;
                    Date fechaT=null;
                    
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
                    
                    
                    
                    do { 
                                            
                    SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy_hh:mm");
                    System.out.println("Ingrese fecha y hora de inicio:  (dd-mm-aaaa_hh:mm)");
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
                        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy_hh:mm");
                        System.out.println("Ingrese fecha y hora de termino:  (dd-mm-aaaa_hh:mm)");
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
                            System.out.println("Evento Cumpleaños creado");
                        }
                        if (tipoevent == 'B'){
                            lista2.agregarLista(eve);
                            System.out.println("Evento Matrimonio creado");
                        }
                        if (tipoevent == 'C'){
                            lista3.agregarLista(eve);
                            System.out.println("Evento Cena creado");
                        }
                        if (tipoevent == 'D'){
                            lista4.agregarLista(eve);
                            System.out.println("Evento Fiesta creado");
                        }
                        
                        
                       
                        
                    System.out.println("Ubicacion: "+eve.getUbicacion());
                    System.out.println("n° personas: "+ eve.getCantidadPersonas());
                    System.out.println("valor entrada: "+eve.getPrecio());
                    System.out.println("Fecha Inicio: "+eve.getFechaIni());
                    System.out.println("Fecha termino: "+eve.getFechaTer());
                    
                    
                    break;
                case 2:
                    
                    System.out.println("De que eventos desea ver las ventas? (A.- Cumpleaños B.-Matrimonio C.- Cena d.-Fiesta) ");
                    opevent= leer.next().toUpperCase().charAt(0);
                    
                    if (opevent =='A') {
                        lista1.ventaEvento();

                    }
                    if (opevent == 'B'){
                        lista2.ventaEvento();
                        
                    }
                    if (opevent =='C'){
                        lista3.ventaEvento();
                        
                    }
                    if (opevent =='D'){
                        lista4.ventaEvento();
                        
                    }
                    
                    
                        
                    else {
                        System.out.println("Seleccion no valida!");
                    }
                    break;
                    
                case 3:
                    System.out.println("Cantidad de eventos realizados por Tipo");
                    System.out.println( "Cumpleaños: "+ lista1.tamañoLista());
                    System.out.println("Matrimonios: "+lista2.tamañoLista());
                    System.out.println("Cenas: "+lista3.tamañoLista());
                    System.out.println("Fiestas: "+lista4.tamañoLista());
                    break;
                    
                case 4:
                                        
                    System.out.println("Que eventos desea Visualizar? (A.- Cumpleaños B.-Matrimonio C.- Cena d.-Fiesta) ");
                    opevent= leer.next().toUpperCase().charAt(0);
                    
                    if (opevent =='A') {
                        lista1.ordenar();
                        System.out.println(lista1);
                    }
                    if (opevent == 'B'){
                        lista2.ordenar();
                        System.out.println(lista2);
                    }
                    if (opevent =='C'){
                        lista3.ordenar();
                        System.out.println(lista3);
                    }
                    if (opevent =='D'){
                        lista4.ordenar();
                        System.out.println(lista4);
                    }
                    
                    
                        
                   
                    break;
                case 5:
                    System.out.println("Gracias por usar el programa :)");
                    break;
                    
            }
        } while (opcion!=5);
    }
    
    
}
