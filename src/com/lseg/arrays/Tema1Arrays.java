package com.lseg.arrays;

public class Tema1Arrays {
    public static void main(String[] args)
    {
        // Creare array initial
        int n = 7;
        int d = 2;
        int[] a = new int[n];
        System.out.print ("Array-ul initial: ");
        for (int i = 0; i < n; i++)
        {
            a[i] = i+1;
            System.out.print (a[i]+" ");
        }
        System.out.print ("\nNumar rotatii stanga: "+d);
        // Rotatie la stanga

        for (int i = 0; i < d; i++)
        {
            int aux = a[0];
            for (int j = 0; j < n-1; j++)
            {
                a[j] = a[j+1];
            }
            a[n-1] = aux;
        }
        System.out.print("\nArray-ul final: ");
        for (int i = 0; i < a.length; i++)
        {
            System.out.print (a[i]+" ");
        }
    }
}
