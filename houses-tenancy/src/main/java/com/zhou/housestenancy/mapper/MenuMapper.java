package com.zhou.housestenancy.mapper;

import com.zhou.housestenancy.bean.Menu;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface MenuMapper {
    public List<Menu> getAll();
    
}
