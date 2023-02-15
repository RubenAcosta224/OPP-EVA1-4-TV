/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_4_tv;

/**
 *
 * @author invitado
 */
public class TV {
    private int volumen;
    private int canal;
    private boolean poder;
    
    public TV (){
        volumen=0;
        canal=0;
        poder=false;
    }
    
    public void cambiarEstadoPoder(){
        
        if(poder==true) {
            poder=false;
            System.out.println("Apagando pantalla");
        } else {
            poder=true;
            System.out.println("Encendiendo pantalla");
        }
    }
    
    
    
    public void subirVolumen(){
        if(poder){
            if(volumen<100){
            volumen++;
                
            }
            
        System.out.println("Volumen: "+volumen);
        }
            
    }
    
    public void bajarVolumen(){
        if(poder){
            if(volumen>0){
            volumen--;
                
            }
            
        System.out.println("Volumen: "+volumen);
        }
    }
    
    
    
    
    
    
    
    public void subirCanal(){
        if(poder){
            if(canal<100){
                canal++;
            }else{
                canal=0;
            }
 
        System.out.println("Canal: "+canal);
        }
    }   
    
    
    public void bajarCanal(){
        if(poder){
            if(canal>0){
                canal--;
            }else{
                canal=100;
            }
 
        System.out.println("Canal: "+canal);
        }
    }
    
}
