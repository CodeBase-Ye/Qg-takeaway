package com.studyLab.autFru.dto;

import com.studyLab.autFru.entity.Setmeal;
import com.studyLab.autFru.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
