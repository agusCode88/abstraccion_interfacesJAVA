package cl.billeterapractica.poo.clases.entidades;

import cl.billeterapractica.poo.clases.interfaces.AnimalInterface;

public class Leon implements AnimalInterface {

    @Override
    public void moverse() {
        System.out.println("Soy un Gato Grande  que está trepando un árbol");
    }

    @Override
    public void comer() {
        System.out.println("Soy un Leon que está comiendo una cebra");
    }

    @Override
    public void hacerRudio() {
        System.out.println("Soy un gato FGrande y arrrrrggggg");
    }

    @Override
    public void dormir() {
        System.out.println("Soy un León y no duermo proque soy e rey de la selva");
    }
}
