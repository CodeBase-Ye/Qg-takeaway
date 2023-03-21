package com.studyLab.autFru.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.studyLab.autFru.entity.DishFlavor;
import com.studyLab.autFru.mapper.DishFlavorMapper;
import com.studyLab.autFru.service.DishFlavorService;
import org.springframework.stereotype.Service;

@Service
public class DishFlavorServiceImpl extends ServiceImpl<DishFlavorMapper,DishFlavor> implements DishFlavorService {
}
