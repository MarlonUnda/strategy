/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pdstrategy;

/**
 *
 * @author jenni
 */
public class Context { 
    Strategy estrategiaCompresion;
    
    public void establecerEstrategia(Strategy estrategiaCompresion){
        this.estrategiaCompresion = estrategiaCompresion;
        
    }
    
    public void generarArchivo(String archivo){
        estrategiaCompresion.comprimirArchivo(archivo);
    }
}
