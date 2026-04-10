package AppSucursalBancaria;

import java.time.LocalDate;

public class AppBanco {
    public static void main(String[] args) {
        // crear el cliente 
        ClienteSucursal c1 = new ClienteSucursal("123456A", "Alejandro", "Paez", "San juan", "Madrid", LocalDate.now());
        System.out.println(c1.nombreCompleto());
        System.out.println(c1.direccionCompleta());

        CuentaCorriente cuenta1 = new CuentaCorriente(12345, c1);

        System.out.println(cuenta1);
    }
    
}
