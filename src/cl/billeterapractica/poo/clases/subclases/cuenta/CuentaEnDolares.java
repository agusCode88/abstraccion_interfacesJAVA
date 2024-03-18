package cl.billeterapractica.poo.clases.subclases.cuenta;

import cl.billeterapractica.poo.clases.abstractas.cuenta.CuentaVirtual;
import cl.billeterapractica.poo.clases.entidades.cuenta.Dolar;
import cl.billeterapractica.poo.clases.entidades.usuario.UsuarioApp;

public class CuentaEnDolares extends CuentaVirtual {

    protected boolean tieneFondos= false;
    Dolar dolares;

    public CuentaEnDolares(double saldoCuenta, UsuarioApp usuario){
        super(saldoCuenta,usuario);
        this.saldoCuenta = saldoCuenta;
        crearSaldoEnDolares(saldoCuenta);
    }


    @Override
    protected boolean verificarFondos() {
        if( saldoCuenta > 0){
            this.tieneFondos = true;
            return true;
        }
        return false;
    }

    @Override
    public void mostrarBalance() {
        if(verificarFondos()){
            System.out.println("Saldo en la cuenta de dólares:" + dolares.convertir() );
        }
    }

    protected void crearSaldoEnDolares(double saldo){
        this.dolares = new Dolar(saldoCuenta);
    }
}
