package com.study.pattern.strategy.calculations;

/**
 * Created by panyingting on 2017/11/14.
 */
public class CMSCollector implements GarbageCollector {

    public void garbageCollection() {

        initialMark();

        concurrentMark();

        remark();

        concurrentSweep();

        afterGC();
    }

    private void initialMark(){
        System.out.println("\n------------- 1 -----------");
        System.out.println("Stop The World........");
        System.out.println("初始标记...... GC Roots Tracing....");

    }

    private void concurrentMark(){
        System.out.println("\n------------- 2 -----------");
        System.out.println("与用户线程并发执行");
        System.out.println("并发标记.......Objects Tracing....");
    }
    private void remark(){
        System.out.println("\n------------- 3 -----------");
        System.out.println("STW...........");
        System.out.println("重新标记..........Revise Mark....");
    }

    private void concurrentSweep(){
        System.out.println("\n------------- 4 -----------");
        System.out.println("与用户线程一起执行.........");
        System.out.println("并发清除........");
    }

    private void afterGC(){
        System.out.println("\n------------- 5 -----------");
        System.out.println("重置线程.............");
    }



}
