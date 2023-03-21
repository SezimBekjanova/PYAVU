package com.example.demo;

import java.util.Random;
import java.util.Scanner;

public class PYAVA_RController {
    Scanner scanner = new Scanner(System.in);
    PYAVA_R pyava_r = new PYAVA_R();

    void showPr4() throws Exception {
        System.out.println("Task №1");
        System.out.print("n : ");
        int n = scanner.nextInt();
        System.out.println(pyava_r.getResult1(n));
        System.out.println("1) NEXT\n2)BREAK");
        int task2 = scanner.nextInt();
        switch (task2) {
            case 1: {
                System.out.println("Task №2");
                System.out.print("x : ");
                int x = scanner.nextInt();
                System.out.println(pyava_r.getResult2(x));
                System.out.println("1) NEXT\n2)BREAK");
                int task3 = scanner.nextInt();
                switch (task3) {
                    case 1: {
                        System.out.println("Task №3");
                        System.out.print("x : ");
                        double x1 = scanner.nextDouble();
                        System.out.print("m : ");
                        int m = scanner.nextInt();
                        System.out.print("n : ");
                        int n10 = scanner.nextInt();
                        System.out.println(pyava_r.getResult10(x1, m, n10));
                        System.out.println("1) NEXT\n2)BREAK");
                        int task4 = scanner.nextInt();
                        switch (task4) {
                            case 1: {
                                System.out.println("Task №4");
                                System.out.print("n : ");
                                int n4 = scanner.nextInt();
                                pyava_r.getResult6part2(n4,1);
                                System.out.println("1) NEXT\n2)BREAK");
                                int task5 = scanner.nextInt();
                                switch (task5) {
                                    case 1: {
                                        System.out.println("Task №5");
                                        System.out.print("n : ");
                                        int n5 = scanner.nextInt();
                                        pyava_r.getResult6part3(n5,1);
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
