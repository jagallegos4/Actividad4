
package Ejecuta;

public class Proveedor {
    private String ruc, rSocial, tProducto, vendedor;

    public Proveedor(String ruc, String rSocial, String tProducto, String vendedor) {
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

    public String getVendedor() {
        return vendedor;
    }
    
    
}
