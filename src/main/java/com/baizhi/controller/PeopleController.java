package com.baizhi.controller;

import com.baizhi.entity.People;
import com.baizhi.mapper.PeopleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;









@Controller
@RequestMapping("/people")
public class PeopleController {
    @Autowired
    private PeopleMapper peopleMapper;
    @RequestMapping("/showOne")
    public ModelAndView showOne(){
        ModelAndView modelAndView=new ModelAndView("index");
        List<People> people=peopleMapper.selectAll();
        modelAndView.addObject("list",people);
        System.out.print(people);
          System.out.print("hahah");
        return  modelAndView;
    }

    
    
}
