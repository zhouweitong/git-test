package com.zhou;

import freemarker.template.Configuration;
import freemarker.template.Template;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassesGeneratorImpl implements ClassesGenerayor {

    @Override
    public void generator(List<String> list)throws Exception{
        for(String className : list){
            Configuration configuration = new Configuration();
            String path = Generator.class.getClassLoader().getResource("").getPath();
            System.out.print(path);
            configuration.setDirectoryForTemplateLoading(new File(path));
            Template template = configuration.getTemplate("bean.ftl");
            Map map = new HashMap();
            ClassGenerator classGenerator = new ClassGenerator();
            MyClass myClass = classGenerator.tableToClass(className);
            map.put("myClass",myClass);
            Writer writer = new OutputStreamWriter(new FileOutputStream("E:/maven/"+classGenerator.tableNameToClassName(className)+".java"));
            template.process(map,writer);
            System.out.print("成功");
        }
    }
}
