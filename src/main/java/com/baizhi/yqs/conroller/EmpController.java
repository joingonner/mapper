package com.baizhi.yqs.conroller;

import com.baizhi.yqs.entity.Emp;
import com.baizhi.yqs.mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller

public class EmpController {
    @Autowired
    EmpMapper empMapper;
    @ResponseBody
    @RequestMapping("emp")
    public List<Emp> test(){
        List<Emp> list = empMapper.selectAll();
        for (Emp emp : list) {
            System.out.println(emp);
        }
        return list;
    }
    @RequestMapping("test1")
    public String test1(){
        return "index";
    }
}
