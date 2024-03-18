package cl.billeterapractica.poo.clases.subclases.cuenta;

import cl.billeterapractica.poo.clases.abstractas.cuenta.CuentaVirtual;
import cl.billeterapractica.poo.clases.entidades.cuenta.Euro;
import cl.billeterapractica.poo.clases.entidades.usuario.UsuarioApp;

public class CuentaEnEuros extends CuentaVirtual {

    public static final double VALOR_EURO = 850;
    protected double saldoEnEuros;

    protected Euro euro;

    public CuentaEnEuros(double saldoCuenta, UsuarioApp usuario) {
        super( saldoCuenta, usuario );
        this.saldoCuenta = saldoCuenta;
        crearSaldoEnEuros(this.saldoCuenta);
    }

    /**
     * Método que se sobrescribe gracias a la declaración abstract de la superclase.
     * Como clase hija, tiene que implementar el cuerpo del método.
     * @return
     */
    @Override
    public boolean verificarFondos() {
        return saldoCuenta > 0;
    }

    @Override
    public void mostrarBalance() {
        if(verificarFondos()){
            System.out.println("Saldo en la cuenta de euros:" + euro.convertir() );
        }
    }

    protected void  crearSaldoEnEuros(double saldo){
        this.euro = new Euro(saldo);
    }
}


