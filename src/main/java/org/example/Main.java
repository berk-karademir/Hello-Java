package org.example;
public class Main {
    public static void main(String[] args) {
        System.out.println("---------    1  dog -----------");
        System.out.println(shouldWakeUp(true, 1));  // true
        System.out.println(shouldWakeUp(false, 2)); // false
        System.out.println(shouldWakeUp(true, 8));  // false
        System.out.println(shouldWakeUp(true, -1)); // false
        System.out.println("---------    2   hasTeen-----------");
        System.out.println(hasTeen(9, 99, 19));   // true
        System.out.println(hasTeen(23, 15, 42));  // true
        System.out.println(hasTeen(22, 23, 34));  // false
        System.out.println("---------    3  cat -----------");
        System.out.println(isCatPlaying(true, 10));   // false
        System.out.println(isCatPlaying(false, 36));  // false
        System.out.println(isCatPlaying(false, 35));  // true
        System.out.println("---------    4  rectangle -----------");
        System.out.println(area(5.0, 4.0));   // 20.0
        System.out.println(area(-1.0, 4.0));  // -1.0
        System.out.println("---------    5  circle -----------");
        System.out.println(area(5.0));
        System.out.println(area(-1));

    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if ( clock < 0 || clock > 23) {
            return false;
        }
        if (isBarking && clock >= 0 && clock < 8 || clock >= 20 && clock <= 23) {
            return true;
        }

        return false;
    }


    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        // Check if any of the ages fall within the teen range (13 to 19 inclusive)
        return (firstAge >= 13 && firstAge <= 19) ||
                (secondAge >= 13 && secondAge <= 19) ||
                (thirdAge >= 13 && thirdAge <= 19);
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        if (!isSummer && temp >= 25 && temp <= 35) {
            return true;
        }
        if (isSummer && temp >= 25 && temp <= 45) {
            return true;
        }
//        if (!isSummer && temp > 25 && temp < 35) {
//            return  true;
//        } else if (isSummer && temp > 25 && temp <45) {
//            return true;
//        } else {
//            return false;
//        }
        return false;
    }

    public static double area(double width, double height) {
        if (width < 0 || height < 0) {
            System.out.println("User should see: 'An error occurred, please check the inputs.'");
            return -1;

        }

        return width * height;
    }

    public static double area(double radius) {

       if ( radius < 0) {
           System.out.println("An error occurred, please check the inputs.");
           return -1;
       }
       else {
          return Math.PI*(radius*radius);
       }
    }
}
