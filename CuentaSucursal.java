package AppSucursalBancaria;

import java.time.LocalDateTime;

// elaboramos una clase abstracta. 
public abstract class  CuentaSucursal {
    private int numero;
    private double saldo; 
    private ClienteSucursal Titular;


    // constructor 
    public CuentaSucursal(int numero , double saldo , ClienteSucursal Titular){
        this.numero=numero;
        this.saldo=saldo;
        this.Titular=Titular;

    }

    //metodos 
    public abstract void retiro (double cantidad);

    public abstract void ingresar(double ingresar);
        

    public void obtenerMovimientos(){

    }


    // añadimos la clase privada de movimientos porque solo depende a esta cuenta 

    private class Movimientos {

        private LocalDateTime fecha; 
        private double importe;
        private double saldo;
        private String tipo;
    
    }


    @Override
    public String toString() {
        return "CuentaSucursal [numero=" + numero + ", saldo=" + saldo + ", Titular=" + Titular + "]";
    }

    //setter y getters
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ClienteSucursal getTitular() {
        return Titular;
    }

    public void setTitular(ClienteSucursal titular) {
        Titular = titular;
    }


    
    

}
