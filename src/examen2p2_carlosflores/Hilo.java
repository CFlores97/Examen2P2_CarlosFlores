
package examen2p2_carlosflores;

import javax.swing.JProgressBar;


public class Hilo extends Thread{
    private JProgressBar jp;
    private boolean vive;
    private double duracion;

    public Hilo(JProgressBar jp, boolean vive, double duracion) {
        this.jp = jp;
        this.vive = vive;
        this.duracion = duracion;
        
        double s = jp.getMaximum() * duracion;
    }

    @Override
    public void run() {
        while(vive){
            if(jp.getValue() >= 100){
                jp.setValue(0);
                vive = false;
                jp.setMaximum(60);
            }
            else{
                jp.setValue(jp.getValue() + 1);
            }
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    
    
    
    
}
