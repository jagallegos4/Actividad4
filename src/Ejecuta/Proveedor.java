
package Ejecuta;

//import java.util.ArrayList;

public class Proveedor {
    private String ruc, rSocial, tProducto;
    private Vendedor vendedor;
    public static Proveedor instancia;
    public static Proveedor obtenerInstancia(){
        if(instancia==null)
            instancia=new Proveedor();
            return instancia;        
    }
    private Proveedor(){
        
    }

    public Proveedor(String ruc, String rSocial, String tProducto, Vendedor vendedor) {
        this.ruc = ruc;
        this.rSocial = rSocial;
        this.tProducto = tProducto;
        this.vendedor = vendedor;
    }

    public String getRuc() {
        return ruc;
    }

    public String getrSocial() {
        return rSocial;
    }

    public String gettProducto() {
        return tProducto;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }    
}
