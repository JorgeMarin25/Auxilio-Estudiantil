/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ServicioAlCliente;
import Auxilios.*;
/**
 *
 * @author adsi-admin
 */
public class Contacto extends Empresa{
    
     public void  VerDatos (String nombreEmpresa, String nit, int telefono, String direccion, String email) {
         
        this.nombreEmpresa = nombreEmpresa;
        this.nit = nit;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
    }
    
    
    
}
