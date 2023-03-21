package com.studyLab.autFru.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.studyLab.autFru.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper extends BaseMapper<Orders> {

}