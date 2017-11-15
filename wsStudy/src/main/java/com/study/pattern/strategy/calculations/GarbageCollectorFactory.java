package com.study.pattern.strategy.calculations;

/**
 * Created by panyingting on 2017/11/14.
 */
public class GarbageCollectorFactory {


    public static GarbageCollector newInstance(CollectorType type){
        try{
            GarbageCollector instance = (GarbageCollector)Class.forName(type.getValue()).newInstance();
            return instance;
        }catch(Exception e){
            System.out.println("Exception : "+e);
            return null;
        }
    }


}
