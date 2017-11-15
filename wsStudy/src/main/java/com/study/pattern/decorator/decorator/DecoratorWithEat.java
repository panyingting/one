package com.study.pattern.decorator.decorator;

import com.study.pattern.decorator.WeekendActivity;

/**
 * Created by panyingting on 2017/11/8.
 */
public class DecoratorWithEat extends WeekendActivityDecorator {
    public DecoratorWithEat(WeekendActivity _activity) {
        super(_activity);
    }

    @Override
    public void activity() {
        System.out.println("喝酒之前先垫点东西，免得等会没东西吐...........");
        super.activity();
    }
}
