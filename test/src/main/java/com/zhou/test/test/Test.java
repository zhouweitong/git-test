package com.zhou.test.test;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        random.ints().limit(5).forEach(System.out::println);
    }
}
