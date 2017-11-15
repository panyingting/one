package com.study.pattern.proxy;

/**
 * Created by panyingting on 2017/11/9.
 */
public class ServiceSubject implements Subject {

    public String service(String address) {
        System.out.println("成功连接");
        String content = "好消息......";
        return content;
    }

}
