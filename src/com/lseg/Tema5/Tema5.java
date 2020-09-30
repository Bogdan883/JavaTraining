package com.lseg.Tema5;

import java.util.Scanner;

public class Tema5 {
    public static void main(String[] args) {
        //Ex. 1 - Am updatat Tema1, restul sunt deja facute cu functii;

        //Ex. 2
        //conutNumbers();

        //Ex. 3
        //System.out.println(ridicareLaPutere(2, 3));
        //System.out.println(factorial(4));
        //calculSinX(3, 5);

        //Ex. 4
        System.out.println(rangeSum(1, 10, 4));

    }

    //Ex. 2
    static void conutNumbers() {

        Scanner scanner = new Scanner(System.in);
        int pozitive = 0;
        int negative = 0;
        int zero = 0;
        int numar;
        String exit;
        do {
            System.out.println("Introdu numarul:");
            numar = scanner.nextInt();
            System.out.println("Scrie 'esc' daca ai terminat altfel apasa Enter");
            scanner.nextLine();
            exit = scanner.nextLine();
            if (numar > 0) {
                pozitive++;
            } else if (numar < 0) {
                negative++;
            } else {
                zero++;
            }
        }
        while (!(exit.equals("esc")));
        System.out.println("Pozitive: " + pozitive);
        System.out.println("Negative: " + negative);
        System.out.println("Zero: " + zero);
    }

    //Ex. 3
    static double ridicareLaPutere(double x, int n) {
        double rezultat = 1;
        for (int i = 1; i <= n; i++) {
            rezultat = rezultat * x;
        }
        return rezultat;
    }

    static double factorial(int n) {
        double factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    static void calculSinX(double x, int n) {
        //formula sin x = x-x^3/3!+x^5/5!-x^7/7!+...+x^n/n!
        double sinX = x;
        boolean scadere = true;
        for (int i = 3; i <= n; i += 2) {
            if (scadere) {
                sinX = sinX - (ridicareLaPutere(x, i)) / factorial(i);
                scadere = false;
            } else {
                sinX = sinX + (ridicareLaPutere(x, i)) / factorial(i);
                scadere = true;
            }
        }
        System.out.print("Sinus de x este: " + sinX);
    }

    //Ex. 4 (Ex. 1 din Tema4 facut cu while in loc de for)
    static boolean seDivide(int n, int divizor) {
        if (n > 0 && (n % divizor == 0)) {
            return true;
        }
        return false;
    }

    static int rangeSum(int start, int end, int divizor) {
        int suma = 0;
        if (end >= start && start > 0 && end > 0) {
            int i = 1;
            while (i <= end) {
                if (seDivide(i, divizor)) {
                    suma += i;
                }
                i++;
            }
        } else {
            return -1;
        }
        return suma;
    }

}
