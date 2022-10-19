package com.audi;

import java.util.Scanner;

public class Saat {
    public static void main(String[] args) {
        while(true) {
            System.out.println("---------Enter hours: ");
            Scanner console = new Scanner(System.in);
            int h = console.nextInt();
            System.out.println("---------Enter minutes: ");
            Scanner consol = new Scanner(System.in);
            int min = consol.nextInt();
            int m = min / 5, angle = 0;
            if (h > m) {
                if (h - m < 6) angle = min / 2 - 6 * (min % 5) + 30 * (h - m);
                else if (h - m > 6) angle = 360 - min / 2 + 6 * (min % 5) + 30 * (m - h);
            } else if (h < m) {
                if (m - h > 6) angle = 360 + min / 2 - 6 * (min % 5) + 30 * (h - m);
                else if (m - h < 6) angle = 30 * (m - h) + 6 * (min % 5) - min / 2;
            }
            System.out.println(angle);
        }
    }
}