package Modelo;


import java.util.GregorianCalendar;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class Comida {
    private String nombre;
    private String pais;
    private GregorianCalendar fecha;
    private int calorias;
    private String foto;
    
    private static HashMap <String, Comida> listacomidas = new HashMap<String,Comida>();   
    
    
    public Comida(){
        
    }
    
    public Comida(String nom, String pa, GregorianCalendar fe, int cal, String fot){
        super();
        this.nombre=nom;
        this.pais=pa;
        this.fecha=fe;
        this.calorias=cal;
        this.foto=("../src/java/Fotos/").concat(fot);
        
        listacomidas.put(this.nombre, this);
    }
    
    public Comida(String nom){
        super();
        this.nombre=nom;
        
        listacomidas.put(this.nombre, this);
    }
    
    
    public static void RellenarLista(){     //Pone datos de ejemplo en la lista
        Comida a = new Comida("pizza","Italia",new GregorianCalendar(), 400, "pizza.jpeg");
            a = new Comida("hamburguesa", "Alemania", new GregorianCalendar(), 360, "hamburguesa.jpeg");
            a = new Comida("paella", "Espana", new GregorianCalendar(), 180, "paella.jpeg");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public GregorianCalendar getFecha() {
        return fecha;
    }

    public void setFecha(GregorianCalendar fecha) {
        this.fecha = fecha;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }
    
    public String getFoto() {
        return foto;
    }

    public static HashMap<String, Comida> getListacomidas() {
        return listacomidas;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
    
    
}


