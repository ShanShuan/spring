package test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Description:
 *
 * @author wang zifeng
 * @Date Create on 2019-08-12 18:53
 * @since version1.0 Copyright 2018 Burcent All Rights Reserved.
 */
public class Test {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("beans.xml");
        String[] beanDefinitionNames = classPathXmlApplicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
//        com.ruipone.model.Person person = (com.ruipone.model.Person) classPathXmlApplicationContext.getBean("person");
//        System.out.println(person.toString());

//        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
//        Person bean = annotationConfigApplicationContext.getBean(Person.class);
//        System.out.println(bean.toString());
    }
}
