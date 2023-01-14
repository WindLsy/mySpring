package org.springframework.test.ioc.support;

import org.springframework.test.ioc.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * 默认的单例注册表，实现了单例注册表的接口。可以通过该类实现单例bean的注册和获取
 *
 * @author: LJ
 * @create: 2023/1/15
 *
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {


    /**
     * 单例bean的存储对象key-value
     */
    private Map<String, Object> singletonObjects = new HashMap<>();


    /**
     * 实现获取单例bean的方法
     * @param beanName 单例 bean 名
     * @return
     */
    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }

    /**
     * 向容器中注册单例bean
     * @param beanName 单例 bean 名
     * @param singletonObject 单例 bean 对象
     */
    protected void addSingleton(String beanName, Object singletonObject){
        singletonObjects.put(beanName, singletonObject);
    }


}
