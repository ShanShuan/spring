package com.ruipone.model;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Description:
 *
 * @author wang zifeng
 * @Date Create on 2019-08-13 18:57
 * @since version1.0 Copyright 2018 Burcent All Rights Reserved.
 */
@Component
public class Cat {

    public Cat() {
        System.out.println("生成了一只小猫咪");
    }

    @PostConstruct//在bean  初始化 完成后，执行的初始化动作
    public void yeild(){
        System.out.println("我是一直小猫咪");
    }
    @PreDestroy// 在容器  销毁 bean之前   ，通知 要执行 的 操作
    public void gone(){
        System.out.println("小猫咪 就要死了");
    }
}
