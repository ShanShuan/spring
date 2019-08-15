package com.ruipone.model;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * Description:
 *
 * @author wang zifeng
 * @Date Create on 2019-08-13 20:02
 * @since version1.0 Copyright 2018 Burcent All Rights Reserved.
 */
@Component
public class MyBeanPostProsessor implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization。。。"+beanName);
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization。。。"+beanName);
        return bean;
    }
}
