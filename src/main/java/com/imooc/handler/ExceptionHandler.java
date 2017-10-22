package com.imooc.handler;

import com.imooc.domain.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author cody
 * @version V1.0
 * @create 2017/10/22 17:07
 */
@ControllerAdvice
public class ExceptionHandler  {

    @org.springframework.web.bind.annotation.ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handler(Exception e){
        return new Result();
    }
}
