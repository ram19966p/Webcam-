
package com.mycompany.studentmanegment;
import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;
import javax.swing.JFrame;









    public class Capture {
    
    private static Object web;
      public  Capture(){
        initComponents();
        Webcam webcam  = Webcam.getDefault();
        webcam.setViewSize(WebcamResolution.VGA.getSize());
         
        
         WebcamPanel  webcamPanel  = new WebcamPanel(webcam);
         webcamPanel.setImageSizeDisplayed(true);
         webcamPanel.setFPSDisplayed(true);
         webcamPanel.setMirrored(true);
         webcamPanel.setDisplayDebugInfo(true);
         
         
        JFrame frame = new JFrame();
        frame.add(webcamPanel);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
     
               
        
        
    }

    private void initComponents() {
        }
    
}
