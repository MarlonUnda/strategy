/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pdstrategy;

/**
 *
 * @author jenni
 */
public class comprimirARar implements Strategy {
    
    @Override
    public void comprimirArchivo(String nombreArchivo){
        System.out.println(nombreArchivo + "ha sido comprimido a RAR");
    }
    
}
