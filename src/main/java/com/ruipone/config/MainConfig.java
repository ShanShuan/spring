package com.ruipone.config;

import com.ruipone.controller.BookController;
import com.ruipone.typefilter.MyTypeFilter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * Description:
 *
 * @author wang zifeng
 * @Date Create on 2019-08-12 18:59
 * @since version1.0 Copyright 2018 Burcent All Rights Reserved.
 */
@Configuration
@ComponentScan(value = "com.ruipone",includeFilters = {
        @ComponentScan.Filter(type= FilterType.ASSIGNABLE_TYPE,classes = {BookController.class}),
        @ComponentScan.Filter(type = FilterType.CUSTOM,classes = MyTypeFilter.class)
},

                useDefaultFilters = false
//        ,excludeFilters = {
//        @ComponentScan.Filter(type = )
//}
)

public class MainConfig {
//    @Bean
//    Person person(){
//        return new Person("wangzifeng","21");
//    }
}
