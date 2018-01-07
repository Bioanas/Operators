package com.ia;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1+2=" + result);

        int previousresult = result;

        result = result - 1;
        System.out.println(previousresult + "-1" + "=" + result);

        previousresult = result;

        result = result * 10;
        System.out.println(previousresult + "*10 =" + result);

        previousresult = result;

        result = result / 5;
        System.out.println(previousresult + "/5=" + result);

        previousresult = result;
        result = result % 3;
        System.out.println(previousresult + "/3=" + result);
        int secondTopScore = 81;
        int topScore = 80;
        if ((topScore > 90) || (secondTopScore <= 90))
            System.out.println("One of these test is true");

        int newValue = 50;
        if (newValue == 50)
            System.out.println("this is true");

        boolean isCar = false;
        if (isCar)
            System.out.println("this is not suposed to happen");

        //test
        double myVar = 20;
        double mySecondVar = 80;
        double sum = (myVar + mySecondVar) * 25;
        System.out.println(sum);
        double remainder = sum%40;
        System.out.println(remainder);
       if (remainder <= 20)
           System.out.println("Total was over the limit ");

    }
}
