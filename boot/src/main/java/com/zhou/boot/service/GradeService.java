package com.zhou.boot.service;

import com.zhou.boot.bean.Grade;

import java.util.List;

public interface GradeService {

    Grade get(Integer id);

    void save (String gradeName);

    void delete(Integer id);

    void updata(Integer id ,String gradeName);

    List<Grade> list();
}
