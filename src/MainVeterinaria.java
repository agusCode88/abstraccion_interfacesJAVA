import cl.billeterapractica.poo.clases.Gato;
import cl.billeterapractica.poo.clases.Iguana;
import cl.billeterapractica.poo.clases.Leon;
import cl.billeterapractica.poo.clases.Perro;
import cl.billeterapractica.poo.interfaces.AnimalInterface;
import com.sun.source.tree.IfTree;

public class MainVeterinaria {
    public static void main(String[] args) {

        AnimalInterface[] listaAnimalesZoologico;

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
