package test;

import com.ruipone.model.Person;
import org.junit.Test;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Description:
 *
 * @author wang zifeng
 * @Date Create on 2019-08-14 09:14
 * @since version1.0 Copyright 2018 Burcent All Rights Reserved.
 */
public class IOC_DefaultListenBeanFactory {

    @Test
    public  void test1(){
        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        Person person = (Person) xmlBeanFactory.getBean("person");
        System.out.println(person.toString());



        Resource resource=new ClassPathResource("beans.xml");
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        BeanDefinitionReader bdr=new XmlBeanDefinitionReader(factory);
        bdr.loadBeanDefinitions(resource);
        Person person1 = (Person) factory.getBean("person");
        System.out.println(person1.toString());
    }
}
