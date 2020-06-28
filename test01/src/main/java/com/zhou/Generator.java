package com.zhou;

import freemarker.template.Configuration;
import freemarker.template.Template;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Generator {
    public static void main(String[] args) throws Exception{
        //Configuration
        Configuration configuration = new Configuration();
        String path = Generator.class.getClassLoader().getResource("").getPath();
        System.out.print(path);
        configuration.setDirectoryForTemplateLoading(new File(path));
        Template template = configuration.getTemplate("bean.ftl");

        Map map = new HashMap();
        /*User user = new User();
        user.setName("zhou");
        user.setPassword("zhou");*/
        /*List<String> list = new ArrayList<>();
        list.add("zhou");
        list.add("zhou2");
        list.add("zhou74");
        list.add("zhou123");*/
        ClassGenerator classGenerator = new ClassGenerator();
        MyClass myClass = classGenerator.tableToClass("guest_record");
        map.put("myClass",myClass);
        Writer writer = new OutputStreamWriter(new FileOutputStream("E:/maven/"+classGenerator.tableNameToClassName("guest_record")+".java"));
        template.process(map,writer);
        System.out.print("成功");
    }
}
