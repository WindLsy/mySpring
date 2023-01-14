package org.springframework.test.ioc.support;

import org.springframework.beans.BeansException;
import org.springframework.test.ioc.config.BeanDefinition;

import java.util.HashMap;
import java.util.Map;

/**
 * 默认bean实现类，实现bean的注册和获取功能。
 *
 * @author: LJ
 * @create: 2023/1/15
 */
public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements BeanDefinitionRegistry {

    /**
     * 存储bean定义信息的容器
     */
    private Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>();


    /**
     * 注册bean的信息（class类型）
     *
     * @param beanName bean 名
     * @param beanDefinition bean 的信息（class类型）
     */
    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName, beanDefinition);
    }

    /**
     * 获取bean的信息
     *
     * @param beanName   bean 名
     * @return bean 的信息（class类型）
     * @throws BeansException 不存在该 bean 信息
     */
    @Override
    protected BeanDefinition getBeanDefinition(String beanName) throws BeansException {
        BeanDefinition beanDefinition = beanDefinitionMap.get(beanName);

        if (beanDefinition == null){
            throw new BeansException("bean "+beanName+ " 未定义");
        }

        return beanDefinition;
    }
}
