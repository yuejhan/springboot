package com.imooc.controller;

import com.imooc.domain.Girl;
import com.imooc.reposity.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author cody
 * @version V1.0
 * @create 2017/10/22 16:07
 */
@RestController
public class GirlController {

    @Autowired
    private GirlRepository girlRepository;

    @PostMapping("/girls")
    public Girl addGirl(@Valid Girl girl, BindingResult bindingResult){


        if(bindingResult.hasErrors()){
            System.out.println(bindingResult.getFieldError().getDefaultMessage());
            return null;
        }

        Girl girl1 = new Girl();
        girl1.setAge(girl.getAge());
        girl1.setName(girl.getName());
        return girlRepository.save(girl1);
    }

}
