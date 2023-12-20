package com.something;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<3;i++){
        Animal an = new Animal(sc.next(), sc.next(), sc.next());
        System.out.println(an.toString());
        }
    }
}

