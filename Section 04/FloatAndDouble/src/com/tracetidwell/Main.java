package com.tracetidwell;

public class Main {

    public static void main(String[] args) {
        // int has width 32
        int myInt = 5 / 3;
        // float has width 32
        float myFloat = 5f / 3f;
        // double has width 64
        double myDouble = 5d / 3d;

        System.out.println("myInt = " + myInt);
        System.out.println("myFloat = " + myFloat);
        System.out.println("myDouble = " + myDouble);

        int pounds = 150;
        double kg = pounds * 0.45359237d;
        System.out.println(pounds + " pounds = " + kg + " kg");
    }
}
