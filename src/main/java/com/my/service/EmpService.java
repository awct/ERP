package com.my.service;

import com.github.pagehelper.PageInfo;
import com.my.model.Emp;

import java.util.List;

public interface EmpService {
    boolean insert(Emp emp);
    boolean delete(Integer id);
    boolean update(Emp emp);
    List<Emp> selectByAll();
    List<Emp> page(Integer page);
}
