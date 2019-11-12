package com.my.service.Imp;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.my.mapper.EmpMapper;
import com.my.model.Emp;
import com.my.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmpServiceImp implements EmpService {
    @Autowired
    private EmpMapper empMapper;

    @Override
    public boolean insert(Emp emp) {
        if(emp!=null){
            empMapper.insert(emp);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(Integer id) {
        if(id!=null){
            empMapper.delete(id);
            return true;
        }
        return false;
    }

    @Override
    public boolean update(Emp emp) {
        if(emp!=null){
            empMapper.update(emp);
            return true;
        }
        return false;
    }

    @Override
    public List<Emp> selectByAll() {
        return empMapper.selectByAll();
    }
    @Override
    public List<Emp> page(Integer page){

        return empMapper.selectByPage(page*5);
    }
}
