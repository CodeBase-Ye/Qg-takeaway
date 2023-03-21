package com.studyLab.autFru.dto;

import com.studyLab.autFru.entity.Dish;
import com.studyLab.autFru.entity.DishFlavor;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Data
public class DishDto extends Dish {

    private List<DishFlavor> flavors = new ArrayList<>();

    private String categoryName;

    private Integer copies;
}
