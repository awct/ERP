package com.my.controller;

import com.my.model.Emp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ViewController {
    @RequestMapping("/select")
    public ModelAndView select(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("select");
        return modelAndView;
    }
    @RequestMapping("/update")
    public ModelAndView update(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("update");

        return modelAndView;
    }
}
