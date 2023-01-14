package org.springframework.test.ioc.support;

import org.springframework.test.ioc.config.BeanDefinition;

/**
 * 单例注册表接口
 *
 * @author: LJ
 * @create: 2023/1/14
 *
 */
public interface BeanDefinitionRegistry {


    /**
     * 向注册表中注入BeanDefinition
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
