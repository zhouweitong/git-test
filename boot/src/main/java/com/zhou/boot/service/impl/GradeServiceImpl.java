package com.zhou.boot.service.impl;

import com.zhou.boot.bean.Grade;
import com.zhou.boot.mapper.GradeMapper;
import com.zhou.boot.service.GradeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("gradeService")
public class GradeServiceImpl implements GradeService {

    @Resource
    private GradeMapper gradeMapper ;

    @Override
    public Grade get(Integer id) {
        return this.gradeMapper.get(id);
    }

    @Override
    public void save(String gradeName) {
        this.gradeMapper.save(gradeName);
    }

    @Override
    public void delete(Integer id) {
        this.gradeMapper.delete(id);

    }

    @Override
    public void updata(Integer id, String gradeName) {
        this.gradeMapper.updata(id,gradeName);

    }

    @Override
    public List<Grade> list() {
        return this.gradeMapper.list();
    }
}
