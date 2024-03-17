import cl.billeterapractica.poo.clases.subclases.CuentaEnEuros;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /**
         * Nuevo proyecto de la clase de abstracción e interfaces
         */

        //Acá haré el código
        double saldo;

        CuentaEnEuros cuentaEnEuros = new CuentaEnEuros();
        saldo = cuentaEnEuros.verificarDatos(5000);

        if( saldo == 0 ){
            System.out.println("Cuenta en dólares sin fondo");
        } else{
            System.out.println("Tiene " + saldo + " dólares en su cuenta");
        }

        //System.out.println("El valor de mi cuenta es ");cuentaEnEuros.verificarDatos(5000);

    }
}