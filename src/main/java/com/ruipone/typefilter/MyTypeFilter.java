package com.ruipone.typefilter;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * Description:
 *
 * @author wang zifeng
 * @Date Create on 2019-08-12 20:23
 * @since version1.0 Copyright 2018 Burcent All Rights Reserved.
 */
public class MyTypeFilter implements TypeFilter {
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        Class<? extends MetadataReader> aClass = metadataReader.getClass();
        Resource resource = metadataReader.getResource();
        String className = classMetadata.getClassName();
        System.out.println("----->"+className);
        System.out.println("getFilename："+resource.getFilename());
        return false;
    }
}
