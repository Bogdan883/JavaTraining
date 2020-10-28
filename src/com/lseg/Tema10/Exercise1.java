package com.lseg.Tema10;

import java.io.*;
import java.util.*;


public class Exercise1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        try {
            try {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                System.out.println(x / y);
            } catch (InputMismatchException error) {
                System.out.println("java.util.InputMismatchException");
            }

        } catch (Exception error) {
            System.out.println(error);
        }

    }
}