package com.example.demo;

import java.util.Scanner;

public class PYAVU1Controller {
    Scanner scanner = new Scanner(System.in);
    PYAVU1 pyavu1 = new PYAVU1();
    void showPr1() throws Exception {
        System.out.println("Task №2");
        System.out.print("enter the first number : ");
        int x = scanner.nextInt();
        System.out.print("enter the second number : ");
        int y = scanner.nextInt();
        System.out.print("enter the third number : ");
        int z = scanner.nextInt();
        System.out.print("enter the fourth  number : ");
        int v = scanner.nextInt();
        int minResult = pyavu1.getMin2(pyavu1.getMin2(x, y), pyavu1.getMin2(z, v));
        System.out.println("Minimum result : " + minResult);
        System.out.println("1) NEXT\n2)BREAK");
        int task3 = scanner.nextInt();
        switch (task3) {
            case 1: {
                System.out.println("Task №3");
                System.out.print("enter the first number : ");
                int x3 = scanner.nextInt();
                System.out.print("enter the second number : ");
                int y3 = scanner.nextInt();
                int resultMax1 = pyavu1.getMax3(x3, 2 * y3 - x3);
                int resultMax2 = pyavu1.getMax3(5 * x3 + 3 * y3, y3);
                System.out.println("sum according to the given formula : " + resultMax1 + resultMax2);
                System.out.println("1) NEXT\n2)BREAK");
                int task4 = scanner.nextInt();
                switch (task4) {
                    case 1: {
                        System.out.println("Task №4");
                        System.out.print("enter the first number : ");
                        int x4 = scanner.nextInt();
                        System.out.print("enter the second number : ");
                        int y4 = scanner.nextInt();
                        System.out.println("result maximum point : " + pyavu1.getMaxPoint4(x4, y4));
                        System.out.println("1) NEXT\n2)BREAK");
                        int task5 = scanner.nextInt();
                        switch (task5) {
                            case 1: {
                                System.out.println("Task №5");
                                System.out.print("enter the first number : ");
                                int x5 = scanner.nextInt();
                                System.out.print("enter the second number : ");
                                int y5 = scanner.nextInt();
                                System.out.println("result minimum point : " + pyavu1.getMinPoint5(x5, y5));
                                System.out.println("1) NEXT\n2)BREAK");
                                int task6 = scanner.nextInt();
                                switch (task6) {
                                    case 1: {
                                        System.out.println("Task №6");
                                        System.out.print("enter (thousandth) number : ");
                                        int x6 = scanner.nextInt();
                                        System.out.println("result low digit : " + pyavu1.getLowDigit6(x6));
                                        System.out.println("1) NEXT\n2)BREAK");
                                        int task7 = scanner.nextInt();
                                        switch (task7) {
                                            case 1: {
                                                System.out.println("Task №7");
                                                System.out.print("enter the first number : ");
                                                int x7 = scanner.nextInt();
                                                System.out.print("enter the second number : ");
                                                int y7 = scanner.nextInt();
                                                System.out.print("enter the third number : ");
                                                int z7 = scanner.nextInt();
                                                System.out.println("sum by formula : " + pyavu1.getSecondNumberFromRight7(x7) + pyavu1.getSecondNumberFromRight7(y7) + pyavu1.getSecondNumberFromRight7(z7));
                                                System.out.println("1) NEXT\n2)BREAK");
                                                int task8 = scanner.nextInt();
                                                switch (task8) {
                                                    case 1: {
                                                        System.out.println("Task №8");
                                                        System.out.print("enter the  number : ");
                                                        int x8 = scanner.nextInt();
                                                        System.out.println("formula result : " + pyavu1.getSqrt8(x8));
                                                        System.out.println("1) NEXT\n2)BREAK");
                                                        int task9 = scanner.nextInt();
                                                        switch (task9) {
                                                            case 1: {
                                                                System.out.println("Task №9");
                                                                System.out.print("enter n : ");
                                                                int n9 = scanner.nextInt();
                                                                System.out.print("enter x : ");
                                                                int x9 = scanner.nextInt();
                                                                System.out.println("formula result : " + pyavu1.getResult9(n9, x9));
                                                                System.out.println("1) NEXT\n2)BREAK");
                                                                int task10 = scanner.nextInt();
                                                                switch (task10) {
                                                                    case 1: {
                                                                        System.out.println("Task №10");
                                                                        System.out.println("edit array : " + pyavu1.getEditArray10());
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
