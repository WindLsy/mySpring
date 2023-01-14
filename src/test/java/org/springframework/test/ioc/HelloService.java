package org.springframework.test.ioc;

/**
 * 测试bean容器的一个类
 *
 * @author: LJ
 * @create: 2023/1/15
 */
public class HelloService {

    public String sayHello() {
        System.out.println("hello");
        return "hello";
    }

}
