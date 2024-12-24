
package com.mycompany.implementacion_de_interfaces;



public class Perro implements Mamifero {

    @Override
    public void amamantar() {
        System.out.println("El perro amamanta a sus cachorros.");
    }

    @Override
    public void hacerSonido() {
        System.out.println("El Perro hace Gua Gua");
    }
}