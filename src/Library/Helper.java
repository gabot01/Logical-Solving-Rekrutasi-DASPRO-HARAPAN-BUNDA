/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Library;

/**
 *
 * @author WaderJhonson
 */
public class Helper {
    public void println(String m){
        System.out.println(m);
    }
    
    public void print(String m){
        System.out.print(m);
    }
    
    public void br(int num){
        for (int i = 0; i < num; i++) {
            System.out.println("");
        }
    }
}
