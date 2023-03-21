package com.studyLab.autFru.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.studyLab.autFru.entity.OrderDetail;
import com.studyLab.autFru.mapper.OrderDetailMapper;
import com.studyLab.autFru.service.OrderDetailService;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {

}