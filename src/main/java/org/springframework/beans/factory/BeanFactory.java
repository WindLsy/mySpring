package org.springframework.beans.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: LJ
 * @Description: Bean容器，定义一个简单的bean容器
 * 内部包含
 *  一个map：用以保存bean
 *  两个方法：注册bean，获取bean
 */
public class BeanFactory {

    private Map<String, Object> beanMap = new HashMap<>();

    /**
     * 注册bean
     * @param name bean名字
     * @param bean bean对象
     */
    public void registerBean(String name, Object bean){
        beanMap.put(name, bean);
    }

    public Object getBean(String name){
        return beanMap.get(name);
    }

}
