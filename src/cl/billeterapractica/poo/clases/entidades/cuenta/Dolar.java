package cl.billeterapractica.poo.clases.entidades.cuenta;

import cl.billeterapractica.poo.clases.interfaces.cuenta.ConversorMoneda;

public class Dolar implements ConversorMoneda {
    private double saldoConvertidoDolar;
    public double VALOR_DOLAR = 966;

    public Dolar(double saldoConvertidoDolar) {
        this.saldoConvertidoDolar = saldoConvertidoDolar;
    }

    @Override
    public double convertir() {
        this.saldoConvertidoDolar = this.saldoConvertidoDolar/VALOR_DOLAR;
        return this.saldoConvertidoDolar;
    }
}
