package com.smartwebx.controller;

/**
 * 叙述的类的价值的核心内容
 *
 * @author HappyGhost
 * @create 2018-05-06 14:58
 **/
public class Jav {
    public static void main(String[] args){
        for (String item:
             args) {
            System.out.println(item);

        }
        for (int i = 0; i < 100 ; i++) {
            System.out.println(i);
        }


        int age = 20;
        if( age > 10){
            Calc.add(1,2);
            System.out.println("中学生");
        }else if(age < 40 ){
            System.out.println("白领");
        }else if(age > 60){
            System.out.println("lao nian ren ");
        }

        System.out.println("debug 001 line");
        System.out.println("debug 002 line");
        System.out.println("debug 003 line");
        System.out.println("debug 004 line");

    }






}
