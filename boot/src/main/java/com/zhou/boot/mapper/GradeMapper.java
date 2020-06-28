package com.zhou.boot.mapper;

import com.zhou.boot.bean.Grade;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GradeMapper {

    Grade get(@Param("id")Integer id);

    void save (@Param("gradeName") String gradeName);

    void delete(@Param("id")Integer id);

    void updata(@Param("id")Integer id ,@Param("gradeName")String gradeName);

    List<Grade> list();

}
