
package com.mycompany.implementacion_de_interfaces;


public class Implementacion_de_Interfaces {

    public static void main(String[] args) {
        
        Perro perro = new Perro();
        Gato gato = new Gato();

        System.out.println("Perro:");
        perro.hacerSonido();
        perro.amamantar();

        System.out.println("Gato:");
        gato.hacerSonido();
        gato.amamantar();
    }
}