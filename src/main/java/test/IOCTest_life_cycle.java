package test;

import com.ruipone.config.BeanLifeCycleConfig;
import com.ruipone.model.Car;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Description:
 *
 * @author wang zifeng
 * @Date Create on 2019-08-13 10:18
 * @since version1.0 Copyright 2018 Burcent All Rights Reserved.
 */
public class IOCTest_life_cycle {

    @Test
    public void Test() {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(BeanLifeCycleConfig.class);
        System.out.println("IOC 容器初始化完成");
        Car car = (Car)annotationConfigApplicationContext.getBean("car");
//        car.destroy();
        //多实例beab  容器 不帮你销毁
        annotationConfigApplicationContext.close();
    }
}
