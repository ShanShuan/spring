package com.ruipone.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * Description:
 *
 * @author wang zifeng
 * @Date Create on 2019-08-13 12:28
 * @since version1.0 Copyright 2018 Burcent All Rights Reserved.
 */
@Component
public class Color implements InitializingBean, DisposableBean {
    public Color() {
        System.out.println("color  constractor.....");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet....");
    }

    public void destroy() throws Exception {
        System.out.println("destroy....");
    }
}
