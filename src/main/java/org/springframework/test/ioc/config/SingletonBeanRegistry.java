package org.springframework.test.ioc.config;

/**
 *
 * @author: LJ
 * @create: 2023/1/14
 * @description: 单例注册表接口，定义添加和获取单例bean的方法
 *  Singleton: 单例
 *
 */
public interface SingletonBeanRegistry {

    /**
     * 实现获取单例bean的方法
     * @param beanName 单例 bean名
     * @return
     */
    Object getSingleton(String beanName);

}
