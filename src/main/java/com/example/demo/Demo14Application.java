package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

@SpringBootApplication
public class Demo14Application {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Demo14Application.class, args);
        PYAVU1Controller pyavu1Controller = new PYAVU1Controller();
        PYAVU2Controller pyavu2Controller = new PYAVU2Controller();
        PYAVU2PART1Controller pyavu2PART1Controller = new PYAVU2PART1Controller();
        PYAVA_RController pyava_rController = new PYAVA_RController();
        PYAVUMController pyavumController = new PYAVUMController();
        Scanner scanner = new Scanner(System.in);
            System.out.println(" 1) homework №1\n 2) homework №2\n 3) homework №2 part 1\n 4) homework №4\n 5) individual tasks");
        System.out.print("number homework : ");
            int homeworkNumber = scanner.nextInt();
            switch (homeworkNumber){
                case 1:{
                    pyavu1Controller.showPr1();
                }
                case 2:
                    pyavu2Controller.showPr2();
                case 3:
                    pyavu2PART1Controller.showPr2P2();
                case 4:
                    pyava_rController.showPr4();
                case 5:
                    pyavumController.showM();
                default:
                    throw new Exception("ERROR");
            }
    }
}
