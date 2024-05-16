package com.mycompany.studentmanegment;
import java.awt.Dimension;
import java.awt.Toolkit;
import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamEvent;
import com.github.sarxos.webcam.WebcamListener;

import java.awt.Image;
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import java.text.SimpleDateFormat;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;




public class CManegment extends javax.swing.JFrame {
Dimension  screen = Toolkit.getDefaultToolkit().getScreenSize();
    private Object ex;
       Webcam webcam = Webcam.getDefault();
    private Object imageHolder;
    Boolean  isRunning = false ;

    
    public CManegment() throws IOException {
       initComponents();
        setLocationRelativeTo(null);
             webCam();
        Webcam webcam = Webcam.getDefault();
      webcam.setViewSize(new Dimension(320,240));
      // webcam.setViewSize(WebcamResolution.VGA.getSize());
       webcam.open();
             
}

    
    public void webCam() throws IOException {
   // Webcam webcam = Webcam.getDefault();
   // webcam.setViewSize(new Dimension(320,240));
    // webcam.setViewSize(WebcamResolution.VGA.getSize());
    // for (Dimension supportedSize : webcam.getViewSizes()) {
      //  System.out.println(supportedSize.toString());
   // }

    webcam.addWebcamListener(new WebcamListener() {
        public void webcamOpen(WebcamEvent we) {
            System.out.println("Webcam open");
        }

        @Override
        public void webcamClosed(WebcamEvent we) {
            System.out.println("Webcam closed");
        }

        @Override
        public void webcamDisposed(WebcamEvent we) {
            System.out.println("Webcam disposed");
        }

        @Override
        public void webcamImageObtained(WebcamEvent we) {
            System.out.println("Image Taken");
        }
    });

   // webcam.open();

    try {
        
          
        BufferedImage image = webcam.getImage();
         
        if (image != null) {
            File directory = new File("/path/to/directory12");
            if (!directory.exists()) {
                directory.mkdirs();
            }
            String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date(System.currentTimeMillis()));

              String filename = "capture_" + timestamp + ".jpg";
            File outputFile = new File(directory, filename);
            ImageIO.write(image, "JPG", outputFile);
            System.out.println("Image captured and saved successfully: " + filename);
        } else {
            System.out.println("Error: No image captured from webcam");
        }
    } catch (IOException e) {
        System.err.println("Error capturing image or saving to file: ");
        e.printStackTrace();
    } finally {
        //webcam.close();
    }
}
    
    
    
    class VideoFeedTaker extends Thread{
             public void run(){   
                 while( isRunning){
                     
                 
                    Image image = webcam.getImage();
                   ImageHolder.setIcon(new ImageIcon(image));
                     try {
                         Thread.sleep(40);
                     } catch (InterruptedException ex) {
                         Logger.getLogger(CManegment.class.getName()).log(Level.SEVERE, null, ex);
                     }
                 }
                 
             }
             }     
    
     
     
     
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        ImageHolder = new javax.swing.JLabel();
        holder = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(getIconImages());

        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(null, " ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), java.awt.Color.magenta), new javax.swing.border.LineBorder(java.awt.Color.orange, 3, true))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 0, 0), new java.awt.Color(153, 0, 204), new java.awt.Color(0, 204, 204), new java.awt.Color(204, 204, 0)));

        b1.setBackground(new java.awt.Color(255, 102, 102));
        b1.setFont(new java.awt.Font("Segoe UI Emoji", 2, 18)); // NOI18N
        b1.setText("Principle");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setBackground(new java.awt.Color(51, 204, 0));
        b2.setFont(new java.awt.Font("Segoe UI Emoji", 2, 18)); // NOI18N
        b2.setText("HOD");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setBackground(new java.awt.Color(255, 255, 0));
        b3.setFont(new java.awt.Font("Segoe UI Emoji", 2, 18)); // NOI18N
        b3.setIcon(new javax.swing.ImageIcon("C:\\Users\\ramla\\Downloads\\TGImage2.jpg")); // NOI18N
        b3.setText("TG");
        b3.setAutoscrolls(true);
        b3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 0, 102), new java.awt.Color(0, 153, 153), null));
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b4.setBackground(new java.awt.Color(0, 255, 51));
        b4.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        b4.setText("Student");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(273, 273, 273))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 255, 204)), new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 255), 3, true)));
        jPanel3.setForeground(new java.awt.Color(255, 204, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(ImageHolder, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(ImageHolder, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        holder.setText("Capture ");
        holder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                holderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(holder, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(106, 106, 106)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(holder, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(282, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
        try{
            javax.swing.JFrame   pF = new javax.swing.JFrame();
            Student  obj  = new Student( pF  , true );
            obj.setVisible(true);
        }catch( Exception e)
        {
            System.out.println(" Error CMaanegement"+e.getMessage());
        }
    }//GEN-LAST:event_b1ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        
    }//GEN-LAST:event_b4ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        
    }//GEN-LAST:event_b2ActionPerformed

    private void holderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_holderActionPerformed
       
        if(  ! isRunning ){
            isRunning = true ;
            new VideoFeedTaker().start();
        }else {
 try {
        
           
            BufferedImage image = webcam.getImage();
         
           if (image != null) {
            File directory = new File("/path/to/directory12");
            if (!directory.exists()) {
                directory.mkdirs();
            }
            String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date(System.currentTimeMillis()));

              String filename = "capture_" + timestamp + ".jpg";
            File outputFile = new File(directory, filename);
            ImageIO.write(image, "JPG", outputFile);
            System.out.println("Image captured and saved successfully: " + filename);
        } else {
            System.out.println("Error: No image captured from webcam");
        }
           
           
           
            isRunning = false ;
             webcam.close();
 
        }  catch (IOException e) {
        System.err.println("Error capturing image or saving to file: ");
        e.printStackTrace();
    } finally {
        //webcam.close();
    }
        }       
     
    }//GEN-LAST:event_holderActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CManegment().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(CManegment.class.getName()).log(Level.SEVERE, null, ex);
                }
}
        });
        
        
         
        
         
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JLabel ImageHolder;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton holder;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables

   

   
       
 }
