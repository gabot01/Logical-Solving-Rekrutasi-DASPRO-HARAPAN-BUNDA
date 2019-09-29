/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logicalsolving_harapanbunda;

import java.util.Scanner;

/**
 *
 * @author WaderJhonson
 */
public class PersamaanLinear {
    public static void main(String[] args) {
        String persamaan, aa, bb, cc;
        float a, b, c;
        float x;
        Scanner input = new Scanner(System.in);

        System.out.print("Persamaan : ");

        persamaan = input.next();
        aa = persamaan.substring(0, persamaan.indexOf("x"));
        if ("".equals(aa)){
            aa = "1";
        }
        a = Float.parseFloat(aa);
        System.out.println("a = " + a);

        bb = persamaan.substring(persamaan.indexOf("x") + 1);
        bb = bb.substring(0, bb.indexOf("="));

        bb = bb.replaceAll("[+]", "");

        if ("".equals(bb)) {
            bb = "0";
        }

        b = Float.parseFloat(bb);
        System.out.println("b = " + b);

        cc = persamaan.substring(persamaan.indexOf("=") + 1);
        c = Float.parseFloat(cc);
        System.out.println("c = " + c);
        int min = -1;
        x = ((b * min) + c) / a;
        System.out.println("x = " + x);
    }
}
