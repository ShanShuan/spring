package com.ruipone.model;

/**
 * Description:
 *
 * @author wang zifeng
 * @Date Create on 2019-08-12 18:51
 * @since version1.0 Copyright 2018 Burcent All Rights Reserved.
 */
public class Person {
    private String name;
    private String age;

    public Person() {
    }

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "com.ruipone.model.Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
