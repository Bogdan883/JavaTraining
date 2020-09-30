package com.lseg.Tema2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Tema2 {
    public static void main(String[] args) {
        //  Exercitii FOR
        //  ex1(10);
        //  ex2(10);
        //  ex3(10);
        //  ex4(10);
        //  ex5(5);
        //  ex6(5);
        //  Ex. 7
        //  int[] arrayPrime = getPrimes(10);
        //  System.out.println(Arrays.toString(arrayPrime));

        //  Ex. 8
        //  Random random = new Random();
        //  int[] array1 = random.ints(10,1,100).toArray();
        //  System.out.println("Lista originala: "+Arrays.toString(array1));
        //  System.out.print("Lista ordonata: "+Arrays.toString(ListaOrdonata(array1)));

        // Exercitii WHILE
        // Ex. 1
        // ghicireNumar();
        // Ex. 2
        // ghicireNumarCuNumarIncercari();
        // Ex. 3
        // sumaNumere();
        // Ex. 4
        // verificareTriunghi();
        // Ex. 5
        // palindrom();
        // Ex. 6
        // ghicesteNumarCalculator();
        // Ex. 7
        // bancomat();
        // Ex. 1 - SWITCH
        // saptamana();
    }

    // Ex. 1
    static void ex1(int lungimeMatrice) {
        int rand;
        int coloana;
        for (rand = 0; rand < lungimeMatrice; rand++) {
            for (coloana = 0; coloana < lungimeMatrice; coloana++) {
                System.out.print(coloana + " ");

            }
            System.out.println();
        }
        System.out.println();
    }

    // Ex. 2
    static void ex2(int lungimeMatrice) {
        int rand;
        int coloana;
        for (rand = 0; rand < lungimeMatrice; rand++) {
            for (coloana = 0; coloana < lungimeMatrice; coloana++) {
                if (rand == coloana) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    //Ex. 3
    static void ex3(int lungimeMatrice) {
        int rand;
        int coloana;
        for (rand = 0; rand < lungimeMatrice; rand++) {
            for (coloana = 0; coloana < lungimeMatrice; coloana++) {
                if (rand == coloana - 1) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    //Ex. 4
    static void ex4(int lungimeMatrice) {
        int rand;
        int coloana;
        for (rand = 0; rand < lungimeMatrice; rand++) {
            for (coloana = 0; coloana < lungimeMatrice; coloana++) {
                if (rand == lungimeMatrice - coloana - 1) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    //Ex. 5
    static void ex5(int lungimeMatrice) {
        int rand;
        int coloana;
        for (rand = 0; rand < lungimeMatrice; rand++) {
            for (coloana = 0; coloana <= rand; coloana++) {
                System.out.print(rand + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    //Ex. 6
    static void ex6(int lungimeMatrice) {
        int rand;
        int coloana;
        for (rand = 0; rand < lungimeMatrice; rand++) {
            for (coloana = 0; coloana <= lungimeMatrice - rand - 1; coloana++) {
                System.out.print(rand + 1 + " ");
            }
            System.out.println();
        }

    }

    //Ex. 7
    static boolean IsPrime(int numar) {
        boolean ePrim = true;
        for (int i = 2; i <= numar / 2; i++) {
            if (numar % i == 0) {
                ePrim = false;
                break;
            }

        }
        return ePrim;
    }

    static int[] getPrimes(int n) {
        int j = 0;
        int[] primes = new int[n];
        for (int i = 2; i <= n; i++) {
            if (IsPrime(i)) {
                primes[j] = i;
                j++;
            }
        }
        return primes;
    }

    //Ex. 8
    static int[] ListaOrdonata(int[] lista) {
        int temp;
        for (int i = 1; i < lista.length; i++) {
            for (int j = i; j > 0; j--) {
                if (lista[j] < lista[j - 1]) {
                    temp = lista[j];
                    lista[j] = lista[j - 1];
                    lista[j - 1] = temp;
                }
            }
        }
        return lista;
    }

    //Exercitii WHILE
    // Ex. 1
    static void ghicireNumar() {
        Random random = new Random();
        int numarDeGhicit = random.nextInt(11);
        System.out.println("Ghiciti un numar intre 1 si 10.");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul: ");
        int numarIntrodusDeLaTastatura = scanner.nextInt();

        while (numarDeGhicit != numarIntrodusDeLaTastatura) {
            if (numarIntrodusDeLaTastatura < numarDeGhicit) {
                System.out.println("Numarul cautat este mai mare!");
            } else {
                System.out.println("Numarul cautat este mai mic!");
            }
            System.out.println("Introduceti numarul: ");
            numarIntrodusDeLaTastatura = scanner.nextInt();

        }
        System.out.println("Felicitari!! Ati ghicit numarul!!");
    }

    //Ex. 2
    static void ghicireNumarCuNumarIncercari() {
        Random random = new Random();
        int numarDeGhicit = random.nextInt(11);
        System.out.println("Ghiciti un numar intre 1 si 10.");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul: ");
        int numarIntrodusDeLaTastatura = scanner.nextInt();
        int numarDeIncercari = 1;
        while (numarDeGhicit != numarIntrodusDeLaTastatura) {
            if (numarIntrodusDeLaTastatura < numarDeGhicit) {
                System.out.println("Numarul cautat este mai mare!");
            } else {
                System.out.println("Numarul cautat este mai mic!");
            }
            System.out.println("Introduceti numarul: ");
            numarIntrodusDeLaTastatura = scanner.nextInt();
            numarDeIncercari++;
        }
        System.out.println("Felicitari!! Ati ghicit numarul!!");
        System.out.print("Numarul de incercari a fost: " + numarDeIncercari);
    }

    //Ex. 3
    static void sumaNumere() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul: ");
        int numarIntrodusDeLaTastatura = scanner.nextInt();
        int suma = 0;
        while (numarIntrodusDeLaTastatura != 0) {
            suma = suma + numarIntrodusDeLaTastatura;
            System.out.println("Suma este: " + suma);
            System.out.println("Introduceti numarul: ");
            numarIntrodusDeLaTastatura = scanner.nextInt();
        }
        System.out.println("Suma finala este: " + suma);
    }

    // Ex. 4 (mi se pare mai usor cu IF)
    static void verificareTriunghi() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti latura a: ");
        int a = scanner.nextInt();
        System.out.println("Introduceti latura b: ");
        int b = scanner.nextInt();
        System.out.println("Introduceti latura c: ");
        int c = scanner.nextInt();

        if ((a > 0 && b > 0 && c > 0) && (a + b > c || a + c > b || b + c > a)) {
            System.out.println("Se poate forma un triunghi");
        } else
            System.out.print("Nu se poate forma un triunghi");
    }

    // Ex. 5
    static void palindrom() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul: ");
        int n_initial = scanner.nextInt();
        int n = n_initial;
        int n_invers = 0;
        int ultimaCifra;
        while (n != 0) {
            ultimaCifra = n % 10; //extragem ultima cifra
            n = n / 10;  //taiem ultima cifra din n
            n_invers = n_invers * 10 + ultimaCifra; //construim numarul invers
        }
        if (n_initial == n_invers) {
            System.out.print("Numarul este palindrom");
        } else {
            System.out.print("Numarul nu este palindrom");
        }
    }

    // Ex. 6
    static void ghicesteNumarCalculator() {
        System.out.println("Gandeste-te la un numar intre 1 si 100.");
        System.out.println("Cand esti gata apasa Enter!");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        Random rand = new Random();
        int randNum;
        int max = 100;
        int min = 1;
        String Raspuns;
        do {
            randNum = (max + min + 1) / 2;
            System.out.println("Cred ca numarul este " + randNum);
            System.out.println("Scrie 'da' daca am ghicit numarul");
            System.out.println("Scrie 'mic' daca numarul este mai mic decat numarul la care te-ai gandit");
            System.out.println("Scrie 'mare' daca numarul este mai mare decat numarul la care te-ai gandit");
            Raspuns = scanner.nextLine();

            if (Raspuns.equals("mic")) {  //prea mic
                min = randNum + 1;
            } else if (Raspuns.equals("mare")) { // prea mare
                max = randNum - 1;
            }
        } while (!Raspuns.equals("da"));

        scanner.close();
        System.out.println("Corect!");
    }

    // Ex. 7
    static void bancomat() {
        Scanner scanner = new Scanner(System.in);
        int pinCorect = 1234;
        int count = 0;
        boolean pinValid = false;
        do {
            System.out.println("Introduceti PIN-ul: ");
            int pinIntrodus = scanner.nextInt();
            if (pinIntrodus == pinCorect) {
                System.out.println("PIN-ul este corect!");
                pinValid = true;
            } else {
                System.out.println("PIN-ul este incorect!");
                count++;
            }
        }
        while (!pinValid && count < 3);
        if (count == 3) {
            System.out.println("Card blocat! Numar maxim de incercari atins!");
        }
    }

    // Ex. 1 - SWITCH
    static void saptamana() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar intre 0 si 6: ");
        int numar = scanner.nextInt();
        switch (numar) {
            case 0:
                System.out.println("Duminica");
                break;
            case 1:
                System.out.println("Luni");
                break;
            case 2:
                System.out.println("Marti");
                break;
            case 3:
                System.out.println("Miercuri");
                break;
            case 4:
                System.out.println("Joi");
                break;
            case 5:
                System.out.println("Vineri");
                break;
            case 6:
                System.out.println("Sambata");
                break;
            default:
                System.out.println("Numarul nu este intre 0 si 6");
        }
    }
}

