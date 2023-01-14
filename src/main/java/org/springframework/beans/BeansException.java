package org.springframework.beans;

/**
 * beans异常，（获取bean，但是不存在）
 *
 * @author: LJ
 * @create: 2023/1/15
 *
 */
public class BeansException extends Exception {


    public BeansException(String message) {
        super(message);
    }

    public BeansException(String message, Throwable cause) {
        super(message, cause);
    }
}
