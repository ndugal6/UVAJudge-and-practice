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
import java.util.*;
import java.io.*;
import java.awt.image.*;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.util.concurrent.ThreadLocalRandom;

public class DrawingPics {

    public static void main(String[] args) {
        int min = 0;
        int max = 50;
        BufferedImage off_Image;
        Graphics2D g2;
        for (int i = 0; i < 2000; i++) {
            int random = ThreadLocalRandom.current().nextInt(min, max + 1);
            off_Image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);
            g2 = off_Image.createGraphics();
            String suffix = i + ".png";
            drawHorizontalLine(off_Image, g2, suffix, random);
        }
        for (int i = 0; i < 2000; i++) {
            int random = ThreadLocalRandom.current().nextInt(min, max + 1);
            off_Image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);
            g2 = off_Image.createGraphics();
            String suffix = i + ".png";
            drawVerticalLine(off_Image, g2, suffix, random);
        }
    }
    /*
    creates photos with horizonal line in it
    */
    public static void drawHorizontalLine(BufferedImage off_Image, Graphics2D g2, String name, int random) {
        g2.drawLine(random, random, random+50, random);
        save(off_Image, "horizontal" + name);
        
    }
    
    public static void drawVerticalLine(BufferedImage off_Image, Graphics2D g2, String name, int random) {
        
        g2.drawLine(random, random, random, random+50);
        save(off_Image, "vertical" + name);
        
    }
    public static void drawWave(BufferedImage off_Image, Graphics2D g2, String name, int random) {
        QuadCurve2D.Double curve = new QuadCurve2D.Double(25,50,50,85,75,50);
//        int randomy = ThreadLocalRandom.current().nextInt(0,51);
//        int randMid = ThreadLocalRandom.current().nextInt(0,11);
//        QuadCurve2D.Double curve = new QuadCurve2D.Double(random,randomy,random+5,randomy+5, random+10, randomy+10);
        
        g2.draw(curve);
        save(off_Image, "wave" + name);
        
    }
    
    public static void save(BufferedImage image, String name) {
        try {
            ImageIO.write(image, "png", new File(name));
        } catch (IOException e) {}
    }
    
}
