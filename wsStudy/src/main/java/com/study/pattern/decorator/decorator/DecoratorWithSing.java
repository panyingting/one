package com.study.pattern.decorator.decorator;

import com.study.pattern.decorator.WeekendActivity;

/**
 * Created by panyingting on 2017/11/8.
 */
public class DecoratorWithSing extends WeekendActivityDecorator {

    public DecoratorWithSing(WeekendActivity _activity) {
        super(_activity);
    }

    @Override
    public void activity() {
        super.activity();
        System.out.println("喝完酒之后，是消费的旺盛期，嗨去....");
    }
}
