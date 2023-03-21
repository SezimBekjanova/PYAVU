package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PYAVU2PART1 {
    Scanner scanner = new Scanner(System.in);
    List<Integer> array(){
        List<Integer> array = new ArrayList<>();
        for (int i = -5; i < 10; i++) {
            array.add(i);
        }
        return array;
    }

    void getArray(List<Integer> array){
        for(int i = 0; i<array.size(); i++){
            System.out.println("["+i+"]"+array.get(i));
        }
    }
    void replacementLessThanAGivenNumber2(){
        List <Integer> array = array();
        getArray(array);
        System.out.print("number : ");
        int number = scanner.nextInt();
        for(int i=0; i<array.size(); i++){
            if(array.get(i)<number)
                array.set(i,number);
        }
        for (int num:array) {
            System.out.println(num);
        }
    }

    void replaceNumbersInInterval3(){
        List<Integer> array = array();
        getArray(array);
        System.out.print("a : ");
        int a = scanner.nextInt();
        System.out.print("b : ");
        int b = scanner.nextInt();
        for (int i = 0; i < array.size(); i++) {
            if (a < array.get(i) && array.get(i) < b)
                array.set(i, 0);
        }
        for (int num:array) {
            System.out.println(num);
        }
    }

    void replaceNegativeNonMultipleNumbers34(){
        List<Integer> array = array();
        getArray(array);
        int b = scanner.nextInt();
        for(int i=0; i<array.size(); i++){
            if(array.get(i)<0 && array.get(i)%3!=0)
                array.set(i,Math.abs(array.get(i)));
        }
        for (int num:array) {
            System.out.println(num);
        }
    }
    void increaseBy2Times5(){
        List<Integer> array = array();
        getArray(array);
        System.out.print("number : ");
        int number = scanner.nextInt();
        for(int i=0; i<array.size(); i++){
            if(array.get(i)<number)
                array.set(i,array.get(i)*2);
        }
        for (int num:array) {
            System.out.println(num);
        }
    }

    void average6(){
        List<Integer> array = array();
        getArray(array);
        int sum = 0;
        for (int i = 0; i < array.size(); i++)
            sum += array.get(i);
        System.out.println(sum / array.size());
    }

    void arithmeticMeanOfNegativeNumbers7() {
        List<Integer> array = array();
        getArray(array);
        int sum = 0;
        int iterator = 0;
        for (int i = 0; i < array.size(); i++)
            if (array.get(i) < 0) {
                iterator++;
                sum += array.get(i);
            }
        System.out.println(sum / iterator);
    }
    void numberOfOddElements8() {
        List<Integer> array = array();
        getArray(array);
        int iterator = 0;
        for (int i = 0; i < array.size(); i++)
            if (array.get(i)%2!=0)
                iterator++;
        System.out.println(iterator);
    }

    void amountInterval9(){
        List<Integer> array = array();
        getArray(array);
        int sum=0;
        System.out.print("a : ");
        int a = scanner.nextInt();
        System.out.print("b : ");
        int b = scanner.nextInt();
        for(int i=0; i<array.size(); i++){
            if(a<array.get(i) && array.get(i)<b)
                sum+=array.get(i);
        }
        System.out.println(sum);
    }
    void amount910(){
        List<Integer> array = array();
        getArray(array);
        int sum=0;
        int b = scanner.nextInt();
        for(int i=0; i<array.size(); i++){
            if(array.get(i)%9==0)
                sum+=array.get(i);
        }
        System.out.println(sum);
    }
    void amountOutOfRange11(){
        List<Integer> array = array();
        getArray(array);
        int iterator=0;
        System.out.print("a : ");
        int a = scanner.nextInt();
        System.out.print("b : ");
        int b = scanner.nextInt();
        for(int i=0; i<array.size(); i++){
            if(a>array.get(i) && array.get(i)>b)
                iterator++;
        }
        System.out.println(iterator);
    }
    void petResultPow12(){
        List<Integer> array = array();
        getArray(array);
        int summ=0;
        for(int i=0; i<array.size(); i++){
            if(array.get(i)%2==0)
                summ+=Math.pow(array.get(i),2);
        }
        System.out.println(summ);
    }
    void moreThanGivenNumber13(){
        List<Integer> array = array();
        getArray(array);
        System.out.print("number : ");
        int number = scanner.nextInt();
        for(int i=0; i<array.size(); i++){
            if(array.get(i)>number)
                System.out.println(i);
        }
    }
    void getResult14(){
        List<Integer> array = array();
        getArray(array);
        for(int i=0; i<array.size(); i++){
            if(array.get(i)%2!=0)
                System.out.println(i);
        }
    }
    void getResult15(){
        List<Integer> array = array();
        getArray(array);
        for(int i=0; i<array.size(); i++){
            if(array.get(i)%7!=0)
                System.out.println(i);
        }
    }
    void getResult16(){
        List<Integer> array = array();
        getArray(array);
        System.out.print("a : ");
        int a = scanner.nextInt();
        System.out.print("b : ");
        int b = scanner.nextInt();
        for(int i=0; i<array.size(); i++){
            if(a>array.get(i) && array.get(i)>b)
                System.out.println(i);
        }
    }
    void getMultiplication(){
        List<Integer> array = array();
        getArray(array);
        int multiplication = 1;
        for (int i=0; i<array.size(); i++)
            multiplication*=array.get(i);
        if (multiplication/100>=1)
            System.out.println("true");
        else
            System.out.println("false");
    }
    void getSumma(){
        List<Integer> array = array();
        getArray(array);
        int sum = 0;
        for (int i=0; i<array.size(); i++)
            sum+=array.get(i);
        if (sum/10>=1)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
