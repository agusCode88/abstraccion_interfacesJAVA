package cl.billeterapractica.poo.clases;

public class CuentaEnEuros extends CuentaVirtual{

    public static final double VALOR_EURO = 850;
    double saldoEnEuros;

    /**
     * Método que se sobrescribe gracias a la declaración abstract de la superclase.
     * Como clase hija, tiene que implementar el cuerpo del método.
     * @param saldo
     * @return
     */
    @Override
    public double verificarDatos(double saldo) {
        if( saldo > 0){
            System.out.println("Tiene saldo la cuenta");
            this.saldoEnEuros = saldo/VALOR_EURO;
            return saldoEnEuros;
        }

        return 0;
    }
}


