package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class PYAVU1 {

    int getMin2(int num1, int num2) {
        return Math.min(num1, num2);
    }

    int getMax3(int num1, int num2) {
        return Math.max(num1, num2);
    }

    double getMaxPoint4(int num1, int num2) {
        double result1 = Math.pow(num1, 3) - Math.sin(num1);
        double result2 = Math.pow(num2, 3) - Math.sin(num2);
        return Math.max(result1, result2);
    }

    double getMinPoint5(int num1, int num2) {
        double result1 = Math.cos(num1 * 2) + Math.sin(num1 - 3);
        double result2 = Math.cos(num2 * 2) + Math.sin(num2 - 3);
        return Math.min(result1, result2);
    }

    int getLowDigit6(int number) {
        int singleNumber = 0;
        int minNumber = number % 10;
        while (number != 0) {
            singleNumber = number % 10;
            number = number / 10;
            if (singleNumber < minNumber)
                minNumber = singleNumber;
        }
        return minNumber;
    }

    int getSecondNumberFromRight7(int number) {
        int result = 0;
        for (int i = 0; i < 2; i++) {
            result = number % 10;
            number /= 10;
        }
        return result;
    }

    double getSqrt8(int number){
        return Math.sqrt(number)-number;
    }

    double getResult9(double n, int x) {
        return Math.pow(x, n) / n;
    }

    List<Double> getEditArray10(){
            List<Double> array = new ArrayList<>();
            for (int i = 1; i < 11; i++)
                array.add((double) i);
        for (int i = 0; i < 10; i++)
            System.out.println(array.get(i));
            for (int i = 0; i < array.size(); i++) {
                if (array.get(i) % 2 != 0)
                    array.set(i, (double) 0);
                else
                    array.set(i, array.get(i) / 2);
            }
            return array;
        }
}
