import cl.billeterapractica.poo.clases.entidades.animal.Gato;
import cl.billeterapractica.poo.clases.entidades.animal.Iguana;
import cl.billeterapractica.poo.clases.entidades.animal.Leon;
import cl.billeterapractica.poo.clases.entidades.animal.Perro;
import cl.billeterapractica.poo.clases.interfaces.animal.AnimalInterface;

public class MainVeterinaria {
    public static void main(String[] args) {

        AnimalInterface[] listaAnimalesZoologico = new AnimalInterface[4];

        Perro perro = new Perro();
        Gato gato = new Gato();
        Iguana iguana = new Iguana();
        Leon leon = new Leon();

        listaAnimalesZoologico = new AnimalInterface[]{perro, gato, iguana, leon};

        for(AnimalInterface animalZoologico : listaAnimalesZoologico){
            animalZoologico.moverse();
            animalZoologico.comer();
            animalZoologico.hacerRudio();
            animalZoologico.dormir();
        }

    }
}
