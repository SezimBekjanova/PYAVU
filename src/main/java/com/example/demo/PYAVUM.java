package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class PYAVUM {

    List<Integer> array() {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(-3);
        array.add(6);
        array.add(7);
        array.add(45);
        array.add(-7);
        array.add(2);
        array.add(5);
        array.add(-4);
        array.add(-6);
        return array;
    }

    void taskM1() throws Exception {
        try {
            int sum = 0;
            int j = 0;
            int[] array = new int[]{1, -3, 6, 7, 45, -7, 2, 5, -4, -6};
            for (int i = 0; i < array.length; i++)
                System.out.println("[" + i + "]" + " = " + array[i]);
            for (int i = 0; i < array.length; i++) {
                if (array[i] > 0 && array[i + 1] < 0) {
                    j++;
                    sum += array[i];
                }
            }
            System.out.println(sum / j);
        } catch (Throwable e) {
            throw new Exception("ERROR");
        }
    }

    void taskM2() throws Exception {
        try {
            List<Integer> array = array();
            for (int i = 0; i < array.size(); i++)
                System.out.println("[" + i + "]" + " = " + array.get(i));
            int maxI = 0;
            int minI = 0;
            int maxValue = array.get(0);
            int minValue = array.get(0);
            for (int i = 0; i < array.size(); i++) {
                if (array.get(i) > maxValue) {
                    maxValue = array.get(i);
                    maxI = i;
                }https://programforyou.ru/block-diagram-redactor?ysclid=lfitm9iz5n540950721
                if (array.get(i) < minValue) {
                    minValue = array.get(i);
                    minI = i;
                }
            }
            array.remove(maxI - 1);
            array.remove(minI - 1);
            System.out.println("\n");
            for (int i = 0; i < array.size(); i++)
                System.out.println("[" + i + "]" + " = " + array.get(i));
        } catch (Throwable e) {
            throw new Exception("ERROR");
        }
    }

    void task3() throws Exception {
        try {
            List<Integer> array = array();
            for (int i = 0; i < array.size(); i++)
                System.out.println("[" + i + "]" + " = " + array.get(i));
            for (int i = array.size() - 1; i > 0; i--) {
                if (array.get(i) > 0)
                    array.set(i, array.get(0));
            }
            System.out.println("\n");
            for (int i = 0; i < array.size(); i++)
                System.out.println("[" + i + "]" + " = " + array.get(i));
        } catch (Throwable e) {
            throw new Exception("ERROR");
        }
    }

    void task4() throws Exception {
        try {
            List<Integer> array = array();
            for (int i = 0; i < array.size(); i++)
                System.out.println("[" + i + "]" + " = " + array.get(i));
            for (int i = 0; i < array.size(); i++) {
                if (array.size() > 1 + i)
                    if (array.get(i) < array.get(i + 1)) {
                        System.out.println("no");
                        break;
                    }
                if (i == array.size() - 1)
                    System.out.println("yes");
            }
        } catch (Throwable e) {
            throw new Exception("ERROR");
        }
    }

}
