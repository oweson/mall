package com.macro.mall;

import com.macro.mall.demo.service.DemoService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class BrandTest extends  MallDemoApplicationTests {

    @Autowired
    private DemoService demoService;
    @Test
    public void list(){
        System.out.println(demoService.listAllBrand());
    }
}
