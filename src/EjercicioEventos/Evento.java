/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioEventos;

import java.util.Date;

/**
 *
 * @author pipeg
 * @version 20-09-23
 */
public class Evento {
    
    private int codigo,horaini,horater,precio,cantidadPersonas;
    private Date fecha;
    private String ubicacion;
    private char tipoevent; //A.- cumpleaños B.-matrimonio C.- cena d.-fiesta
    private boolean entretencion;

    public Evento() {
    }

    public Evento(int codigo, int horaini, int horater, int precio, int cantidadPersonas, Date fecha, String ubicacion, char tipoevent, boolean entretencion) {
        this.codigo = codigo;
        this.horaini = horaini;
        this.horater = horater;
        this.precio = precio;
        this.cantidadPersonas = cantidadPersonas;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.tipoevent = tipoevent;
        this.entretencion = entretencion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getHoraini() {
        return horaini;
    }

    public void setHoraini(int horaini) {
        this.horaini = horaini;
    }

    public int getHorater() {
        return horater;
    }

    public void setHorater(int horater) {
        this.horater = horater;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public char getTipoevent() {
        return tipoevent;
    }

    public void setTipoevent(char tipoevent) {
        this.tipoevent = tipoevent;
    }

    public boolean isEntretencion() {
        return entretencion;
    }

    public void setEntretencion(boolean entretencion) {
        this.entretencion = entretencion;
    }

    @Override
    public String toString() {
        return "Evento{" + "codigo=" + codigo + ", horaini=" + horaini + ", horater=" + horater + ", precio=" + precio + ", cantidadPersonas=" + cantidadPersonas + ", fecha=" + fecha + ", ubicacion=" + ubicacion + ", tipoevent=" + tipoevent + ", entretencion=" + entretencion + '}';
    }
    
    //codigo evento
    
    public int CodigoEvento(){
        this.codigo=this.codigo+1;
        return this.codigo;
    }
    
    
}
