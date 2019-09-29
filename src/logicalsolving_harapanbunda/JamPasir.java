/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logicalsolving_harapanbunda;

import Library.Helper;
import java.util.Scanner;

/**
 *
 * @author WaderJhonson
 */
public class JamPasir{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        System.out.print("| Masukkan Baris : ");
        int num = sc.nextInt();
        
        System.out.print("| Masukkan Pola  : "); 
        sc.nextLine();
        String patern = sc.nextLine();
        
        println("===============================");
        hourGlass(num,patern);
    }
    
    static void hourGlass(int row, String p){
        int col;
        
        for(col = row; col >= 1; col--){ 
            print("|"); space(row - col);
            
            print("\\");
            grain(row, col, p);
            print("/");
            
            space(row - col); println("|");
        }
  
        for(col = 1; col <= row; col++){
            print("|"); space(row - col);
            
            print("/");
            grain(row, col, p);
            print("\\");
            
            space(row - col); println("|");
        }
        
    }
    
    static void grain(int row, int col, String p){
        for(int k = 1; k < limit(col);k++) print(p);
    }
    
    static void space(int num){
        for(int j = 1; j <= num; j++) print(" ");
    }
    
    static int limit(int n){
        return 2 * n - 1;
    }
  
    static void print(String m){
        System.out.print(m);
    }
    
    static void println(String m){
        System.out.println(m);
    }
    
}
