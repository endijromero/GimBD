/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author GOLDS
 */
public abstract class Rutina {
  


    public abstract String generarRutina();

    public int tiempo(){
        return (int) (Math.random() * (59-10+1)+10);
};

   
    public int repeticiones(){
        
        return (int) (Math.random() * (10-5+1)) + 1;
    
    }
    
    public String impresionTiempo(){
        return " durante "+tiempo()+" minutos ";
    }
    
    public String impresionRepeticiones(){
        return " con "+repeticiones()+" repeticiones cada uno ";
    }
    
    
}
