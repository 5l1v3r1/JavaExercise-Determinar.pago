package Ejer5;
public class Trabajador {
    
    String cliente, categoria;
    int monto;
    
//                      Constructor

    public Trabajador(String cliente, String categoria, int monto) {
        this.cliente = cliente;
        this.categoria = categoria;
        this.monto = monto;
    }

   
//                  Fin constructor
 
    public double bonificacion_estado_civil(){
        if (categoria.equalsIgnoreCase("A")) {
            return (monto*5)/100;
        }
        if (categoria.equalsIgnoreCase("B")) {
            return (monto*7)/100;
        }
         if (categoria.equalsIgnoreCase("C")) {
            return (monto*10)/100;
        }
        if (categoria.equalsIgnoreCase("D")) {
            return (monto*15)/100;
        }
 
        return 0;
    }
   
    public double suelto_total(){
        
        return monto - bonificacion_estado_civil();
    }
 

  
    
}
