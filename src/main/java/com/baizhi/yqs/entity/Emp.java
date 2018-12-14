package com.baizhi.yqs.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tk.mybatis.mapper.annotation.KeySql;
import tk.mybatis.mapper.code.ORDER;

import javax.persistence.Id;
import java.io.Serializable;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Emp implements Serializable {
    @Id
    @KeySql(sql = "select emp_seq.nextval from dual", order = ORDER.BEFORE)
    private Integer id;
    private String name;
    private Double salary;
    private Integer age;
    private Integer did;


}