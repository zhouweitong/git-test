package com.zhou.housestenancy.service.impl;

import com.zhou.housestenancy.bean.HouseContract;
import com.zhou.housestenancy.bean.User;
import com.zhou.housestenancy.mapper.HouseContractMapper;
import com.zhou.housestenancy.mapper.UserMapper;
import com.zhou.housestenancy.service.HouseContractService;

import freemarker.template.Configuration;
import freemarker.template.Template;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class HouseContractServiceImpl implements HouseContractService {
    @Resource
    private HouseContractMapper houseContractMapper;
    @Resource
    private UserMapper userMapper;

    @Override
    public int addHouseContract(HouseContract houseContract) throws Exception{
        Configuration configuration = new Configuration();
        String path = HouseContractServiceImpl.class.getClassLoader().getResource("").getPath();
        System.out.print(path);
        configuration.setDirectoryForTemplateLoading(new File(path));
        Template template = configuration.getTemplate("model/contract.ftl");
        List<User> user = userMapper.getUser(null, 1, null, null, null, null, null);
        User jiaUser = user.get(0);
        List<User> user1 = userMapper.getUser(null, 2, null, null, null, null, null);
        User yiUser = user1.get(0);
        Map map = new HashMap();
        map.put("jiaUser",jiaUser);
        map.put("yiUser",yiUser);
        Writer writer = new OutputStreamWriter(new FileOutputStream("E:/maven/"+houseContract.getHouseContractNo()+".docx"));
        template.process(map,writer);
        System.out.print("成功");
        houseContract.setHouseContractTemplate("E:/maven/"+houseContract.getHouseContractNo()+".docx");
        return this.houseContractMapper.save(houseContract);
    }

    @Override
    public int updateHouseContract(HouseContract houseContract) {
        return this.houseContractMapper.update(houseContract);
    }

    @Override
    public List<HouseContract> getHouseContract(Integer houseContractId) {
        return this.houseContractMapper.list(houseContractId);
    }

    @Override
    public int deleteHouseContract(Integer houseContractId) {
        return this.houseContractMapper.delete(houseContractId);
    }
}
