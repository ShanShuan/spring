package com.ruipone.config;

import com.ruipone.model.Car;
import com.ruipone.model.Cat;
import org.springframework.context.annotation.*;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Description:
 *
 * @author wang zifeng
 * @Date Create on 2019-08-13 10:22
 * @since version1.0 Copyright 2018 Burcent All Rights Reserved.
 */
@ComponentScan("com.ruipone.model")
@Configuration
public class BeanLifeCycleConfig {
    /**
     * 多实例bean   获取对象的时候  IOC 容器帮忙 创建   ，销毁不帮忙进行
     * 单示例的bean  IOC 容器 一开始就 创建，容器关闭时销毁
     * @return
     */
    @Scope("prototype")
//    @PostConstruct
//    @PreDestroy
    @Bean(name = "car",destroyMethod = "destroy",initMethod = "init")
    public Car car(){
        return new Car();
    }

//    @Bean
//    public Cat cat(){
//        return  new Cat();
//    }
}
