package com.studyLab.autFru.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.studyLab.autFru.entity.Category;

public interface CategoryService extends IService<Category> {

    public void remove(Long id);

}
