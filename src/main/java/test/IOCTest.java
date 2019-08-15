package test;

import com.ruipone.config.MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * Description:
 *
 * @author wang zifeng
 * @Date Create on 2019-08-12 19:48
 * @since version1.0 Copyright 2018 Burcent All Rights Reserved.
 */
public class IOCTest {


    @Test
    public void test01(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }
    }
}
