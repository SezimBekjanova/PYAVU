package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class PYAVU2PART1Controller {
    PYAVU2PART1 pyavu2PART1 = new PYAVU2PART1();
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    void showPr2P2() throws Exception {
        List<Integer> array = new ArrayList<>();
        for (int i = -5; i < 10; i++) {
            array.add(i);
        }
        System.out.println("Task №2");
        pyavu2PART1.replacementLessThanAGivenNumber2();
        System.out.println("1) NEXT\n2)BREAK");
        int task3 = scanner.nextInt();
        switch (task3) {
            case 1: {
                System.out.println("Task №3");
                pyavu2PART1.replaceNumbersInInterval3();
                System.out.println("1) NEXT\n2)BREAK");
                int task4 = scanner.nextInt();
                switch (task4) {
                    case 1: {
                        System.out.println("Task №4");
                        pyavu2PART1.replaceNegativeNonMultipleNumbers34();
                        System.out.println("1) NEXT\n2)BREAK");
                        int task5 = scanner.nextInt();
                        switch (task5) {
                            case 1: {
                                System.out.println("Task №5");
                                pyavu2PART1.increaseBy2Times5();
                                System.out.println("1) NEXT\n2)BREAK");
                                int task6 = scanner.nextInt();
                                switch (task6) {
                                    case 1: {
                                        System.out.println("Task №6");
                                        pyavu2PART1.average6();
                                        System.out.println("1) NEXT\n2)BREAK");
                                        int task7 = scanner.nextInt();
                                        switch (task7) {
                                            case 1: {
                                                System.out.println("Task №7");
                                                pyavu2PART1.arithmeticMeanOfNegativeNumbers7();
                                                System.out.println("1) NEXT\n2)BREAK");
                                                int task8 = scanner.nextInt();
                                                switch (task8) {
                                                    case 1: {
                                                        System.out.println("Task №8");
                                                        pyavu2PART1.numberOfOddElements8();
                                                        System.out.println("1) NEXT\n2)BREAK");
                                                        int task9 = scanner.nextInt();
                                                        switch (task9) {
                                                            case 1: {
                                                                System.out.println("Task №9");
                                                                pyavu2PART1.amountInterval9();
                                                                System.out.println("1) NEXT\n2)BREAK");
                                                                int task10 = scanner.nextInt();
                                                                switch (task10) {
                                                                    case 1: {
                                                                        System.out.println("Task №10");
                                                                        pyavu2PART1.amount910();
                                                                        System.out.println("1) NEXT\n2)BREAK");
                                                                        int task11 = scanner.nextInt();
                                                                        switch (task11) {
                                                                            case 1: {
                                                                                System.out.println("Task №11");
                                                                                pyavu2PART1.amountOutOfRange11();
                                                                                System.out.println("1) NEXT\n2)BREAK");
                                                                                int task12 = scanner.nextInt();
                                                                                switch (task12) {
                                                                                    case 1: {
                                                                                        System.out.println("Task №12");
                                                                                        pyavu2PART1.petResultPow12();
                                                                                        System.out.println("1) NEXT\n2)BREAK");
                                                                                        int task13 = scanner.nextInt();
                                                                                        switch (task13) {
                                                                                            case 1: {
                                                                                                System.out.println("Task №13");
                                                                                                pyavu2PART1.moreThanGivenNumber13();
                                                                                                System.out.println("1) NEXT\n2)BREAK");
                                                                                                int task14 = scanner.nextInt();
                                                                                                switch (task14) {
                                                                                                    case 1: {
                                                                                                        System.out.println("Task №14");
                                                                                                        pyavu2PART1.getResult14();
                                                                                                        System.out.println("1) NEXT\n2)BREAK");
                                                                                                        int task15 = scanner.nextInt();
                                                                                                        switch (task15) {
                                                                                                            case 1: {
                                                                                                                System.out.println("Task №15");
                                                                                                                pyavu2PART1.getResult15();
                                                                                                                System.out.println("1) NEXT\n2)BREAK");
                                                                                                                int task16 = scanner.nextInt();
                                                                                                                switch (task16) {
                                                                                                                    case 1: {
                                                                                                                        System.out.println("Task №16");
                                                                                                                        pyavu2PART1.getResult16();
                                                                                                                        System.out.println("1) NEXT\n2)BREAK");
                                                                                                                        int task17 = scanner.nextInt();
                                                                                                                        switch (task17) {
                                                                                                                            case 1: {
                                                                                                                                System.out.println("Task №17");
                                                                                                                                pyavu2PART1.getMultiplication();
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
