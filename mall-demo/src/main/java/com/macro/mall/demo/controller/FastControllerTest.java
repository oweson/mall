package com.macro.mall.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author chengwanli
 * @date 2020/9/5 19:42
 */

@RestController
@RequestMapping("fast")
public class FastControllerTest {

    @RequestMapping("save")
    public Object save(Date date){
        System.out.println(date);
        return "";
    }


}
