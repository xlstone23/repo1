package com.lagou.advice;

import org.springframework.stereotype.Component;

@Component
public class Myadvice {
    public void before(){
        System.out.println("控制台打印前值增强");
    }
}
