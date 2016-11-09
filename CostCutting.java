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
public class CostCutting {
    
    
    public static void main(String[] args) throws FileNotFoundException {
//        Scanner in = new Scanner(System.in);
        Scanner in = new Scanner(new File("input.txt"));
        int cases = in.nextInt();
        int survivor;
        for(int i =1; i <=cases; i++) {
            survivor = solve(in.nextInt(),in.nextInt(),in.nextInt());
            System.out.printf("Case %d: %d\n", i,survivor);
        }
    }
    
    public static int solve(int one, int two, int three) {
        int max = Math.max(one,Math.max(two, three));
        int min = Math.min(one, Math.min(two,three));
        if (one == max) {
            one = max = -1;
        } else if (one == min) {
            one = min = -1;
        }
        if (two == max || two == min)
            two = -1;
        if (one + two == -2)
            return three;
        return (one == -1 ? two: one);
            
    }
}
