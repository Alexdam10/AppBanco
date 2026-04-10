package AppSucursalBancaria;

public class FondoInversion extends CuentaSucursal {

    //atributos 
    private double interes;
    private double saldo=5000;

    // constructor 
    public FondoInversion(int numero , ClienteSucursal Titular, double interes){
        super(numero, 5000, Titular);
        this.interes=interes;

    }

    
    
    // metodos 
    public  void InteresGenerado(double cantidad){

    }

     
    public  void retiro (double cantidad){
        if(saldo<3000){
            System.out.println("no puedes retirar porque tu saldo es menor a 3000");
        }else if(cantidad>0 && cantidad<500){
            System.out.println("no se puede retirar esta cantidad es menor a 500");
        }
        else{
            saldo=saldo-cantidad;
            System.out.println("tu nuevo saldo de la cuenta es "+ saldo);

        }


    }

    public  void ingresar(double ingresar){


    }
    


    // setter y getter 
    public double getInteres() {
        return interes;
    }



    public void setInteres(double interes) {
        this.interes = interes;
    }
}
