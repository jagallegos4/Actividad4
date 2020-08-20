
package Ejecuta;

import java.util.ArrayList;

public class ListaProveedor {
    public static ListaProveedor instancia;
    public static ListaProveedor obtenerInstancia(){
        if(instancia==null)
            instancia=new ListaProveedor();
            return instancia;        
    }
    private ListaProveedor(){
        proveedores=new ArrayList();
    }
    private ArrayList<Proveedor> proveedores;
    public void guardarVendedor(String ruc, String rSocial, String tProducto, String vendedor){
        Proveedor proveedor=new Proveedor(ruc, rSocial, tProducto, vendedor);
        proveedores.add(proveedor);
    }
}
