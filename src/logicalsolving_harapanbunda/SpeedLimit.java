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
public class SpeedLimit {
    public static void main(String[] args) {
        double speed, poin;

        Scanner input = new Scanner(System.in);
        System.out.print("======= Speed Limit ======= \n Speed : ");
        speed = input.nextDouble();

        if (speed <= 70) {
            System.out.println("Ok.");
        } else if (speed > 70) {
            speed = (speed - 70) / 5;
            if (speed <= 12) {
                System.out.println("Point : " + speed);
            } else {
                System.out.println("License Suspended");
            }
        }
    }
}
