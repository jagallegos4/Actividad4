
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
    public void guardarProveedor(String ruc, String rSocial, String tProducto, Vendedor vendedor){
        Proveedor proveedor=new Proveedor(ruc, rSocial, tProducto, vendedor);
        proveedores.add(proveedor);
    }
    public Proveedor obtenerP(){
        Proveedor p = new Proveedor("", "", "", Vendedor.instancia);
        for(int i=0;i<proveedores.size();i++){
            p=proveedores.get(i);
        }
        return p;
    }
}
