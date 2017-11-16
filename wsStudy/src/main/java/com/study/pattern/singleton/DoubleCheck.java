package com.study.pattern.singleton;

/**
 * Created by panyingting on 2017/11/16.
 */
public class DoubleCheck {

    private DoubleCheck(){

    }

    private static volatile  DoubleCheck instance = null;

    public static DoubleCheck getInstance() {
        if (instance == null) {
            synchronized(DoubleCheck.class) {
                if (instance == null) {
//                    1. 分布内存
//                    3. 赋值给 instance
//                    2. 初始化内存
                    instance = new DoubleCheck();
                }
            }
        }
        return instance;
    }

}
