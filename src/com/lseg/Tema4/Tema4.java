package com.lseg.Tema4;

public class Tema4 {

    public static void main(String[] args) {
        //Ex. 1
        //int[] array = new int[]{1,2,3,4,5,6,7,8,9,10};
        //System.out.println(rangeSum(1,10,4));

        //Ex. 2
        //System.out.println(arraySum(array,4));

        //Ex. 3
        //System.out.println(convertFromSeconds(2239));

        //Ex. 4
        //System.out.println(canPack(2,2,11));
    }

    //Ex. 1
    static boolean seDivide(int n, int divizor){
        if(n>0 && (n%divizor==0)){return true;}
        return false;
    }

    static int rangeSum(int start, int end, int divizor)
    {
        int suma = 0;
        if(end>=start && start>0 && end>0){
            for(int i=start;i<=end;i++)
            {
                if (seDivide(i,divizor)){suma+=i;}
            }
        }else{
            return -1;
        }
        return suma;
    }

    //Ex. 2
    static int arraySum(int[] array, int divizor){
        int suma=0;
        if(array[array.length-1]>=array[0] && array[0]>0 && array[array.length-1]>0) {
            for (int a : array) {
                if (seDivide(a, divizor)) {
                    suma += a;
                }
            }
        }
        else{return -1;}
        return suma;
    }

    //Ex. 3
    static String convertFromSeconds(int numberOfSeconds) {
        //61 seconds H0-M1-S1
        int s = numberOfSeconds % 60;
        int m = (numberOfSeconds % 3600) / 60;
        int h = numberOfSeconds / 3600;

        return "H" + h + "-M" + m + "-S" + s;
    }

    //Ex. 4
    static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount<0||smallCount<0||goal<0){return false;}
        int totalCount = 5*bigCount+smallCount;
        if(totalCount>goal){
            //de cate ori intra bigCount in goal
            int bigCountInGoal = goal/5;
            if(bigCountInGoal*5+smallCount>=goal){return true;}
        }
        return false;
    }
}

