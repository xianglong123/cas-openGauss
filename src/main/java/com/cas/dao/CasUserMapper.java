package com.cas.dao;

import com.cas.bean.CasUserDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @description:
 * @author: xianglong
 * @create: 2024-10-21 11:42
 **/
@Mapper
public interface CasUserMapper {


    CasUserDO queryOne();

}
