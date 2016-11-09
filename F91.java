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
class F91 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("input.txt"));
        Boolean stop = false;
        while (in.hasNextLine() && !(stop)) {
            int f = in.nextInt();
            if (f == 0) 
            { stop = true; 
            break;}
            else if (f <= 100) {
            System.out.printf("f91(%d) = 91\n", f);
            }
            else {
                System.out.printf("f91(%d) = %d\n", f, f-10);
            }
        }
    }
    
  
}

