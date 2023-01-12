package org.springframework.beans.factory;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * @Author: LJ
 * @Description: 测试bean
 */
public class SimpleBeanContainerTest {
    
    @Test
    public void testGetBean(){

        BeanFactory beanFactory = new BeanFactory();
        beanFactory.registerBean("helloService", new HelloService());

        // 获取bean
        HelloService helloService = (HelloService) beanFactory.getBean("helloService");
        assertThat(helloService).isNotNull();
        assertThat(helloService.sayHello()).isEqualTo("hello");
//        helloService.sayHello();

    }

    class HelloService{
        public String sayHello(){
            System.out.println("hello");
            return "hello";
        }
    }
    
}
