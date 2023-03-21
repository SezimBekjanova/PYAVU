package com.example.demo;

import java.util.Scanner;

public class PYAVUMController {
    PYAVUM pyavum = new PYAVUM();
    Scanner scanner = new Scanner(System.in);

    void showM() throws Exception {
        System.out.println("Task №1");
        pyavum.taskM1();
        System.out.println("1) NEXT\n2)BREAK");
        int task2 = scanner.nextInt();
        switch (task2) {
            case 1: {
                System.out.println("Task №2");
                pyavum.taskM2();
                System.out.println("1) NEXT\n2)BREAK");
                int task3 = scanner.nextInt();
                switch (task3) {
                    case 1: {
                        System.out.println("Task №3");
                        pyavum.task3();
                        System.out.println("1) NEXT\n2)BREAK");
                        int task4 = scanner.nextInt();
                        switch (task4) {
                            case 1: {
                                System.out.println("Task №4");
                                pyavum.task4();
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
