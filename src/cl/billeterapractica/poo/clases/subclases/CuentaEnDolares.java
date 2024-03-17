package cl.billeterapractica.poo.clases.subclases;

import cl.billeterapractica.poo.clases.abstractas.CuentaVirtual;

public class CuentaEnDolares extends CuentaVirtual {

    private double VALOR_DOLAR = 966;
    double saldoEnDolares;

    @Override
    protected double verificarDatos(double saldo) {
        if( saldo > 0){
            System.out.println("Tiene saldo la cuenta");
            this.saldoEnDolares = saldo/VALOR_DOLAR;
            return  saldo;
        }

        return 0;
    }
}
