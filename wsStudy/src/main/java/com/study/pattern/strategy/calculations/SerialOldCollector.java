package com.study.pattern.strategy.calculations;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by panyingting on 2017/11/14.
 */
public class SerialOldCollector implements GarbageCollector{

    public void garbageCollection() {
        stopTheWorld();
        mark();
        sweep();
        compact();
        afterGC();
    }

    private void stopTheWorld(){
        System.out.println("-------------- 1 ----------");
        System.out.println("暂停所有用户线程......\n");
    }

    private void mark(){
        System.out.println("-------------- 2 ----------");
        System.out.println("单线程.....标记对象\n");
    }

    private void sweep(){
        System.out.println("-------------- 3 ----------");
        System.out.println("单线程......清除垃圾\n");
    }

    private void compact(){
        System.out.println("-------------- 4 ----------");
        System.out.println("对内存进行压缩整理.......\n");
    }

    private void afterGC(){
        System.out.println("-------------- 5 ----------");
        System.out.println("重置线程.................\n");
    }
}
