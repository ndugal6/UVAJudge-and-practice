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
import java.util.*;
import java.io.*;
public class TriangleWave {
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner in = new Scanner(new File("input.txt"));
        int cases = Integer.parseInt(in.nextLine());
        for (int i = 0; i < cases; i++) {
            in.nextLine();
            int amplitude = Integer.parseInt(in.nextLine());
            //in.nextLine();
            int freq = Integer.parseInt(in.nextLine());
            waveform(amplitude,freq);
        }
        
    }
    
    private static void waveform(int amp, int freq) {
        for (int i = 1; i <= freq; i++) {
            for (int k = 1; k < amp; k++) {
                for (int l = 1; l <= k; l++) {
                    System.out.print(k);
                }
                System.out.println();
            }
            //System.out.println();
            for (int k = amp; k > 0; k--) {
                for (int l = 1; l <= k; l++) {
                    System.out.print(k);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    
    
}
