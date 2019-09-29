/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logicalsolving_harapanbunda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author WaderJhonson
 */

public class FaktorPersekutuan {
    
    private ArrayList<Integer> listFactor = new ArrayList<Integer>(); 
    private int num;
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args){
        int a;
        
        System.out.print("| Masukkan Angka Pertama : ");
        a = sc.nextInt();
        FaktorPersekutuan fp1 = new FaktorPersekutuan(a);
        
        System.out.print("| Masukkan Angka Kedua   : ");
        a = sc.nextInt();
        FaktorPersekutuan fp2 = new FaktorPersekutuan(a);
        
        System.out.println("=====================");
        System.out.print("| Faktor Dari "+ fp1.num()+ " : ");
        fp1.showFactor();
        
        System.out.println("");
        
        System.out.print("| Faktor Dari "+ fp2.num()+ " : ");
        fp2.showFactor();
        
        System.out.println("");
        
        System.out.print("| Faktor Persekutuan Dari "+ fp1.num() + " dan " + fp2.num() + " : ");
        fp1.compare(fp2.listFactor);
    }
    
    public void compare(ArrayList data){
        for(int i = 0; i < listFactor.size(); i++){
            if(data.contains(listFactor.get(i)))
                System.out.print(listFactor.get(i) + " ");
        }
    }
    
    public FaktorPersekutuan(int num){
        this.num = num;
        factorInit(num);
    }
    
    public void factorInit(int num){
        for(int i = 1; i <= num; ++i){
            if (num % i == 0)
                listFactor.add(i);
        }
    }
    
    public int num(){
        return num;
    }
    
    public void showFactor(){
        for(int i = 0; i < listFactor.size(); i++) 
            System.out.print(listFactor.get(i) + " ");
    }
}
