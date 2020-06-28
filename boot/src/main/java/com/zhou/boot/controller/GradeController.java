package com.zhou.boot.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.zhou.boot.bean.Grade;
import com.zhou.boot.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/grade")
public class GradeController {
    @Autowired
    private GradeService gradeService;

    @RequestMapping("/get")
    public String get(Integer id)throws Exception{
        Grade grade = this.gradeService.get(id);
        return JSONObject.toJSONString(grade);
    }
    @RequestMapping("/save")
    public String save (String gradeName){
        Map<String,String> map = new HashMap<>();
        this.gradeService.save(gradeName);
        map.put("msg","success");
        return JSONObject.toJSONString(map);

    }
    @RequestMapping("/delete")
    public String delete(Integer id){
        Map<String,String> map = new HashMap<>();
        this.gradeService.delete(id);
        map.put("msg","success");
        return JSONObject.toJSONString(map);

    }
    @RequestMapping("/updata")
    public String updata(Integer id ,String gradeName){
        Map<String,String> map = new HashMap<>();
        this.gradeService.updata(id,gradeName);
        map.put("msg","success");
        return JSONObject.toJSONString(map);

    }
    @RequestMapping("/list")
    public String list() {
        List<Grade> list = this.gradeService.list();
        return JSONObject.toJSONString(list);
    }

}
