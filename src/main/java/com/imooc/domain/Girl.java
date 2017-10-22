package com.imooc.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;

/**
 * @author cody
 * @version V1.0
 * @create 2017/10/22 15:42
 */
@Entity
public class Girl {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;

    @Min(value = 18,message = "未成年人，不得入内")
    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}