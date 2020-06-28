package com.zhou;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> lis = new ArrayList<>();
        lis.add("category");
        lis.add("result");
        lis.add("student");
        ClassesGenerayor classesGenerayor = new ClassesGeneratorImpl();
        try {
            classesGenerayor.generator(lis);

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
