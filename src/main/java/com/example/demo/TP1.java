package com.example.demo;

import java.util.ArrayList;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TP1 {
    Scanner scanner = new Scanner(System.in);
    void taskTP1(){
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i<11; i++)
            list.add(i);
        while (!list.isEmpty()){
            int a = list.size()-1;
            Random random = new Random();
            int numberRandom = random.nextInt(a-0+1);
            System.out.println("Dropped out : "+ list.get(numberRandom));
            list.remove(list.get(numberRandom));
        }
    }
    void taskTP2(){
        String number = "012345678910111213141516171819202122232425262728293031323334353637383940";
        for(int i = 1; i<number.length(); i++){
            if(i<10){
                char result = number.charAt(i);
                System.out.println(result);
            }
            if(i>=10 && i<100){
                char result1 = number.charAt(i);
                char result2 = number.charAt(1+i);
                System.out.println(result1+""+result2);
                i++;
            }
        }
    }
    void  getLogin(){
        String login = "sezim";
        String password = "123456789";
        for(int i = 0; i<3; i++){
            System.out.print("login : ");
            String loginS = scanner.next();
            System.out.print("password : ");
            String passwordS = scanner.next();
            if(login.equals(loginS) && password.equals(passwordS)) {
                System.out.println("welcome");
                break;
            }
            else if(i==2)
                System.out.println("error");
            else
                System.out.println("repeat");
        }

    }
}
