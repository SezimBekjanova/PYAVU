package com.example.demo;

import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class PYAVU2Controller {
    Scanner scanner = new Scanner(System.in);
    PYAVU2 pyavu2 = new PYAVU2();
    Random random = new Random();
    void showPr2() throws Exception {
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            int randomNumber = random.nextInt(100);
            array.add(randomNumber);
            System.out.println(randomNumber);
        }
        System.out.println("Task №2");
        System.out.println("result : "+pyavu2.getIndexMinValues2(array));
        System.out.println("1) NEXT\n2)BREAK");
        int task3 = scanner.nextInt();
        switch (task3) {
            case 1: {
                System.out.println("Task №3");
                for (int i = 0; i < 15; i++) {
                    System.out.println(array.get(i));
                }
                System.out.println(pyavu2.replaceMaxValue3(array));
                System.out.println("1) NEXT\n2)BREAK");
                int task4 = scanner.nextInt();
                switch (task4) {
                    case 1: {
                        System.out.println("Task №4");
                        for (int i = 0; i < 15; i++) {
                            System.out.println(array.get(i));
                        }
                        System.out.println(pyavu2.replaceMinValues4(array));
                        System.out.println("1) NEXT\n2)BREAK");
                        int task5 = scanner.nextInt();
                        switch (task5) {
                            case 1: {
                                System.out.println("Task №5");
                                for (int i = 0; i < 15; i++) {
                                    System.out.println(array.get(i));
                                }
                                System.out.println(pyavu2.replaceMaxValue5(array));
                                System.out.println("1) NEXT\n2)BREAK");
                                int task6 = scanner.nextInt();
                                switch (task6) {
                                    case 1: {
                                        System.out.println("Task №6");
                                        for (int i = 0; i < 15; i++) {
                                            System.out.println(array.get(i));
                                        }
                                        System.out.println(pyavu2.replaceMaxValue6(array));
                                        System.out.println("1) NEXT\n2)BREAK");
                                        int task7 = scanner.nextInt();
                                        switch (task7) {
                                            case 1: {
                                                System.out.println("Task №7");
                                                for (int i = 0; i < 15; i++) {
                                                    System.out.println(array.get(i));
                                                }
                                                pyavu2.getIndexMin7(array);
                                                System.out.println("1) NEXT\n2)BREAK");
                                                int task8 = scanner.nextInt();
                                                switch (task8) {
                                                    case 1: {
                                                        System.out.println("Task №8");
                                                        for (int i = 0; i < 15; i++) {
                                                            System.out.println(array.get(i));
                                                        }
                                                        pyavu2.getIndexManLast8(array);
                                                        System.out.println("1) NEXT\n2)BREAK");
                                                        int task9 = scanner.nextInt();
                                                        switch (task9) {
                                                            case 1: {
                                                                System.out.println("Task №9");
                                                                for (int i = 0; i < 15; i++) {
                                                                    System.out.println(array.get(i));
                                                                }
                                                                pyavu2.getSumMaxMin9(array);
                                                                System.out.println("1) NEXT\n2)BREAK");
                                                                int task10 = scanner.nextInt();
                                                                switch (task10) {
                                                                    case 1: {
                                                                        System.out.println("Task №10");
                                                                        for (int i = 0; i < 15; i++) {
                                                                            System.out.println(array.get(i));
                                                                        }
                                                                        pyavu2.getIndexManFirst10(array);
                                                                        System.out.println("1) NEXT\n2)BREAK");
                                                                        int task11 = scanner.nextInt();
                                                                        switch (task11) {
                                                                            case 1: {
                                                                                System.out.println("Task №11");
                                                                                for (int i = 0; i < 15; i++) {
                                                                                    System.out.println(array.get(i));
                                                                                }
                                                                                pyavu2.getIndexMinLast11(array);
                                                                                break;
                                                                            }
                                                                            case 2:
                                                                                break;
                                                                            default:
                                                                                throw new Exception("ERROR");
                                                                        }
                                                                    }
                                                                    case 2:
                                                                        break;
                                                                    default:
                                                                        throw new Exception("ERROR");
                                                                }
                                                            }
                                                            case 2:
                                                                break;
                                                            default:
                                                                throw new Exception("ERROR");
                                                        }
                                                    }
                                                    case 2:
                                                        break;
                                                    default:
                                                        throw new Exception("ERROR");
                                                }
                                            }
                                            case 2:
                                                break;
                                            default:
                                                throw new Exception("ERROR");
                                        }
                                    }
                                    case 2:
                                        break;
                                    default:
                                        throw new Exception("ERROR");
                                }
                            }
                            case 2:
                                break;
                            default:
                                throw new Exception("ERROR");
                        }
                    }
                    case 2:
                        break;
                    default:
                        throw new Exception("ERROR");
                }
            }
            case 2:
                break;
            default:
                throw new Exception("ERROR");
        }
    }
}
