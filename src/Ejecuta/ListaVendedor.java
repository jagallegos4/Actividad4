
package Ejecuta;

import java.util.ArrayList;

public class ListaVendedor {
    public static ListaVendedor instancia;
    public static ListaVendedor obtenerInstancia(){
        if(instancia==null)
            instancia=new ListaVendedor();
            return instancia;        
    }
    
    private ListaVendedor(){
        vendedores=new ArrayList();
    }
    private ArrayList<Vendedor> vendedores;
    public void guardarVendedor(String cedula, String nombre, String apellido, String genero, String telefono){
        Vendedor vendedor=new Vendedor(cedula,nombre,apellido,genero, telefono);
        vendedores.add(vendedor);
    }
    public boolean validarCedula(String cedula){
        int capCaracter, suma = 0, acum=0, resta=0;
        for(int i=0;i<cedula.length()-1;i++){
            capCaracter=Integer.parseInt(cedula.charAt(i)+"");//transforma String a un valor numerico
            if(i%2==0){//posicion par=0
                capCaracter=capCaracter*2;//el numero de la posicion par se multiplica por 2
                if(capCaracter>9){//resultado >9, se resta 9
                    capCaracter=capCaracter-9;
                }
            }
            suma=suma+capCaracter;//suma los resultados de cada posicion
        }
        if(suma%10!=0){
            acum=((suma/10)+1)*10;
            resta=acum-suma;
        }
        int digitoVerificador=Integer.parseInt(cedula.charAt(9)+"");
        if(digitoVerificador==resta){
            return true;
        }else           
        return false;
    }
}
