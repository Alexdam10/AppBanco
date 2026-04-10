package AppSucursalBancaria;

import java.time.LocalDate;

public class ClienteSucursal {
    private String dni;
    private String nombre;
    private String apellido;
    private String direccion;
    private String localidad;
    private LocalDate Fnacimiento;




    // generamos el constructor con todos los datos
    public ClienteSucursal(String dni,String nombre,String apellido,String direccion,String localidad,LocalDate Fnacimiento){
        this.dni=dni;
        this.nombre=nombre;
        this.apellido=apellido;
        this.direccion=direccion; 
        this.localidad=localidad;
        this.Fnacimiento=Fnacimiento;
    }

    // generamos el constructor solo con dni 
    public ClienteSucursal(String dni){
        this.dni=dni;
    }


    // generar los metodos.
    public String nombreCompleto(){
        return (nombre + "+" + apellido);
    }

    public String direccionCompleta(){
        return (direccion + "+" + localidad);
    }





















}
