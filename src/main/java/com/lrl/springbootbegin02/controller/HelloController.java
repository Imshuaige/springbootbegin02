package com.lrl.springbootbegin02.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LRL
 * @version 1.0
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 * @date 2019/8/6 11:06
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String func(){

        return "hello sb";
    }
}