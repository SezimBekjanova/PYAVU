package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class PYAVU2 {
    List<Integer> getIndexMinValues2(List<Integer> array) {
        //2
        int minIndexValue = array.get(0);
        List<Integer> minIndexValues = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            if (minIndexValue >= array.get(i)) {
                minIndexValue = array.get(i);
            }
        }
        for (int i = 0; i < array.size(); i++) {
            if (minIndexValue == array.get(i))
                minIndexValues.add(i);
        }
        return minIndexValues;
    }

    List<Integer> replaceMaxValue3(List<Integer> array){
        //3
        int maxIndexValue = array.get(0);
        for (int i = 0; i < array.size(); i++) {
            if (maxIndexValue < array.get(i)) {
                maxIndexValue = array.get(i);
            }
        }
        for (int i = 0; i < array.size(); i++) {
            if (maxIndexValue == array.get(i))
                array.set(i,0);
        }
        return array;
    }
    List<Integer> replaceMinValues4(List<Integer> array) {
        //4
        int minIndexValue = array.get(0);
        for (int i = 0; i < array.size(); i++) {
            if (minIndexValue > array.get(i)) {
                minIndexValue = array.get(i);
            }
        }
        for (int i = 0; i < array.size(); i++) {
            if (minIndexValue == array.get(i))
                array.set(i, -array.get(i));
        }
        return array;
    }
    List<Integer> replaceMaxValue5(List<Integer> array){
        //5
        int maxIndexValue = array.get(0);
        for (int i = 0; i < array.size(); i++) {
            if (maxIndexValue < array.get(i)) {
                maxIndexValue = array.get(i);
            }
        }
        for (int i = 0; i < array.size(); i++) {
            if (maxIndexValue == array.get(i))
                array.set(i,array.get(1));
            else if(i==array.size()-1)
                array.set(0, maxIndexValue);
        }
        return array;
    }
    List<Integer> replaceMaxValue6(List<Integer> array){
        //6
        List<Integer> indexResult = new ArrayList<>();
        int maxIndexValue = array.get(0);
        for (int i = 0; i < array.size(); i++) {
            if (maxIndexValue < array.get(i)) {
                maxIndexValue = array.get(i);
            }
        }
        for(int i=0; i<array.size(); i++){
            if(maxIndexValue!=array.get(i))
                indexResult.add(i);
        }
        return indexResult;
    }
    void getIndexMin7(List<Integer> array){
        //7
        int minIndex = array.get(0);
        for(int i=0; i<array.size(); i++){
            if(minIndex>array.get(i))
                minIndex = array.get(i);
        }
        for(int i =0; i<array.size(); i++){
            if(minIndex == array.get(i)){
                System.out.println("result :"+i);
                break;
            }
        }
    }
    void getIndexManLast8(List<Integer> array){
        //8
        int maxIndexValues = array.get(0);
        for(int i=0; i<array.size(); i++){
            if(maxIndexValues<array.get(i))
                maxIndexValues = array.get(i);
        }
        for(int i =array.size()-1; i>=0; i--){
            if(maxIndexValues == array.get(i)){
                System.out.println("result : "+i);
                break;
            }
        }
    }

    void getSumMaxMin9(List<Integer> array) throws Exception {
        //9
        int maxI = 0;
        int minI = 0;
        int sum = 0;
        int minValue = array.get(0);
        int maxValues = array.get(0);
        for (int i = 0; i < array.size(); i++) {
            if (maxValues < array.get(i)) {
                maxI = i;
                maxValues = array.get(i);
            }
            if (minValue > array.get(i)) {
                minValue = array.get(i);
                minI = i;
            }
        }
        if (minI - maxI < 0) {
            throw new Exception("Ошибка");
        } else
            for (int i = maxI+1; i < minI; i++)
                sum += array.get(i);
        System.out.println("result : "+sum);
    }
    void getIndexManFirst10(List<Integer> array){
        //10
        int maxIndexValues = array.get(0);
        for(int i=0; i<array.size(); i++){
            if(maxIndexValues<array.get(i))
                maxIndexValues = array.get(i);
        }
        for(int i =0; i<array.size(); i++){
            if(maxIndexValues == array.get(i)){
                System.out.println("result : "+i);
                break;
            }
        }
    }
    void getIndexMinLast11(List<Integer> array){
        //11
        int maxIndexValues = array.get(0);
        for(int i=0; i<array.size(); i++){
            if(maxIndexValues>array.get(i))
                maxIndexValues = array.get(i);
        }
        for(int i =array.size()-1; i>=0; i--){
            if(maxIndexValues == array.get(i)){
                System.out.println("result : "+i);
                break;
            }
        }
    }
}
