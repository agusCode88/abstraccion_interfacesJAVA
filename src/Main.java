import cl.billeterapractica.poo.clases.abstractas.cuenta.CuentaVirtual;
import cl.billeterapractica.poo.clases.subclases.cuenta.CuentaEnDolares;
import cl.billeterapractica.poo.clases.subclases.cuenta.CuentaEnEuros;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /**
         * Nuevo proyecto de la clase de abstracción e interfaces
         */
        //Acá haré el código
        double saldo;

        CuentaEnDolares cuentaEnDolares = new CuentaEnDolares(6000,null);
        cuentaEnDolares.mostrarBalance();
        CuentaEnEuros cuentaEnEuros = new CuentaEnEuros(5000,null);
        cuentaEnEuros.mostrarBalance();
        //System.out.println("El valor de mi cuenta es ");cuentaEnEuros.verificarDatos(5000);

    }
}