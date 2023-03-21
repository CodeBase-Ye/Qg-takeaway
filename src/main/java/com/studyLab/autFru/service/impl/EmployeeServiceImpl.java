package com.studyLab.autFru.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.studyLab.autFru.entity.Employee;
import com.studyLab.autFru.mapper.EmployeeMapper;
import com.studyLab.autFru.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper,Employee> implements EmployeeService{
}
