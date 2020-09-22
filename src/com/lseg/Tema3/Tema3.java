package com.lseg.Tema3;

public class Tema3 {
    public static void main(String[] args) {
        //Ex. 1
        //System.out.println("km/h: "+ConvertToKmPerHour(60));

        //Ex. 2
        //System.out.println(shouldWakeUp(true, 7));

        //Ex. 3
        //System.out.println(isLeapYear(2600));

        //Ex. 4
        //System.out.println(isCatPlaying(false,35));
    }

    //Ex. 1
    static double ConvertToKmPerHour(double milesPerHour)
    {
        return milesPerHour*1.609344;
    }

    //Ex. 2
    static boolean shouldWakeUp(boolean barking, int hour) {
        if (barking) {
            if ((hour >= 0) && (hour < 8) || (hour > 22) && (hour <= 23)) {
                return true;
            }
        }
        return false;
        }
        //Ex. 3
        static boolean isLeapYear(int year){
            if (year >= 1 && year <= 9999) {
                if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
                    return true;
                } else if (year % 4 == 0 && year % 100 != 0) {
                    return true;
                }
            }
            return false;
        }
        //Ex. 4
        static boolean isCatPlaying(boolean summer, int temperature){
        if(summer && (temperature>25 && temperature<=45)){
            return true;
        }
        else if(!summer && temperature>25 && temperature<=35){
            return true;
        }
        return false;
        }

    }




