package com.baizhi.yqs;

import com.baizhi.yqs.entity.Emp;
import com.baizhi.yqs.mapper.EmpMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MapperApplicationTests {
@Autowired
    EmpMapper empMapper;
    @Test
    public void contextLoads() {
        List<Emp> list = empMapper.selectAll();
        for (Emp emp : list) {
            System.out.println(emp);
        }
    }

}
