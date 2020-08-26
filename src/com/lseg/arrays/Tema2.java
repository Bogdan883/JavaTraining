package com.lseg.arrays;

public class Tema2 {
    public static void main(String[] args)
    {
        ex1(10);
        ex2(10);
        ex3(10);
        ex4(10);
        ex5(5);
        ex6(5);

    }
    // primele 6 exercitii, revin cu restul zilele urmatoare
    // ex. 1
    static void ex1(int lungimeMatrice)
    {
        int rand;
        int coloana;
        for ( rand = 0; rand < lungimeMatrice; rand++)
        {
            for (coloana = 0; coloana < lungimeMatrice; coloana++)
            {
                System.out.print(coloana+" ");

            }
            System.out.println();
        }
        System.out.println();
    }
    // ex. 2
    static void ex2(int lungimeMatrice)
    {
        int rand;
        int coloana;
        for (rand = 0; rand < lungimeMatrice; rand++)
        {
            for (coloana = 0; coloana< lungimeMatrice; coloana++)
            {
                if (rand == coloana)
                {
                    System.out.print(1+" ");
                }
                else
                    {
                        System.out.print(0+" ");
                    }
            }
            System.out.println();
        }
        System.out.println();
    }

    //Ex. 3
    static void ex3(int lungimeMatrice)
    {
        int rand;
        int coloana;
        for (rand = 0; rand < lungimeMatrice; rand++)
        {
            for (coloana = 0; coloana < lungimeMatrice; coloana++)
            {
                if (rand == coloana-1)
                {
                    System.out.print(1+" ");
                }
                else
                    {
                        System.out.print(0+" ");
                    }
            }
            System.out.println();
        }
        System.out.println();
    }

    //Ex. 4
    static void ex4(int lungimeMatrice)
    {
        int rand;
        int coloana;
        for (rand = 0; rand < lungimeMatrice; rand++)
        {
            for(coloana = 0; coloana < lungimeMatrice; coloana++)
            {
                if (rand == lungimeMatrice-coloana-1)
                {
                    System.out.print(1+" ");
                }
                else
                    {
                        System.out.print(0+" ");
                    }
            }
            System.out.println();
        }
        System.out.println();
    }

    //Ex. 5
    static void ex5(int lungimeMatrice)
    {
        int rand;
        int coloana;
        for (rand = 0; rand < lungimeMatrice; rand++)
        {
            for (coloana = 0; coloana <= rand; coloana++)
            {
                System.out.print(rand+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    //Ex. 6
    static void ex6(int lungimeMatrice)
    {
        int rand;
        int coloana;
        for (rand = 0; rand < lungimeMatrice; rand ++)
        {
            for (coloana = 0; coloana <= lungimeMatrice-rand-1; coloana++)
            {
                System.out.print(rand+1+" ");
            }
            System.out.println();
        }

    }

}
