package AppSucursalBancaria;

public class CuentaVivienda extends CuentaSucursal {
    // atributos los hereda 
        private double saldo=1000;
    // constructor con super 
    public CuentaVivienda(int numero , ClienteSucursal Titular){
        super(numero, 1000, Titular);

    }
    
    //metodos. 
    public  void retiro (double cantidad){
        if(saldo<0){
            System.out.println("no puedes retirar porque tu saldo es menor a 3000");
        }else if(cantidad>500){
            System.out.println("tu cantidad no se puede retirar");
        }
        else{
            saldo=saldo-cantidad;
            System.out.println("tu nuevo saldo de la cuenta es "+ saldo);

        }

    }

    public  void ingresar(double ingresar){


    }



    
}
