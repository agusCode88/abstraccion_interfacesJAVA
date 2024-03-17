package cl.billeterapractica.poo.clases;

import cl.billeterapractica.poo.interfaces.AnimalInterface;

public class Gato implements AnimalInterface {

    @Override
    public void moverse() {
        System.out.println("Soy un Gato que está trepando un árbol");
    }

    @Override
    public void comer() {
        System.out.println("Soy un gato y estoy comiendo un atún");
    }

    @Override
    public void hacerRudio() {
        System.out.println("Soy un gato Ronroneando");
    }

    @Override
    public void dormir() {
        System.out.println("Soy un gato que le gusta dormir");
    }
}
