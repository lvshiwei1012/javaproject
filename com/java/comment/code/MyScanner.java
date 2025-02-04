package com.java.comment.code;

import java.util.Scanner;  // 从java.util包中导入Scanner类
public class MyScanner{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);  // 创建scanner对象
        // 当程序执行到next方法的时候会等待用户输入
        String name = scanner.next();  // 接受用户输入的字符串
        int age = scanner.nextInt();
        double salary = scanner.nextDouble();
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }
}

