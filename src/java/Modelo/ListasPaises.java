/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class ListasPaises {
        public static ArrayList <Comida> italia= new ArrayList<Comida>();
        public static ArrayList <Comida> espana= new ArrayList<Comida>();
        public static ArrayList <Comida> alemania= new ArrayList<Comida>();
        public static ArrayList <Comida> otro= new ArrayList<Comida>();
        
        
        public static void Reiniciar(){
            italia.clear();
            espana.clear();
            alemania.clear();
            otro.clear();
        }
}
