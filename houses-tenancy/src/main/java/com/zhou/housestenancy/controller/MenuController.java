package com.zhou.housestenancy.controller;

import com.zhou.housestenancy.bean.Menu;
import com.zhou.housestenancy.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/menu")
public class MenuController {
    @Autowired
    private MenuService menuService;

    @RequestMapping("/getMenuAll")
    public List<Menu> getMenuAll(){
        return this.menuService.getMenuAll();
    }
}
