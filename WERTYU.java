/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nickdugal
 */
import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String toChar = in.nextLine();
            toChar = toChar.replace(' ', 'a');
            System.out.println((correct(toChar.toLowerCase())).toUpperCase());
            }
        }
        
        

    
   public static String correct(String wrong) {
       StringBuilder right = new StringBuilder();
       for (int i = 0; i < wrong.length(); i++) {
           if (wrong.charAt(i) == 'a') {
               right.append(' ');
           }
           else {
               right.append(newChar(wrong.charAt(i)));
           }
       }
       return right.toString();
   }
   
   public static char newChar(char wrong) {
       switch(wrong) {
           case 'w': wrong = 'q';
               break;
           case 's': wrong = 'a';
               break;
           case 'x': wrong = 'z';
               break;
           case 'e': wrong = 'w';
               break;
           case 'd': wrong = 's';
               break;
           case 'c': wrong = 'x';
               break;
           case 'r': wrong = 'e';
               break;
           case 'f': wrong = 'd';
               break;
           case 'v': wrong = 'c';
               break;
           case 't': wrong = 'r';
               break;
           case 'g': wrong = 'f';
               break;
           case 'b': wrong = 'v';
               break;
           case 'y': wrong = 't';
               break;
           case 'h': wrong = 'g';
               break;
           case 'n': wrong = 'b';
               break;
           case 'u': wrong = 'y';
               break;
           case 'j': wrong = 'h';
               break;
           case 'm': wrong = 'n';
               break;
           case 'i': wrong = 'u';
               break;
           case 'k': wrong = 'j';
               break;
           case ',': wrong = 'm';
               break;
           case 'o': wrong = 'i';
               break;
           case 'l': wrong = 'k';
               break;
           case '.': wrong = ',';
               break;
           case 'p': wrong = 'o';
               break;
           case ';': wrong = 'l';
               break;
           case '/': wrong = '.';
               break;
           case '[': wrong = 'p';
               break;
           case '\'': wrong = ';';
               break;
           case ']': wrong = '[';
               break;
           case '\\': wrong = ']';
               break;
           case '1': wrong = '`';
               break;
           case '2': wrong = '1';
               break;
           case '3': wrong = '2';
               break;
           case '4': wrong = '3';
               break;
           case '5': wrong = '4';
               break;
           case '6': wrong = '5';
               break;
           case '7': wrong = '6';
               break;
           case '8': wrong = '7';
               break;
           case '9': wrong = '8';
               break;
           case '0': wrong = '9';
               break;
           case '-': wrong = '0';
               break;
           case '=': wrong = '-';
               break;
           default : wrong = wrong;
               break;
               
       }
       return wrong;
   }
}
