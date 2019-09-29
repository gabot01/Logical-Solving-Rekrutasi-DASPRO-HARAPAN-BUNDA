/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logicalsolving_harapanbunda;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author WaderJhonson
 */
public class TheBestSecond {
    public static void main(String[] args) {
        int x = 0, b = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Aplikasi menentukan Best Second");
        System.out.print("Total data : ");
        x = input.nextInt();

        System.out.println("");

        int[] nilai = new int[x];
        for (b = 0; b < x; b++) {
            System.out.print("Angka ke-" + (b + 1) + " : ");
            nilai[b] = input.nextInt();
        }
        
        Arrays.sort(nilai);
        int index = nilai.length - 1;
        while (nilai[index] == nilai[nilai.length - 1]) {
            index--;
        }
        
        System.out.println("\nBest Second : " + nilai[index]);
    }
}
