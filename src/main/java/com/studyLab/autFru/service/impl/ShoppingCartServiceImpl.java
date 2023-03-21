package com.studyLab.autFru.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.studyLab.autFru.entity.ShoppingCart;
import com.studyLab.autFru.mapper.ShoppingCartMapper;
import com.studyLab.autFru.service.ShoppingCartService;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {
}
