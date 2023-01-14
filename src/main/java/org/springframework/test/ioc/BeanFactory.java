package org.springframework.test.ioc;

import org.springframework.beans.BeansException;

/**
 * bean容器
 *
 * @author: LJ
 * @create: 2023/1/15
 *
 */
public interface BeanFactory {

    /**
     * 获取bean的接口
     * @param name bean 名
     * @return
     * @throws BeansException bean不存在时，报异常
     */
    Object getBean(String name) throws BeansException;
}
