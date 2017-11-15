package com.study.pattern.decorator.decorator;

import com.study.pattern.decorator.WeekendActivity;

/**
 * Created by panyingting on 2017/11/8.
 */
public class WeekendActivityDecorator implements WeekendActivity {

    protected final WeekendActivity activity;

    public WeekendActivityDecorator(WeekendActivity _activity){
        activity = _activity;
    }

    public void activity(){
        activity.activity();
    }

}
