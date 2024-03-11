/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pdstrategy;

/**
 *
 * @author jenni
 */
public class Pdstrategy {

    public static void main(String[] args) {
       Context con = new Context();
       con.establecerEstrategia(new comprimirAZip());
       con.generarArchivo("ABC.txt");
    }
}
