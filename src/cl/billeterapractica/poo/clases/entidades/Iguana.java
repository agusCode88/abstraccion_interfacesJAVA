package cl.billeterapractica.poo.clases.entidades;

import cl.billeterapractica.poo.clases.interfaces.AnimalInterface;

public class Iguana implements AnimalInterface {
    @Override
    public void moverse() {
        System.out.println("Soy una Iguana que está cambiando de color");
    }

    @Override
    public void comer() {
        System.out.println("Soy una Iguana que está comiendo un insecto");
    }

    @Override
    public void hacerRudio() {
        System.out.println("Soy una Iguana silenciosa");
    }

    @Override
    public void dormir() {
        System.out.println("Soy una Iguana que domiré en algún momento");
    }
}
