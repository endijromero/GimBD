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
public class RutinaPeso extends Rutina {
    
    private String caminadora;
    private String eliptica;
    private String escaladora;
    private String zumba;
    private String [] ejercicio;

    public String[] getEjercicio() {
        return ejercicio;
    }

    public void setEjercicio(String[] ejercicio) {
        this.ejercicio = ejercicio;
    }
     

    public String getCaminadora() {
        return caminadora;
    }

    public void setCaminadora(String caminadora) {
        this.caminadora = caminadora;
    }

    public String getEliptica() {
        return eliptica;
    }

    public void setEliptica(String eliptica) {
        this.eliptica = eliptica;
    }

    public String getEscaladora() {
        return escaladora;
    }

    public void setEscaladora(String escaladora) {
        this.escaladora = escaladora;
    }

    public String getZumba() {
        return zumba;
    }

    public void setZumba(String zumba) {
        this.zumba = zumba;
    }
    
   

    @Override
    public String generarRutina() {
        
        ejercicio=new String [4];
        
        this.setEliptica("maquina eliptica");
        this.setCaminadora(" Maquina caminadora");
        this.setZumba("Aerobicos zumba");
        this.setEscaladora(" Maquina escaladora");
        ejercicio[0]=this.getEliptica();
        ejercicio[1]=this.getCaminadora();
        ejercicio[2]=this.getZumba();
        ejercicio[3]=this.getEscaladora();
        
                
        int random= (int) (Math.random()*2);
        int random2=(int) (Math.random()* 3-2+1)+2;
        
        return ejercicio[random]+impresionTiempo()+ejercicio[random2]+impresionTiempo()+impresionRepeticiones();
    }


    
    
}
