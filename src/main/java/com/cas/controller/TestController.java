package com.cas.controller;

import com.cas.bean.CasUserDO;
import com.cas.dao.CasUserMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @description:
 * @author: xianglong
 * @create: 2024-10-21 11:40
 **/
@RequestMapping
@RestController
public class TestController {

    @Resource
    private CasUserMapper casUserMapper;

    @RequestMapping("/queryOne")
    public String queryOne() {
        CasUserDO casUserDO = casUserMapper.queryOne();
        System.out.println(casUserDO.getUsername());
        return "ok";
    }

}
