package org.springframework.test.ioc;

import org.junit.jupiter.api.Test;
import org.springframework.test.ioc.config.BeanDefinition;
import org.springframework.test.ioc.support.DefaultListableBeanFactory;

/**
 * 测试 bean
 *
 * @author: LJ
 * @create: 2023/1/15
 */
public class BeanDefinitionAndBeanDefinitionRegistryTest {

    @Test
    public void testBeanFactory() throws Exception{

        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        BeanDefinition beanDefinition = new BeanDefinition(HelloService.class);

        beanFactory.registerBeanDefinition("helloService", beanDefinition);

        HelloService helloService = (HelloService) beanFactory.getBean("helloService");
        helloService.sayHello();

    }

}
