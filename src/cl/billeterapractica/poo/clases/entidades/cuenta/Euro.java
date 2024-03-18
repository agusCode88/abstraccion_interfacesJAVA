package cl.billeterapractica.poo.clases.entidades.cuenta;

import cl.billeterapractica.poo.clases.interfaces.cuenta.ConversorMoneda;
public class Euro implements ConversorMoneda {
    private double saldoConvertidoEuro;
    public double VALOR_EURO = 800;

    public Euro(double saldoConvertidoEuro) {
        this.saldoConvertidoEuro = saldoConvertidoEuro;
    }

    @Override
    public double convertir() {
        this.saldoConvertidoEuro = this.saldoConvertidoEuro/VALOR_EURO;
        return this.saldoConvertidoEuro;
    }
}
