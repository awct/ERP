package com.my.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.my.model.Emp;
import com.my.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpController {
    @Autowired
    private EmpService empService;
    @RequestMapping("/insert")
    public boolean insert(@RequestBody Emp emp){
        return empService.insert(emp);
    }
    @RequestMapping("/del/{id}")
    public boolean delete(@PathVariable("id") Integer id){
        return empService.delete(id);
    }
    @RequestMapping("/upd")
    public boolean update(@RequestBody Emp emp){
        return empService.update(emp);
    }
    @RequestMapping("/list")
    public PageInfo selectByAll(@RequestParam(defaultValue = "1") Integer page){
//        PageHelper.startPage(5,page);
//        List<Emp> list=empService.selectByAll();
        PageInfo pageInfo=new PageInfo(empService.page(page),4);
        return pageInfo;
    }

}
