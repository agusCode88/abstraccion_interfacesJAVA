package cl.billeterapractica.poo.clases;

import cl.billeterapractica.poo.interfaces.AnimalInterface;

public class Perro implements AnimalInterface {


    public Perro() {
    }

    @Override
    public void moverse() {
        System.out.println("Soy un perro que está corriendo");
    }

    @Override
    public void comer() {
        System.out.println("Soy un perro que está comiendo un hueso");
    }

    @Override
    public void hacerRudio() {
        System.out.println("Soy un perro que hace Guau!");
    }

    @Override
    public void dormir() {
        System.out.println("Soy un perro y tendré a la noche");
    }
}
