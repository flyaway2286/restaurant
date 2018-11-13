package com.lzy.liujing.restaurant.controller.sysController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/counter")
public class CounterController {
    @GetMapping("/counterPage.html")
    private String counterPage(){
        return "/counter/counter";
    }
}
