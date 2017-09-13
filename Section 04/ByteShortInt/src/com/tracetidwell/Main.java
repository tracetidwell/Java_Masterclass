package com.tracetidwell;

public class Main {

    public static void main(String[] args) {

        byte myByte = 24;
        short myShort = 256;
        int myInt = 25000;
        long myLong = 5000 + (10 * (myByte + myShort + myInt));
        System.out.println("myLong = " + myLong);

    }
}