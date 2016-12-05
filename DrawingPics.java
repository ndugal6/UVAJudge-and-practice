/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.UVAJudge;

/**
 *
 * @author nickdugal
 */
import java.awt.Graphics2D;
import java.awt.geom.QuadCurve2D;
import java.io.*;
import java.awt.image.*;
import javax.imageio.ImageIO;
import java.util.concurrent.ThreadLocalRandom;

public class DrawingPics {

    public static void main(String[] args) {
        int min = 0;
        int max = 40;
        BufferedImage off_Image;
        Graphics2D g2;
        for (int i = 0; i < 20000; i++) {
            off_Image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);
            g2 = off_Image.createGraphics();
            String suffix = i + ".JPEG";
            int random = ThreadLocalRandom.current().nextInt(min, max + 1);
            //drawWave(off_Image, g2, suffix, random);
            //drawHorizontalLine(off_Image, g2, suffix, random);
            drawVerticalLine(off_Image, g2, suffix, random);
        }
    }
    /*
    creates photos with horizonal line in it
    */
    public static void drawHorizontalLine(BufferedImage off_Image, Graphics2D g2, String name, int random) {
        g2.drawLine(random, random, random+50, random);
        save(off_Image, "horizontal/horizontal" + name);
        
    }
    
    public static void drawVerticalLine(BufferedImage off_Image, Graphics2D g2, String name, int random) {
        
        g2.drawLine(random, random, random, random+50);
        save(off_Image, "vertical/vertical" + name);
        
    }
    public static void drawWave(BufferedImage off_Image, Graphics2D g2, String name, int random) {
        double y1 = 50;
        double randomY = ThreadLocalRandom.current().nextInt(1, 40 + 1);
        while (random+10 < 100) { 
            while (Math.abs(randomY)+y1 >= 100) {
                randomY = ThreadLocalRandom.current().nextInt(1, 20 + 1);
            }
            QuadCurve2D.Double curve = new QuadCurve2D.Double(random,y1,random+5,y1+randomY,random+10,y1);
            randomY *= -1;
            random += 10;
            g2.draw(curve);
        }
        save(off_Image, "oscilating/wave" + name);
        
    }
    
    public static void save(BufferedImage image, String name) {
        try {
            //Name is new file being added, before that is full path to local folder
            ImageIO.write(image, "jpeg", new File("/users/nickdugal/desktop/pics/"+name));
        } catch (IOException e) {}
    }
    
}
