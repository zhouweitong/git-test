package com.zhou.productseurekaprovider.service.impl;

import com.zhou.bean.Qualities;
import com.zhou.productseurekaprovider.mapper.QualityMapper;
import com.zhou.productseurekaprovider.service.QualityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("qualityService")
public class QualityServiceImpl implements QualityService {
    @Resource
    private QualityMapper qualityMapper;
    @Override
    public void addQuality(Qualities qualities) {
        this.qualityMapper.save(qualities);
    }
}
