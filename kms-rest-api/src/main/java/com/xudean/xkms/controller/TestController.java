package com.xudean.xkms.controller;

import com.xudean.common.utils.date.DateFormatUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping
public class TestController {
    @GetMapping("date")
    public String test(){
        return DateFormatUtils.getStringDefaultDate(new Date());
    }
}
