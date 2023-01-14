package org.springframework.test.ioc.support;

import org.springframework.beans.BeansException;
import org.springframework.test.ioc.BeanFactory;
import org.springframework.test.ioc.config.BeanDefinition;

/**
 * 抽象类， 继承了默认的单例bean注册实现，实现bean容器的获取方法
 *
 * @author: LJ
 * @create: 2023/1/15
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {


    /**
     *
     *
     * @param name bean 名
     * @return 实例bean
     * @throws BeansException 异常
     */
    @Override
    public Object getBean(String name) throws BeansException {
        Object bean = getSingleton(name);
        if (bean!=null){
            return bean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name, beanDefinition);
    }

    /**
     * 创建一个bean，返回 bean 对象
     *
     * @param beanName  bean 名
     * @param beanDefinition  bean 的信息
     * @return 实例 bean 对象
     * @throws BeansException 异常
     */
    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;

    /**
     * 通过信息，定义bean，返回bean的定义
     *
     * @param beanName   bean 名
     * @return  定义好的 bean 的信息
     * @throws BeansException 异常
     */
    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

}
