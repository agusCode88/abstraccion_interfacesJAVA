package cl.billeterapractica.poo.clases;

/**
 * Esta es la superclase CuntaVirtual o Wallet
 *
 * La transformamos a clase abstracta para tener atributos
 * o métodos que serán compartidos por las subclases.
 *
 * Lo que declaro como abstracto, debe ser implementados por las
 * subclases o los objetos que quiera instanciar de esta clase.
 *
 *  Las clases abstractas a menudo se utilizan para definir una estructura de jerarquía
 *  en la que algunas funcionalidades están implementadas y otras deben ser implementadas por las subclases.
 *  Esto puede ser útil para establecer relaciones más fuertes entre las clases.
 *
 */
public abstract class CuentaVirtual {

    /**
     * Un método abstracto no puede tener un cuerpo,
     * el cuerpo del método lo implementa las clases hijas.
     *
     */
    protected abstract double verificarDatos(double saldo);
}
