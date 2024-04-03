package com.javalovers.banco;
import java.util.Scanner;
import parameters.Title;
import java.util.ArrayList;
public class Banco {
    public static void main(String[] args) {
        ArrayList<Title> innovador = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("say your name");
        String author = scanner.next();
        double money = 0;
        String stayone = "inside";
        String staytwo = "inside";
        while(stayone=="inside"){
            System.out.println("do you want write the money?");
            System.out.println("yes or no?");
            String confirmation = scanner.next();
            if(confirmation.equals("yes")){
                staytwo="inside";
                stayone="outside";
            }else if(confirmation.equals("no")){
                staytwo="outside";
                stayone="outside";
            }else{
                System.out.println("write yes or no correctly");
                stayone="inside";
            }
        }
        while(staytwo=="inside"){
            System.out.println("say the money");
            money = scanner.nextDouble();
            if(money<=0){
                System.out.println("please, write the correct money");
                staytwo="inside";
            }else{
                staytwo="outside";
                stayone="inside";
                    }
        }
        while(stayone=="inside"){
        System.out.println("do you want withdrawals?");
            System.out.println("yes or no?");
            String confirmation = scanner.next();
            if(confirmation.equals("yes")){
                staytwo="inside";
                stayone="outside";
            }else if(confirmation.equals("no")){
                staytwo="outside";
                stayone="outside";
            }else{
                System.out.println("write yes or no correctly");
                stayone="inside";
            }
        }
        double ingress = 0;
        while(staytwo=="inside"){
            System.out.println("say the withdrawal");
            ingress = scanner.nextDouble();
            if(money<=0){
                System.out.println("please, write the correct withdrawal");
                staytwo="inside";
            }else{
                staytwo="outside";
                    }
        }
        Title person1 = new Title(author, money,ingress);
        person1.modifyMoney(ingress);
        System.out.println(person1);
        System.out.println("see ya!");
    }
}
