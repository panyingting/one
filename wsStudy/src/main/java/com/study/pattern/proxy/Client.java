package com.study.pattern.proxy;

import com.study.pattern.proxy.proxy.ProxyService;

/**
 * Created by panyingting on 2017/11/9.
 */
public class Client {

    public static void main(String[] args) {

        String address = null;

        Subject subject = new ProxyService();
        String result = subject.service(address);

        System.out.println(result);

    }
}
