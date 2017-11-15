package com.study.pattern.decorator;

import com.study.pattern.decorator.decorator.DecoratorWithEat;
import com.study.pattern.decorator.decorator.DecoratorWithSing;

/**
 * Created by panyingting on 2017/11/8.
 */
public class Client {
    public static void main(String[] args) {
        WeekendActivity activity = new DecoratorWithEat( new DecoratorWithSing( new WeekendDrink()));
        activity.activity();
    }
}
