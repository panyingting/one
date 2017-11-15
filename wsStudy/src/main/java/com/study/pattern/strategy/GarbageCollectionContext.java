package com.study.pattern.strategy;

import com.study.pattern.strategy.calculations.CollectorType;
import com.study.pattern.strategy.calculations.GarbageCollector;
import com.study.pattern.strategy.calculations.GarbageCollectorFactory;

/**
 * Created by panyingting on 2017/11/14.
 */
public class GarbageCollectionContext {

    private GarbageCollector collector;

    public GarbageCollectionContext( GarbageCollector _collector){
        collector = _collector;
    }

    public GarbageCollectionContext( CollectorType collectorType){
        collector = GarbageCollectorFactory.newInstance(collectorType);
    }

    public void gc(){
        collector.garbageCollection();
    }

}
