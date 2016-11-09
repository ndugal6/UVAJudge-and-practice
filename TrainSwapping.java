/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.UVAJudge;

/**
 *
 * @author Nicholas Dugal
 */
import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) throws FileNotFoundException {

        
        
//        Scanner in = new Scanner(System.in);
        Scanner in = new Scanner(new File("input.txt"));
        
        int cases = in.nextInt();
        for (int k = 1; k <= cases; k++) {
            int length = in.nextInt();
            int swaps;
            if (length == 0 || length == 1) {
                in.nextInt();
                swaps = 0;
            }
            
            else {
            int[] toSort = new int[length];
            int j = 0;
            do {
                toSort[j] = in.nextInt();
                j++;
            } while (j < length);
            swaps = bubbleSort(toSort);
            }
           
            System.out.printf("Optimal train swapping takes %d swaps.\n", swaps);
        }
    }

    public static int bubbleSort(int[] toSort) {
        int count = 0;
        int ceiling = toSort.length;
        while (ceiling > 0) {
        for (int i = 0; i < ceiling-1; i++) {
            if (toSort[i] > toSort[i+1]) {
                int bigger = toSort[i];
                toSort[i] = toSort[i+1];
                toSort[i+1] = bigger;
                count++;
            }
        }
        ceiling--;
        }
        return count;
    }
    public static void solve(long a, long b) {
        long low = (a < b ? a : b);
        long high = (b > a ? b : a);
        long largest = 0;
        while (low <= high) {
            largest = (cycle(low) > largest ? cycle(low) : largest);
            low++;
        }
        System.out.println(a + " " + b + " " + largest);
    }

    public static long cycle(long a) {
        long count = 1;
        while (a != 1) {
            if (a % 2 == 0) {
                a /= 2;
            } else {
                a = 3 * a + 1;
            }
            count++;
        }
        return count++;
    }

}
