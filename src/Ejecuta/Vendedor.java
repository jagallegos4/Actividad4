
package Ejecuta;

import java.util.ArrayList;

public class Vendedor {
    private String cedula, nombres, apellidos, genero, telefono;
    private ArrayList<Vendedor> vendedor;
    public static Vendedor instancia;
    public static Vendedor obtenerInstancia(){
        if(instancia==null)
            instancia=new Vendedor();
            return instancia;        
    }
    
    public Vendedor(){
        vendedor=new ArrayList();
    }

    public Vendedor(String cedula, String nombres, String apellidos, String genero, String telefono) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.genero = genero;
        this.telefono = telefono;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getGenero() {
        return genero;
    }

    public String getTelefono() {
        return telefono;
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

    @Override
    public String toString() {
        return "Nombre: "+this.nombres+"Apellido: "+this.apellidos;
    }
}
