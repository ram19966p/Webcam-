/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.imageproject;

import com.github.sarxos.webcam.Webcam;
import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author ramla
 */
public class Imageproject {

    private static Object supportedSize;

    public static void main(String[] args) {
        System.out.println("Hello World!");
           Webcam  webcam = Webcam.getDefault();
           for(Dimension supportSized: webcam.getViewSizes()){
              System.out.println(supportedSize.toString());
           }
           //try{
//            webcam.open();
//            ImageIO.write(webcam.getImage(),"JPG",new File("firstCapture jpg"));
//            webcam.close();
//        } catch (IOException ex) {
//            Logger.getLogger(Image.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
    }
}
