package AppSucursalBancaria;

public class CuentaCorriente extends CuentaSucursal {


    // atributos no tiene los hereda 
        private double saldo=0;

    //constructor que hereda
    public CuentaCorriente(int numero ,ClienteSucursal Titular){
        super(numero,0,Titular);
    }

    

    //metodos.
    public  void retiro (double cantidad){
        if(saldo<0){
            System.out.println("no puedes retirar porque tu saldo es menor a 0");
        }else if(cantidad>300){
            System.out.println("no se puede retirar una cantidad mayor a 300");
        }
        else{
            saldo=saldo-cantidad;
            System.out.println("tu nuevo saldo de la cuenta es "+ saldo);

        }

    }

    public  void ingresar(double ingresar){


    }

}
