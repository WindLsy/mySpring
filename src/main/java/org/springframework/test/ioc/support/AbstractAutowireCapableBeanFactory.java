package org.springframework.test.ioc.support;

import org.springframework.beans.BeansException;
import org.springframework.test.ioc.config.BeanDefinition;

/**
 *  抽象类 实现了 自动装配bean容器
 *
 * @author: LJ
 * @create: 2023/1/15
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory{


    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        return doCreateBean(beanName, beanDefinition);
    }


    protected Object doCreateBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        Class beanClass = beanDefinition.getBeanClass();
        Object bean = null;

        try {
            bean = beanClass.newInstance();
        } catch (Exception e) {
           throw new BeansException("实例化 bean 失败", e);
        }

        addSingleton(beanName, bean);

        return bean;
    }

}
