package com.study.pattern.strategy;

import com.study.pattern.strategy.calculations.CollectorType;

/**
 * Created by panyingting on 2017/11/14.
 */
public class Client {

    public static void main(String[] args) {

        GarbageCollectionContext context = new GarbageCollectionContext(CollectorType.CMS);

        context.gc();


    }

}
