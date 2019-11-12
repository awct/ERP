package com.my.mapper;

import com.my.model.Emp;

import java.util.List;

public interface EmpMapper {
    void insert(Emp emp);
    void delete(Integer id);
    void update(Emp emp);
    List<Emp> selectByAll();
    List<Emp> selectByPage(Integer page);
}
