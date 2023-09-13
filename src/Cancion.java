
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pipeg
 * @version 13-09-23
 */
public class Cancion {
    
    private String titulo,artista;
    private  int duracion;
    private boolean favorita;
    private char descargada;//'s' para si 'n' para no

    public Cancion() {
        
    }

    public Cancion(String titulo, String artista, int duracion, boolean favorita, char descargada) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
        this.favorita = favorita;
        this.descargada = descargada;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public boolean isFavorita() {
        return favorita;
    }

    public void setFavorita(boolean favorita) {
        this.favorita = favorita;
    }

    public char getDescargada() {
        return descargada;
    }

    public void setDescargada(char descargada) {
        this.descargada = descargada;
    }

    @Override
    public String toString() {
        return "Cancion{" + "titulo=" + titulo + ", artista=" + artista + ", duracion=" + duracion + ", favorita=" + favorita + ", descargada=" + descargada + '}';
    }
    
    //adelantar cancion
    
    public int adelantarCancion(int segAdelantar,int segActuales){
        segActuales = segActuales + segAdelantar;
        return segActuales;
    }
    
    public void infoCancion()
    {
        int minutos = 0 ,segundos=0 ;//definimos los parametros de segundos y minutos, que variables son
        
        minutos= this.duracion /60; // para calcular minutis de una cancion
        segundos = this.duracion - minutos *60;//ver cuales son los segundos de una cancion
        
        System.out.println("Nombres: "+this.titulo);
        System.out.println("Artista: "+this.artista);
        System.out.println("Duracion: "+ minutos +":"+segundos);
    }
  
    
}
