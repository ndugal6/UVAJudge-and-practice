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
import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws FileNotFound{
        Scanner in = new Scanner(new File("input.txt"));
        Deque<Character> stack = new ArrayDeque<Character>();
        while (in.hasNext()) {
            String toChar = in.nextLine();
            for (int i = 0; i < toChar.length(); i++) {
                stack.push(toChar.charAt(i));
            }
        }
        char first = stack.peek();
        if ( first >= 48 || first <= 57) {
            decode(stack);
        }
        else {
            encode(stack);
        }
        
    }
    
    public static void decode(ArrayDeque<Character> decStack) {
        while (!(decStack.isEmpty())) {
            System.out.print(Character.getName(String.));
        }
    }
}
