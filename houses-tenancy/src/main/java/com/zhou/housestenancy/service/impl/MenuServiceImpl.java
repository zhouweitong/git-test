package com.zhou.housestenancy.service.impl;

import com.zhou.housestenancy.bean.Menu;
import com.zhou.housestenancy.mapper.MenuMapper;
import com.zhou.housestenancy.service.MenuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class MenuServiceImpl implements MenuService {
    @Resource
    private MenuMapper menuMapper;

    @Override
    public List<Menu> getMenuAll() {

        return this.menuMapper.getAll();
    }
}
