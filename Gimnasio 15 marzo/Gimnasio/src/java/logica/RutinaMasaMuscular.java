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
public class RutinaMasaMuscular extends Rutina {

    private String bancoPress ;
    private String mariposa;
    private String dorsalera;
    private String extensionPiernas;
    private String prensaPiernas;
    private String abductores;
    private String [] ejercicio;

    public String[] getEjercicio() {
        return ejercicio;
    }

    public void setEjercicio(String[] ejercicio) {
        this.ejercicio = ejercicio;
    }
    
    

    public String getBancoPress() {
        return bancoPress;
    }

    public void setBancoPress(String bancoPress) {
        this.bancoPress = bancoPress;
    }

    public String getDorsalera() {
        return dorsalera;
    }

    public void setDorsalera(String dorsalera) {
        this.dorsalera = dorsalera;
    }

    public String getExtensionPiernas() {
        return extensionPiernas;
    }

    public void setExtensionPiernas(String extensionPiernas) {
        this.extensionPiernas = extensionPiernas;
    }

    public String getPrensaPiernas() {
        return prensaPiernas;
    }

    public void setPrensaPiernas(String prensaPiernas) {
        this.prensaPiernas = prensaPiernas;
    }

    public String getAbductores() {
        return abductores;
    }

    public void setAbductores(String abductores) {
        this.abductores = abductores;
    }

    public String getMariposa() {
        return mariposa;
    }

    public void setMariposa(String mariposa) {
        this.mariposa = mariposa;
    }
    
    
  

    @Override
    public String generarRutina() {
       ejercicio=new String [6];
       
       this.setAbductores("Maquina de abductores");
       this.setBancoPress("Banco press");
       this.setPrensaPiernas(" Maquina de prensa");
       this.setExtensionPiernas(" Maquina de extension ");
       this.setMariposa(" Maquina mariposa");
       this.setDorsalera(" Maquina dorsalera");
       ejercicio[0]=this.getAbductores();
       ejercicio[1]=this.getBancoPress();
       ejercicio[2]=this.getExtensionPiernas();
       ejercicio[3]=this.getMariposa();
       ejercicio[4]=this.getDorsalera();
       ejercicio[5]=this.getPrensaPiernas();
       
        int random= (int) (Math.random()*2-0+1)+0;
        int random2=(int) (Math.random()* 5-3+1)+3;
        
        
        
        
        return ejercicio[random]+impresionTiempo()+ejercicio[random2]+impresionTiempo()+impresionRepeticiones();
                
    }
    
    
   
    
}
